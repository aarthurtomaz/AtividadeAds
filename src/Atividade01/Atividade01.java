//1.Construa um algoritmo que leia (via teclado) dois números do tipo inteiro,
//calcule o produto entre eles e mostre o resultado.
package Atividade01;

import java.util.Scanner;

public class Atividade01 {
    static void main() {
        int p1 =0;
        int p2 =0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro produto:");
        p1 = scanner.nextInt();

        System.out.println("Digite o segundo produto:");
        p2 = scanner.nextInt();

        System.out.println("a soma dos dois produtos é igual a: "+ p1 * p2);
    }
}
