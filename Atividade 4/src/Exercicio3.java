/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);

        int N = sc.nextInt();

        for(int i = 0; i < N; i++){
            double a, b, c, media;
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();

            media = (a * 2 + b * 3 + c * 5) / 10;

            System.out.printf("Média: %.1f%n", media);
        }

        sc.close();
    }
}
