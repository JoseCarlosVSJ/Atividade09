package SistemaFuncionario;

public class Gerente extends Colaborador {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularSalarioEBonus() {
        this.bonus = this.salario * 0.20;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nSalário: " + salario +
                "\nTotal: " + (salario + bonus) +
                "\nBônus: " + bonus;
    }
}
