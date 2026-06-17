public class Boleto extends FormaPagamento {
    public Boleto(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento via Boleto");
    }

    @Override
    public String toString() {
        return "Boleto:" + valor;
    }
}
