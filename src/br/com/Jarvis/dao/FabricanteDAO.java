package br.com.Jarvis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.Jarvis.domain.Fabricante;
import br.com.Jarvis.factory.ConexaoFactory;

public class FabricanteDAO {
	public void salvar(Fabricante f) throws SQLException {
		StringBuilder sql = new StringBuilder();
		sql.append("INSERT INTO fabricante ");
		sql.append("(marca) ");
		sql.append("VALUES (?)");
		sql.append("(modelo) ");
		sql.append("VALUES (?)");
		sql.append("(tipo) ");
		sql.append("VALUES (?)");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setString(1, f.getMarca());
		comando.setString(2, f.getModelo());
		comando.setString(3, f.getTipo());
		
		comando.executeUpdate();
	}
	
	public void excluir(Fabricante f) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("DELETE FROM fabricante ");
		sql.append("WHERE idfabricante = ? ");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setLong(1, f.getIdfabricante());
		
		comando.executeUpdate();
	}
	
	public void editar(Fabricante f) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE fabricante ");
		sql.append("SET marca = ? ");
		sql.append("SET modelo = ? ");
		sql.append("SET tipo = ? ");
		sql.append("WHERE idfabricante = ?");
		
		Connection conexao = ConexaoFactory.conectar();
		
		PreparedStatement comando = conexao.prepareStatement(sql.toString());
		comando.setLong(1, f.getIdfabricante());
		comando.setString(2, f.getMarca());
		comando.setString(3, f.getModelo());
		comando.setString(4, f.getTipo());
		
		comando.executeUpdate();
	}
	
	public Fabricante = buscarPorIdfabricante(Fabricante f) throws SQLException{
		StringBuilder sql = new StringBuilder();
		sql.append("SELECT idfabricante, marca, modelo, tipo ");
		sql.append("FROM fabricante ");
		sql.append("WHERE idfabricante = ? ");
	}
	
	public static void main(String[] args) {
		/*Teste Salvar fabricante*/
	/*	Fabricante f1 = new Fabricante();
		f1.setMarca("Marca 1");
		f1.setModelo("Modelo 1");
		f1.setTipo("Tipo 1");
		
		FabricanteDAO fdao = new FabricanteDAO();
		
		try {
			fdao.salvar(f1);
			System.out.println("Os fabricantes foram salvos com sucesso!");
		} catch (SQLException e) {
			
			System.out.println("Ocorreu um erro ao tentar salvar um dos fabricantes!");
			e.printStackTrace();
			}
		
		/*Teste Excluir Fabricante*/
		/*
		Fabricante f1 = new Fabricante();
		f1.setIdfabricante(2L);
		
		FabricanteDAO fdao = new FabricanteDAO();
		
		try {
			fdao.excluir(f1);
			System.out.println("O fabricante foi removido com sucesso!");
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao excluir o fabricante!");
			e.printStackTrace();
		}
		
		Fabricante f1 = new Fabricante();
		f1.setIdfabricante(2L);
		f1.setMarca("HP");
		f1.setModelo("Pro Book");
		f1.setTipo("Notebook");
		
		FabricanteDAO fdao = new FabricanteDAO();
		
		try {
			fdao.editar(f1);
			System.out.println("O fabricante editado com sucesso!");
		} catch (SQLException e) {
			System.out.println("Ocorreu um erro ao tentar editar o fabricante!");
			e.printStackTrace();
		}*/
		
	}
}
