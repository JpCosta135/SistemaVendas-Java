package Modelo.Pagamento;

public class PagamentoDebito extends Pagamento {

    public PagamentoDebito(double valorPago) {
        super(valorPago);
    }


    @Override
    public void autorizar() {
        System.out.println("Modelo.Pagamento com debito autorizado");
    }
}