package br.com.Jarvis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.Jarvis.domain.Cargo;
import br.com.Jarvis.factory.ConexaoFactory;

public class CargoDAO {
	public void salvar(Cargo c) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO cargo ");
		sql.append("(nome) ");
		sql.append("VALUES (?)");
		sql.append("(criadopor) ");
		sql.append("VALUES (?)");
		sql.append("(criadoem) ");
		sql.append("VALUES (?)");
		sql.append("(atualizadopor) ");
		sql.append("VALUES (?)");
		sql.append("(atualizadoem) ");
		sql.append("VALUES (?)");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, c.getNome());
		comando.setString(2, c.getCriadopor());
		comando.setString(3, c.getCriadoem());
		comando.setString(4, c.getAtualizadopor());
		comando.setString(5, c.getAtualizadoem());
		
		comando.executeUpdate();
	}
	
	public void excluir(Cargo c) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM cargo ");
		sql.append("WHERE idcargo = ? ");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setLong(1, c.getIdcargo());
		
		comando.executeUpdate();
		
	}
	
		public void editar(Cargo c) throws SQLException {
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE cargo ");
			sql.append("SET nome ");
			sql.append("SET criadopor ");
			sql.append("SET criadoem ");
			sql.append("SET atualizadopor ");
			sql.append("SET atualizadoem ");
			sql.append("WHERE idcargo = ? ");
		
			Connection conexao = ConexaoFactory.conectar();
			
			PreparedStatement comando = conexao.prepareStatement(sql.toString());
			comando.setLong(1, c.getIdcargo());
			comando.setString(2, c.getNome());
			comando.setString(3, c.getCriadopor());
			comando.setString(4, c.getCriadoem());
			comando.setString(5, c.getAtualizadopor());
			comando.setString(6, c.getAtualizadoem());
		
			comando.executeUpdate();
		}
		
		public Cargo = buscarPorIdcargo(Cargo c) throws SQLException{
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT idcargo, nome, criadopor, criadoem, atualizadopor, atualizadoem ");
			sql.append("FROM cargo ");
			sql.append("WHERE idcargo = ? ");
		}
		public static void main(String[] args) {
			/*Teste Salvar fabricante*/
	}
}
