abstract class FormaPagamento {
    protected double valor;

    public FormaPagamento(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        }
    }

    public abstract void processar();

    public void exibirComprovante() {
        System.out.println("Pagamento de R$ " + valor + " processado.");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor >= 0) {
            this.valor = valor;
        }
    }
}
