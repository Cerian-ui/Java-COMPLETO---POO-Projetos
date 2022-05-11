/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um número");
        x = sc.nextInt();

        if (x<0){
            System.out.println("O número é negativo");
        }
        else{
            System.out.println("O número é positivo");
        }

        sc.close();

    }
}
