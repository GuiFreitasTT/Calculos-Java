
package calcularsalario;
import entities.Funcionario;
import java.util.Scanner;

public class CalcularSalario {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Funcionario funcionario = new Funcionario();
        System.out.print("entre com o seu nome: ");
        funcionario.nome = sc.nextLine();
        System.out.print("entre com o seu salario: ");
        funcionario.salarioBruto = sc.nextDouble();
        System.out.print("entre com a taxa de imposto: ");
        funcionario.taxa = sc.nextDouble();
        System.out.println(funcionario);
        System.out.println("Qual a porcentagem do salario: ");
        Double porce = sc.nextDouble();
        funcionario.IncreaseSalary(porce);
        System.out.println("Dados atualizados: ");
        System.out.println(funcionario.salarioBruto);
    }
    
}
