package Classes;

public class Boleto extends FormaPagamento{

    public int getDiasPagamento() {
        return diasPagamento;
    }

    private final int diasPagamento = 3;

    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando Pagamento");
        validarPagamento();
    }

    @Override
    public void validarPagamento(){
        System.out.printf("Boleto no valor de criado com sucesso, você tem o prazo de 3 dias para pagamento");
    }

}
