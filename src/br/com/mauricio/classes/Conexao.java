package br.com.mauricio.classes;

import br.com.mauricio.interfaces.Banco;

public class Conexao {
	
	private Banco banco;

	public Conexao(Banco mysql) {
		this.banco = mysql;
	}

	public String conectar() {
		return banco.conectar();
	}

}
