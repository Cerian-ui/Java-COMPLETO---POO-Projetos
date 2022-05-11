//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Locale;
import java.util.Scanner;
public class Exercicio4 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int numero, horas;
        double salario, valor;

        numero = sc.nextInt();
        horas = sc.nextInt();
        valor = sc.nextDouble();

        salario = horas * valor;

        System.out.println("NÚMERO: " + numero);
        System.out.printf("SALÁRIO: %.2f%n", salario);

        sc.close();
    }
}
