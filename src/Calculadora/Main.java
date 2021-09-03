package Calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float num1;
		float num2;

		try {
			System.out.println("Digite o primeiro numero");

			num1 = teclado.nextFloat();
		} catch (Exception ex) {
			teclado = new Scanner(System.in);
			num1 = 0;
		}

		try {
			System.out.println("Digite o segundo numero");
			num2 = teclado.nextFloat();
		} catch (Exception ex) {
			teclado = new Scanner(System.in);
			num2 = 0;
		}
		Calculadora calc = new Calculadora();
		System.out.printf("A soma é: %.2f", calc.somar(num1, num2));
	}

}
