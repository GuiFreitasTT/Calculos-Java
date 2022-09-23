package javaapplication5;
import java.util.Scanner;

public class CalcularMenorNota {

    public static void main(String[] args) {
        int nota1, nota2, nota3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota numero 1");
        nota1 = sc.nextInt();
        System.out.println("Digite a nota numero 2");
        nota2 = sc.nextInt();
        System.out.println("Digite a nota numero 3");
        nota3 = sc.nextInt();
            if (nota1 < nota2 && nota1 < nota3){
               System.out.println("a menor nota e " + nota1);
            }else{
            if (nota2 < nota1 && nota2 < nota3){
                System.out.println("a menor nota e " + nota2);
            }else{
                System.out.println("a menor nota e :" + nota3);
            }
            
        }
     
    }
    
  }

