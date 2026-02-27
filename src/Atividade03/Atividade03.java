//3.Construa um algoritmo para ler (via teclado) quatro números do tipo inteiro,
//calcular e mostrar a média aritmética entre eles.
package Atividade03;

import java.util.Scanner;

public class Atividade03 {
    static void main() {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("numero 1");
        n1 = scanner.nextInt();

        System.out.println("numero 2");
        n2 = scanner.nextInt();

        System.out.println("numero 3");
        n3 = scanner.nextInt();

        System.out.println("numero 4");
        n4 = scanner.nextInt();

        int soma = n1+n2+n3+n4;

        System.out.println("A soma é: ");
        System.out.println(soma);

        System.out.println("A média aritmética da soma dos numeros é:");
        System.out.println( soma/4);
    }
}
