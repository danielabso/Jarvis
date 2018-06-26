package br.com.Jarvis.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	private static final String URL = "jdbc:mysql://localhost/Jarvis";
	
	public static Connection conectar() throws SQLException {
		Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
		return conexao;
	}
	
	public static void main(String[] args) {
		try {
		Connection conexao = ConexaoFactory.conectar();
		System.out.println("Conex�o realizada com sucesso!");
		} catch(SQLException ex) {
			ex.printStackTrace();
			System.out.println("N�o foi possivel realizar a conex�o!");
		}
	}
}
