package br.com.Jarvis.domain;

public class Cargo {
	private Long idcargo;
	private String nome;
	private String criadopor;
	private String criadoem;
	private String atualizadopor;
	private String atualizadoem;

	public Long getIdcargo() {
		return idcargo;
	}

	public void setIdcargo(Long idcargo) {
		this.idcargo = idcargo;
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

}
