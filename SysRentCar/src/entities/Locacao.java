package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Locacao {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	@Column (nullable = false)
	private String chassi;
	@Column (nullable = false)
	private String dataInicial;
	@Column (nullable = false)
	private String dataFinal;
	@Column (nullable = false)
	private String cnh;
	@ManyToOne
	private Cliente cliente;
	@OneToOne
	private Veiculo veiculo;
	
	public Locacao(){};
	
	public Locacao(String chassi, String dataInicial, String dataFinal, String cnh) {
		super();
		this.chassi = chassi;
		this.dataInicial = dataInicial;
		this.dataFinal = dataFinal;
		this.cnh = cnh;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getDataInicial() {
		return dataInicial;
	}
	public void setDataInicial(String dataInicial) {
		this.dataInicial = dataInicial;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	public String getCnh() {
		return cnh;
	}
	public void setCnh(String cnh) {
		this.cnh = cnh;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
