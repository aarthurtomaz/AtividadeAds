//3.1.O mesmo do exercício 3 só que agora usando números do tipo float
//(com duas casas decimas depois da vírgula (%.2f)).
package Atividade03;

import java.util.Scanner;

public class Atividade03_1 {
    static void main() {
        float n1 = 0f;
        float n2 = 0f;
        float n3 = 0f;
        float n4 = 0f;
        Scanner scanner = new Scanner(System.in);

        System.out.println("numero 1");
        n1 = scanner.nextFloat();
        System.out.println("numero 2");
        n2 = scanner.nextFloat();
        System.out.println("numero 3");
        n3 = scanner.nextFloat();
        System.out.println("numero 4");
        n4 = scanner.nextFloat();

        float soma = n1+n2+n3+n4;

        System.out.printf("A soma é: %.2f\n", soma);
        System.out.printf("A média aritmética da soma dos numeros é: %.2f\n", soma / 4);

    }
}
