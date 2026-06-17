public class CartaoCredito extends FormaPagamento implements Cancelavel {
    public CartaoCredito(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento via Cartão de crédito");
    }

    @Override
    public void cancelar() {
        System.out.println("Pagamento no Cartão de crédito cancelado");
    }

    @Override
    public String toString() {
        return "Cartão de Crédito: " + valor;
    }
}
