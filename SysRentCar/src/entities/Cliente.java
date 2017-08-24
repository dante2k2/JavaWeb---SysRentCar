package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private long id;
	@Column (nullable = false)
	private String nome;
	@Column (nullable = false)
	private int rg;
	@Column (nullable = false, unique = true)
	private String cpf;
	@Column (nullable = false)
	private String cnh;
	@Column (nullable = false)
	private int telefone;
	private String email;
	@OneToOne (mappedBy="cliente")
	private Endereco endereco;
	
	public Cliente(){};
	
	public Cliente(String nome, int rg, String cpf, String cnh, int telefone, String email, Endereco endereco) {
		super();
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
		this.cnh = cnh;
		this.telefone = telefone;
		this.email = email;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
