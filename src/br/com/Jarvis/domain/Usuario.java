package br.com.Jarvis.domain;

public class Usuario {
	private Long idusuario;
	private String username;
	private String senha;
	private String criadopor;
	private String criadoem;
	private String atualizadopor;
	private String atualizadoem;
	private Pessoa idpessoa;

	public Long getIdusuario() {
		return idusuario;
	}

	public void setIdusuario(Long idusuario) {
		this.idusuario = idusuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
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

	public Pessoa getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(Pessoa idpessoa) {
		this.idpessoa = idpessoa;
	}

}
