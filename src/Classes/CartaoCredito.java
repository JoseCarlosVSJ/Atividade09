package Classes;

public class CartaoCredito extends FormaPagamento{
    String numCartao;
    int numParcelas;
    double limite;

    public CartaoCredito(String numCartao, int numParcelas, double limite) {
        this.numCartao = numCartao;
        this.numParcelas = numParcelas;
        this.limite = limite;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public int getNumParcelas() {
        return numParcelas;
    }

    public void setNumParcelas(int numParcelas) {
        this.numParcelas = numParcelas;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void processarPagamento(double valor){
        System.out.println("Processando Pagamento");
        if (valor < 50){
            System.out.println("Pagamento no cartão, apenas para compra acima de 50 reais");
        }
        else if (limite < valor){
            System.out.println("Valor do limite inferior a compra");
        }
        else if (numParcelas > 12){
            System.out.println("O máximo de parcelas são 12 vezes");
        }

        else {
            this.setLimite(limite - valor);
            System.out.printf("O valor de %.2f foi processado, serão parcelas de %.2f\n", valor, valor / numParcelas);
            validarPagamento();
        }
    }

    @Override
    public void validarPagamento(){
        System.out.println("Compra no cartão realizada com sucesso");
    }

    @Override
    public String toString() {
        return "CartaoCredito{" +
                "numCartao='" + numCartao + '\'' +
                ", numParcelas=" + numParcelas +
                ", limite=" + limite +
                '}';
    }
}
