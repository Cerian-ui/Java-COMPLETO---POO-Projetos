//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatr
// casas decimais conforme exemplos.

import java.util.Locale;
import java.util.Scanner;


public class Exercicio2 {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double raio, area, pi;

        pi = 3.14159;
        raio = sc.nextDouble();
        area = pi * raio * raio;

        System.out.printf("Area =%.4f%n ", area);

        sc.close();

    }

}


