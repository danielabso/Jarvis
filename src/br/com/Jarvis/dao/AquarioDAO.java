package br.com.Jarvis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.com.Jarvis.domain.Aquario;
import br.com.Jarvis.factory.ConexaoFactory;

public class AquarioDAO {
	public void salvar(Aquario a) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO aquario ");
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
		comando.setString(1, a.getNome());
		comando.setString(2, a.getCriadopor());
		comando.setString(3, a.getCriadoem());
		comando.setString(4, a.getAtualizadopor());
		comando.setString(5, a.getAtualizadoem());
		
		comando.executeUpdate();
	
	}
	public void excluir(Aquario a) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM aquario ");
		sql.append("WHERE idaquario = ? ");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setLong(1, a.getIdaquario());
	
		comando.executeUpdate();
	}
	
	public void editar(Aquario a) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE aquario ");
		sql.append("SET nome ");
		sql.append("SET criadopor ");
		sql.append("SET criadoem ");
		sql.append("SET atualizadopor ");
		sql.append("SET atualizadoem ");
		sql.append("WHERE idaquario = ? ");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setLong(1, a.getIdaquario());
		comando.setString(2, a.getNome());
		comando.setString(3, a.getCriadopor());
		comando.setString(4, a.getCriadoem());
		comando.setString(5, a.getAtualizadopor());
		comando.setString(6, a.getAtualizadoem());
	
		comando.executeUpdate();
	}
	public Cargo = buscarPorIdaquario(Aquario a) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT idaquario, nome, criadopor, criadoem, atualizadopor, atualizadoem ");
		sql.append("FROM aquario ");
		sql.append("WHERE idaquario = ? ");
	}
	public static void main(String[] args) {
		/*Teste Salvar Aquario*/
	}
}