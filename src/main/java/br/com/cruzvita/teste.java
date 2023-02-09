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

	}	
}
