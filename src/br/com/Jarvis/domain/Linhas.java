package br.com.Jarvis.domain;

public class Linhas {
	private Long idlinhas;
	private String numerochip;
	private String numerolinha;
	private String criadopor;
	private String criadoem;
	private String atualizadopor;
	private String atualizadoem;
	private Operadora idoperadora;

	public Long getIdlinhas() {
		return idlinhas;
	}

	public void setIdlinhas(Long idlinhas) {
		this.idlinhas = idlinhas;
	}

	public String getNumerochip() {
		return numerochip;
	}

	public void setNumerochip(String numerochip) {
		this.numerochip = numerochip;
	}

	public String getNumerolinha() {
		return numerolinha;
	}

	public void setNumerolinha(String numerolinha) {
		this.numerolinha = numerolinha;
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

	public Operadora getIdoperadora() {
		return idoperadora;
	}

	public void setIdoperadora(Operadora idoperadora) {
		this.idoperadora = idoperadora;
	}

}
