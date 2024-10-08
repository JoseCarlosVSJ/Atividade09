package SistemaFuncionario;

public class Desenvolvedor extends Colaborador {

    private String nivelSenioridade = "Junior"; // Define a senioridade padrão como Junior

    public Desenvolvedor(String nome, double salario, int nivelSenioridade) {
        super(nome, salario);
        this.nivelSenioridade = definirCargo(nivelSenioridade); // Atribui o nível de senioridade com base no número
    }

    // Método para definir a senioridade com base no número fornecido
    public static String definirCargo(int nivelSenioridade) {
        switch (nivelSenioridade) {
            case 1:
                return "Junior";
            case 2:
                return "Pleno";
            case 3:
                return "Senior";
            default:
                throw new IllegalArgumentException("Nível de senioridade inválido. Deve ser 1 (Junior), 2 (Pleno) ou 3 (Senior).");
        }
    }

    @Override
    public void calcularSalarioEBonus() {
        // Desenvolvedor ganha 10% de bônus
        this.bonus = this.salario * 0.10;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nSalário: " + salario +
                "\nBônus: " + bonus +
                "\nTotal: " + (salario + bonus) +
                "\nSenioridade: " + nivelSenioridade;
    }
}