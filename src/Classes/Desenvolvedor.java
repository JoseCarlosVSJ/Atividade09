package Classes;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, float salario) {
        super(nome, salario);
    }

    public void calcularBonus(){
        System.out.println(this.salario * 0.1);
    }

    @Override
    public void trabalhar() {
        System.out.println("Fazendo Programa!");
    }
}
