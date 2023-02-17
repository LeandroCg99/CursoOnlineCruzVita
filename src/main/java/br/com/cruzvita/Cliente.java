package br.com.cruzvita;

public class Cliente {
	
	public String nome;
	public int idade;
	public String cpf;
//public = modificador de acesso 
	//String, Integer, Boolean = tipo de retorno
	
	//construtor
	public String getNome() {
		return nome;
	}
	
	public int idade() {
		return idade;
	}
	
	public String cpf() {
		return cpf;
	}
}