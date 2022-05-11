//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int cod1, cod2, quantidade1, quantidade2;
        double valor1, valor2, total;

        cod1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valor1 = sc.nextDouble();

        cod2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valor2 = sc.nextDouble();

        total = quantidade1 * valor1 + quantidade2 * valor2;

        System.out.printf("Valor total a pagar: %.2f%n", total);

        sc.close();

    }
}
