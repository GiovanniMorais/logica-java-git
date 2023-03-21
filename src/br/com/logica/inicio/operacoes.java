package br.com.logica.inicio;

import java.util.Scanner;

public class operacoes {

	public static void main(String[] args) {

		//Vamos declarar 2 variaveis pra realizar calculos
		int n1;
		int n2;
		int soma, multiplicar, subtrair, dividir;
		
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Diigte um numero: ");
		 n1 = input.nextInt();
		 
		 System.out.println("Digite outro numero");
		 n2 = input.nextInt();
		 
		 soma = n1 + n2;
		 multiplicar = n1 * n2;
		 subtrair = n1 - n2;
		dividir = n1 / n2;
		
		System.out.println("O resultado da soma e: " + soma);
		System.out.println("O resultado da multipliçao e: " + multiplicar);
		System.out.println("O resultado da subtraçao e: " + subtrair);
		System.out.println("O resultado da divisao e:" + dividir);
	}

}
