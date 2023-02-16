package br.com.cruzvita;

public class Conta {
	
	public String numConta;
	public Cliente cliente;
	public Banco banco;
	public double saldo = 0;
	//atributos
	
	//construtor
		public Conta(String numConta, Cliente cliente, Banco banco, double saldo) {
		this.numConta = numConta;
		this.cliente = cliente;
		this.banco = banco;
		this.saldo = saldo;
	}
	
	
	
	
	
	
}
