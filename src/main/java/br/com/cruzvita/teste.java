package br.com.cruzvita;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Banco a = new Banco();
		System.out.println(a.imprimir());
		
		Cliente b = new Cliente();
		System.out.println(b.cliente());
		
		Conta c = new Conta();
		System.out.println(c.Conta());
		
		System.out.println("Escreva seu nome:");
		c.nome = teclado.nextLine();
		System.out.println("Escreva sua idade:");
		c.idade = teclado.nextInt();
		System.out.println("O nome inserido foi "+ c.nome);
		System.out.println("A idade inserida foi "+ c.idade);
	}
	

}
