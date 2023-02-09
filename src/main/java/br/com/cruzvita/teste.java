package br.com.cruzvita;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Banco banco = new Banco();
		// System.out.println(a.imprimir());

		Cliente cliente = new Cliente();
		// System.out.println(b.cliente());

		Conta conta = new Conta();
		// System.out.println(c.Conta());

		System.out.println("Digite o nome do Banco:");
		banco.nomeBanco = teclado.next();
		System.out.println("O banco inserido foi: " + banco.nomeBanco);

		teclado.nextLine();

		System.out.println("Digite a modalidade da conta, sendo Conta Poupanca ou Conta Corrente");
		conta.tipoDeConta = teclado.nextLine();
		while (!conta.tipoDeConta.equalsIgnoreCase("Conta Poupanca") && !conta.tipoDeConta.equalsIgnoreCase("Conta Corrente")) {
			System.out.println("Modalidade inválida. Por favor, digite novamente:");
			conta.tipoDeConta = teclado.nextLine();
		}

		System.out.println("Escreva seu nome:");
		cliente.nome = teclado.nextLine();

		System.out.println("Escreva sua idade:");
		cliente.idade = teclado.nextInt();
		System.out.println("O nome inserido foi " + cliente.nome + ", onde o mesmo possui " + cliente.idade + " anos.");
	}
 }

