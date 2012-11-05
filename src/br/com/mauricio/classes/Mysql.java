package br.com.mauricio.classes;

import br.com.mauricio.interfaces.Banco;

public class Mysql implements Banco {

	@Override
	public String conectar() {
		return "CONEXÃO MYSQL";
	}

}
