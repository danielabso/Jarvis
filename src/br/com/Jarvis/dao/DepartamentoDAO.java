package br.com.Jarvis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.Jarvis.domain.Departamento;
import br.com.Jarvis.factory.ConexaoFactory;

public class DepartamentoDAO {
	public void salvar(Departamento d) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO departamento ");
		sql.append("(nome) ");
		sql.append("VALUES (?) ");
		sql.append("(criadopor)");
		sql.append("VALUES (?) ");
		sql.append("(criadoem)");
		sql.append("VALUES (?) ");
		sql.append("(atualizadopor)");
		sql.append("VALUES (?) ");
		sql.append("(atualizadoem)");
		sql.append("VALUES (?) ");
		sql.append("(centrodecusto)");
		sql.append("VALUES (?) ");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, d.getNome());
		comando.setString(2, d.getCriadopor());
		comando.setString(3, d.getCriadoem());
		comando.setString(4, d.getAtualizadopor());
		comando.setString(5, d.getAtualizadoem());
		comando.setString(6, d.getCentrodecusto());
		
		comando.executeUpdate();
	}
	
	public void excluir(Departamento d) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM departamento");
		sql.append("WHERE iddepartamento = ? ");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setLong(1, d.getIddepartamento());
		
		comando.executeUpdate();
		
	}
		
		public void editar(Departamento d) throws SQLException{
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE departamento ");
			sql.append("SET nome = ? ");
			sql.append("SET criadopor = ? ");
			sql.append("SET criadoem = ? ");
			sql.append("SET atualizadopor = ? ");
			sql.append("SET atualizadoem = ? ");
			sql.append("SET centrodecusto = ? ");
			sql.append("WHERE iddepartamento = ? ");
			
			Connection conexao = ConexaoFactory.conectar();
			
			PreparedStatement comando = conexao.prepareStatement(sql.toString());
			comando.setLong(1, d.getIddepartamento());
			comando.setString(2, d.getCriadoem());
			comando.setString(3, d.getCriadoem());
			comando.setString(4, d.getAtualizadopor());
			comando.setString(5, d.getAtualizadoem());
			comando.setString(6, d.getCentrodecusto());
			
			comando.executeUpdate();
			
		}
		
		public Departamento = buscarPorIddepartamento(Departamento d) throws SQLException{
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT iddepartamento, nome, criadopor, criadoem, atualizadopor, atualizadoem, centrodecusto ");
			sql.append("FROM departamento ");
			sql.append("WHERE iddepartamento = ? ");
			
		}
		
		public static void main(String[] args) {
		/*TESTES...*/	
			
		}
		
	}

