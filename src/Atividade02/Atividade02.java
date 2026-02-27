//2. Construa um algoritmo que leia (via teclado) três números do tipo inteiro,
//calcule e mostre a soma deles.
package Atividade02;

import java.util.Scanner;

public class Atividade02 {
    static void main() {
        int n1 = 0;
        int n2 = 0;
        int n3 = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("numero 1:");
        n1 = scanner.nextInt();

        System.out.println("numero 2: ");
        n2 = scanner.nextInt();

        System.out.println("numero 3: ");
        n3 = scanner.nextInt();

        //perguntar pq a soma junto da frase não da certo
        System.out.println("a soma dos 3 numeros dados é:");
        System.out.println(n1+n2+n3);
    }
}
