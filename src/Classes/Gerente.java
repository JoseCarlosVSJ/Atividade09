package Classes;

public class Gerente extends Funcionario{
    public Gerente(String nome, float salario) {
        super(nome, salario);
    }

    public void calcularBonus(){
        System.out.println(this.salario * 0.2);
    }

    @Override
    public void trabalhar() {
        System.out.println("Gerenciando!");
    }
}
