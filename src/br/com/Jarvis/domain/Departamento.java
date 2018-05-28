package br.com.Jarvis.domain;

public class Departamento {
	private Long iddepartamento;
	private String nome;
	private String criadopor;
	private String criadoem;
	private String atualizadopor;
	private String atualizadoem;
	private String centrodecusto;

	public Long getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(Long iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCriadopor() {
		return criadopor;
	}

	public void setCriadopor(String criadopor) {
		this.criadopor = criadopor;
	}

	public String getCriadoem() {
		return criadoem;
	}

	public void setCriadoem(String criadoem) {
		this.criadoem = criadoem;
	}

	public String getAtualizadopor() {
		return atualizadopor;
	}

	public void setAtualizadopor(String atualizadopor) {
		this.atualizadopor = atualizadopor;
	}

	public String getAtualizadoem() {
		return atualizadoem;
	}

	public void setAtualizadoem(String atualizadoem) {
		this.atualizadoem = atualizadoem;
	}

	public String getCentrodecusto() {
		return centrodecusto;
	}

	public void setCentrodecusto(String centrodecusto) {
		this.centrodecusto = centrodecusto;
	}

}
