package Classes;

public abstract class FormaPagamento{
    public void processarPagamento(double valor){
        System.out.println("Processando Pagamento");
    }

    public void validarPagamento(){
        System.out.println("Processando...");
    }
}
