package SistemaFuncionario;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Colaborador> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Quezia", 8000));
        funcionarios.add(new Desenvolvedor("Jose", 25000, 3));
        funcionarios.add(new Estagiario("Kevin", 1200));

        calcularFolhaPagamento(funcionarios);
    }

    public static void calcularFolhaPagamento(ArrayList<Colaborador> funcionarios) {
        double totalSalarios = 0;
        double totalBonus = 0;

        for (Colaborador func : funcionarios) {
            func.calcularSalarioEBonus();
            totalSalarios += func.getSalario();
            totalBonus += func.getBonus();

            System.out.println(func.toString());
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        }

        System.out.println("Total de salários: " + totalSalarios);
        System.out.println("Total de bônus: " + totalBonus);
    }
}
