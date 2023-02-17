package br.com.cruzvita;

import java.util.Scanner;

public class teste {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		double saldoTransf = scanner.nextDouble();

//essa linha inteira é um objeto, banco (poderia ser qualquer nome) é uma variavel
		Banco banco = new Banco();
		Cliente cliente = new Cliente();
		Conta conta = new Conta();

		System.out.println("Bem vindo ao " + banco.nomeBanco());
		System.out.println("Realize a criação da sua nova conta:");
		System.out.println("Nome:");
		String nome = scanner.nextLine();
		System.out.println("Idade:");
		int idade = scanner.nextInt();
		System.out.println("CPF:");
		String cpf = scanner.nextLine();

		scanner.nextLine();

		System.out.println("-----Conta criada com sucesso!-----");
		System.out.println(nome);
		System.out.println("Agencia: " + conta.numAgencia + " Conta: " + conta.numConta);
		System.out.println("Saldo:" + conta.saldo);

		int opcao = 0;
		while (opcao != 4) {
			System.out.println("-----------------------------------");
			System.out.println("Cruz Vita Bank");
			System.out.println("1. Deposito");
			System.out.println("2. Saque");
			System.out.println("3. Transferencia");
			System.out.println("4. Sair");
			System.out.println("-----------------------------------");
			opcao = scanner.nextInt();

			if (opcao == 1) {
				System.out.println("Selecionada a opcao Deposito. Digite a quantia que deseja depositar:");
				double valorDeposito = scanner.nextDouble();
				System.out.println("Deposito de R$" + valorDeposito + " recebido");
				conta.depositar(valorDeposito);
				System.out.println("Saldo atualizado: " + conta.saldo);

			} else if (opcao == 2) {
				System.out.println("Selecionada a opcao Saque. Digite a quantia que deseja sacar:");
				double valorSaque = scanner.nextDouble();
				conta.sacar(valorSaque);
				System.out.println("Saque realizado, valor atual de: " + conta.saldo);

			} else if (opcao == 3) {
				System.out.println("Selecionada a opcao Transferencia. Digite a quantia que deseja transferir:");
				double valorTransf = scanner.nextDouble();
				//conta.transferir(valorTransf, conta, conta);
				System.out.println("Transferencia realizada, valor atual de: " + conta.saldo);

			} else if (opcao == 4){
				System.out.println("Programa finalizado");
				
			}else {
				System.out.println("Opcao invalida!");
			}

		}

	}
}
