package entities;

import java.util.List;

public class Profissional {
	
	private Integer idProfissional;
	private String nome;
	private String telefone;
	private Estabelecimento estabelecimento;//ter 1(associaçao)
	private List<Servico> servico;
	
	public Profissional() {
		// TODO Auto-generated constructor stub
	}

	public Profissional(Integer idProfissional, String nome, String telefone, Estabelecimento estabelecimento,
			List<Servico> servico) {
		super();
		this.idProfissional = idProfissional;
		this.nome = nome;
		this.telefone = telefone;
		this.estabelecimento = estabelecimento;
		this.servico = servico;
	}

	public Integer getIdProfissional() {
		return idProfissional;
	}

	public void setIdProfissinal(Integer idProfissional) {
		this.idProfissional = idProfissional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public List<Servico> getServico() {
		return servico;
	}

	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}

	@Override
	public String toString() {
		return "Profissional [idProfissinal=" + idProfissional + ", nome=" + nome + ", telefone=" + telefone
				+ ", estabelecimento=" + estabelecimento + ", servico=" + servico + "]";
	}
	
	

}
