package br.com.logica.inicio;

import java.util.Scanner;

public class desconto {

	public static void main(String[] args) {

		double preco, taxa, valor, total;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o preço do prodto: ");
		preco = entrada.nextDouble();
		
		System.out.println("DIgite a taxa de desconto em o simbolo de %: ");
		taxa = entrada.nextDouble();
		
		valor = preco * (taxa / 100);
		
		System.out.println("O valor de desconto e: "+ valor)
		System.out.println("O valor final e: "+total);
		
	}

}
