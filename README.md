# Sistema de Pagamentos - Java POO

Mini projeto desenvolvido para praticar conceitos de Programação Orientada a Objetos em Java, simulando o processamento de diferentes formas de pagamento (Pix, Cartão de Crédito e Boleto).

## Conceitos aplicados

- **Classe abstrata**: `FormaPagamento` define um contrato comum (`processar()`) que cada forma de pagamento implementa à sua maneira, além de comportamento já implementado e reaproveitado por todas (`exibirComprovante()`).
- **Herança**: `Pix`, `CartaoCredito` e `Boleto` estendem `FormaPagamento`, reaproveitando o atributo `valor` e os métodos `exibirComprovante()`, `getValor()` e `setValor()`.
- **Polimorfismo**: uma `List<FormaPagamento>` é percorrida chamando `processar()` em cada item, executando a implementação específica de cada subclasse sem necessidade de verificação de tipo.
- **Interface**: `Cancelavel` é implementada apenas por `Pix` e `CartaoCredito`, já que `Boleto` não pode ser cancelado após gerado. Isso permite que tipos sem relação de herança entre si compartilhem uma capacidade comum.
- **Encapsulamento**: o atributo `valor` é `protected`, validado no construtor e no `setValor()` para nunca aceitar valores negativos, com acesso de leitura controlado via `getValor()`.

## Estrutura do projeto

```
formaPagamento/
├── FormaPagamento.java   # Classe abstrata base
├── Pix.java              # Implementa FormaPagamento e Cancelavel
├── CartaoCredito.java    # Implementa FormaPagamento e Cancelavel
├── Boleto.java           # Implementa apenas FormaPagamento
├── Cancelavel.java       # Interface com o contrato cancelar()
└── Main.java             # Ponto de entrada, demonstra o uso das classes
```

## Diagrama de classes

```
FormaPagamento (abstract)
 ├── valor: double
 ├── processar(): void [abstract]
 ├── exibirComprovante(): void
 ├── getValor(): double
 └── setValor(valor: double): void
        ▲
        │ extends
   ┌────┴────┬─────────────┐
  Pix   CartaoCredito   Boleto

Cancelavel (interface)
 └── cancelar(): void
        ▲
        │ implements
   ┌────┴────┐
  Pix   CartaoCredito
```

## Como executar

```bash
javac Main.java
java Main
```

## Saída esperada

```
Processando pagamento via PIX
Processando pagamento via Cartão de Crédito
Processando pagamento via Boleto
Pagamento no PIX cancelado
Pagamento no cartão cancelado
```

## Aprendizados

Este projeto foi construído de forma incremental, requisito por requisito, com foco em entender o *porquê* de cada conceito antes de aplicá-lo:

- A diferença entre método **abstrato** (contrato, sem implementação) e método **concreto** (implementação pronta e reaproveitada).
- Quando usar **classe abstrata** (subclasses compartilham código comum) versus **interface** (capacidade comum entre tipos sem parentesco).
- A importância de validar dados **antes** de atribuí-los a um atributo, tanto no construtor quanto no setter.
- Como o `instanceof` permite checar em tempo de execução se um objeto implementa uma interface específica antes de fazer o cast.

