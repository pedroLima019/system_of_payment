public class Pix extends FormaPagamento implements Cancelavel {

    public Pix(double valor) {
        super(valor);
    }

    @Override
    public void processar() {
        System.out.println("Processando pagamento via PIX");
    }

    @Override
    public void cancelar() {
        System.out.println("Pagamento no PIX cancelado");
    }

    @Override
    public String toString() {
        return "PIX: " + valor;
    }
}
