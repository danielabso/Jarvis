package br.com.Jarvis.domain;

public class Estoque {
	private Long idestoque;
	private String nome;
	private String endereco;
	private String criadopor;
	private String criadoem;
	private String atualizadopor;
	private String atualizadoem;

	public Long getIdestoque() {
		return idestoque;
	}

	public void setIdestoque(Long idestoque) {
		this.idestoque = idestoque;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
