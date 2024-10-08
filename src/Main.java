import Classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        Produto p1 = new Produto("Sabao",10,5);
        p1.aplicarDesconto(0.5);
        System.out.println(p1.getPreco());
        Carro c1 = new Carro();
        c1.acelerar();
        Trem t1 = new Trem();
        t1.acelerar();

        CartaoCredito cartao1 = new CartaoCredito("123",2,1000);
        cartao1.processarPagamento(500);
        System.out.printf("Limite do cartão é %.2f \n",cartao1.getLimite());
        cartao1.processarPagamento(600);
        Boleto boleto1 = new Boleto();
        boleto1.processarPagamento(300);
    }
}