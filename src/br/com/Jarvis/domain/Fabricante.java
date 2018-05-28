package br.com.Jarvis.domain;

public class Fabricante {
	private Long idfabricante;
	private String marca;
	private String modelo;
	private String tipo;

	public Long getIdfabricante() {
		return idfabricante;
	}

	public void setIdfabricante(Long idfabricante) {
		this.idfabricante = idfabricante;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
