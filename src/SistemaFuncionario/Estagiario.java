package SistemaFuncionario;

public class Estagiario extends Colaborador {

    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularSalarioEBonus() {
        this.bonus = 0;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nSalário: " + salario;
    }
}

