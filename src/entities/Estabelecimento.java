package entities;

public class Estabelecimento {

	private Integer idEstabeleciemento;
	private String nome;
	private String cnpj;

	public Estabelecimento() {
		// TODO Auto-generated constructor stub
	}

	public Estabelecimento(Integer idEstabeleciemento, String nome, String cnpj) {
		super();
		this.idEstabeleciemento = idEstabeleciemento;
		this.nome = nome;
		this.cnpj = cnpj;
	}

	public Integer getIdEstabeleciemento() {
		return idEstabeleciemento;
	}

	public void setIdEstabeleciemento(Integer idEstabeleciemento) {
		this.idEstabeleciemento = idEstabeleciemento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "Estabelecimento [idEstabeleciemento=" + idEstabeleciemento + ", nome=" + nome + ", cnpj=" + cnpj + "]";
	}
	
	

}
