package Classes;

public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(String nome, float preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        if (preco < 0) {
            setPreco(0);
        }
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (preco < 0) {
            setQuantidade(0);
        }
        this.quantidade = quantidade;
    }

    public void aplicarDesconto(double porcentagem){
        if (porcentagem > 0.5){
            System.out.println("Desconto não aplicado, digite um desconto menor que 50%");
        }
        else {
            setPreco((float) ((1 - porcentagem) * this.preco));
        }
    }
}
