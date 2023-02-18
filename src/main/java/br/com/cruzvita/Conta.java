package br.com.cruzvita;

public class Conta {

	public String numConta = "1234567-8";
	public int numAgencia = 1234;
	public Cliente cliente;
	public Banco banco;
	public double saldo = 0;
	// atributos

//	public void setNumConta(String numConta) {
//		this.numConta = numConta;
//	}

	public Cliente Cliente() {
		return cliente;
	}

	public void Cliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Banco Banco() {
		return banco;
	}

	public void Banco(Banco banco) {
		this.banco = banco;
	}

	public double Saldo() {
		return saldo;
	}

	public void depositar(double valorDeposito) {
		saldo = saldo + valorDeposito;
	}

	public void sacar(double valorSaque) {
		saldo = saldo - valorSaque;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

}