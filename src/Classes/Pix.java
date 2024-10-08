package Classes;

public class Pix extends FormaPagamento{

    double saldo;

    public Pix(double valor, double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando Pagamento");

        if (saldo < valor){
            System.out.println("Saldo insuficiente");
        }

        else {
            setSaldo(saldo - valor);
        }

        validarPagamento();
    }

    @Override
    public void validarPagamento(){
        System.out.println("Pagamento no pix realizado com sucesso!");
    }

}
