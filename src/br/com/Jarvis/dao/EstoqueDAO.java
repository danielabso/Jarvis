package br.com.Jarvis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.Jarvis.domain.Aquario;
import br.com.Jarvis.domain.Estoque;
import br.com.Jarvis.factory.ConexaoFactory;

public class EstoqueDAO {

		public void salvar(Estoque e) throws SQLException{
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO estoque ");
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
			comando.setString(1, e.getNome());
			comando.setString(2, e.getCriadopor());
			comando.setString(3, e.getCriadoem());
			comando.setString(4, e.getAtualizadopor());
			comando.setString(5, e.getAtualizadoem());
			
			comando.executeUpdate();
		
		}
		public void excluir(Estoque e) throws SQLException {
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM estoque ");
			sql.append("WHERE idestoque = ? ");
			
			Connection conexao = ConexaoFactory.conectar();
			
			PreparedStatement comando = conexao.prepareStatement(sql.toString());
			comando.setLong(1, e.getIdestoque());
		
			comando.executeUpdate();
		}
		public void editar(Estoque e) throws SQLException{
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE estoque ");
			sql.append("SET nome ");
			sql.append("SET criadopor ");
			sql.append("SET criadoem ");
			sql.append("SET atualizadopor ");
			sql.append("SET atualizadoem ");
			sql.append("WHERE idaquario = ? ");
			
			Connection conexao = ConexaoFactory.conectar();
			
			PreparedStatement comando = conexao.prepareStatement(sql.toString());
			comando.setLong(1, e.getIdestoque());
			comando.setString(2, e.getNome());
			comando.setString(3, e.getCriadopor());
			comando.setString(4, e.getCriadoem());
			comando.setString(5, e.getAtualizadopor());
			comando.setString(6, e.getAtualizadoem());
		
			comando.executeUpdate();
		}
		public Estoque = buscarPorIdestoque(Estoque e) throws SQLException{
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT idestoque, nome, criadopor, criadoem, atualizadopor, atualizadoem ");
			sql.append("FROM estoque ");
			sql.append("WHERE idestoque = ? ");
		}
		public static void main(String[] args) {
			/*Teste Salvar estoque*/
		
		}
}