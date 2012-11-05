package br.com.mauricio.classes;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mauricio.interfaces.Banco;

public class BancoTest {
	
	private Conexao conexao;

	@Test
	public void deveConectarComMysql() {
		Banco mysql = new Mysql();
		conexao = new Conexao(mysql);
		
		assertEquals("CONEXÃO MYSQL", conexao.conectar());
	}
	
	@Test
	public void deveConectarComOracle() {
		Banco oracle = new Oracle();
		conexao = new Conexao(oracle);
		
		assertEquals("CONEXÃO ORACLE", conexao.conectar());
	}
	
	@Test
	public void deveConectarComAcess() {
		Banco acess = new Acess();
		conexao = new Conexao(acess);
		
		assertEquals("CONEXÃO ACESS", conexao.conectar());
	}

}
