package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Endereco {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	@Column (nullable = false)
	private String rua;
	@Column (nullable = false)
	private String bairro;
	@Column (nullable = false)
	private String numero;
	private String comp;
	private String cep;
	@Column (nullable = false)
	private String cidade;
	@Column (nullable = false)
	private String uf;
	@OneToOne
	private Cliente cliente;
	
	public Endereco(){};
	
	public Endereco(String rua, String bairro, String numero, String comp, String cep, String cidade, String uf) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.comp = comp;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComp() {
		return comp;
	}

	public void setComp(String comp) {
		this.comp = comp;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
