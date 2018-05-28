package br.com.Jarvis.domain;

public class Pessoa {
	private Long idpessoa;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	private String telefone2;
	private String cargo;
	private String cadastradopor;
	private String cadastradoem;
	private String atualizadopor;
	private String atualizadoem;
	private Departamento iddepartamento;
	private Cargo idcargo;
	private Aquario idaquario;

	public Long getIdpessoa() {
		return idpessoa;
	}

	public void setIdpessoa(Long idpessoa) {
		this.idpessoa = idpessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getCadastradopor() {
		return cadastradopor;
	}

	public void setCadastradopor(String cadastradopor) {
		this.cadastradopor = cadastradopor;
	}

	public String getCadastradoem() {
		return cadastradoem;
	}

	public void setCadastradoem(String cadastradoem) {
		this.cadastradoem = cadastradoem;
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

	public Departamento getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(Departamento iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public Cargo getIdcargo() {
		return idcargo;
	}

	public void setIdcargo(Cargo idcargo) {
		this.idcargo = idcargo;
	}

	public Aquario getIdaquario() {
		return idaquario;
	}

	public void setIdaquario(Aquario idaquario) {
		this.idaquario = idaquario;
	}

}
