package SistemaFuncionario;

public abstract class Colaborador {
    protected String nome;
    protected double salario;
    protected double bonus;

    public Colaborador(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double getBonus() {
        return bonus;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public abstract void calcularSalarioEBonus();
}
