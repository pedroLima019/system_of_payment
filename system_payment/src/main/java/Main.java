import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FormaPagamento banco01 = new Pix(100);
        FormaPagamento banco02 = new CartaoCredito(300);
        FormaPagamento banco03 = new Boleto(50);

        List<FormaPagamento> pagamentos = new ArrayList<>();
        pagamentos.add(banco01);
        pagamentos.add(banco02);
        pagamentos.add(banco03);

        for (FormaPagamento pagamento : pagamentos) {
            pagamento.processar();
        }

        for (FormaPagamento pagamento : pagamentos) {
            if (pagamento instanceof Cancelavel) {
                Cancelavel c = (Cancelavel) pagamento;
                c.cancelar();
            }
        }
    }
}
