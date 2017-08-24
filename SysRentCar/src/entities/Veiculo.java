package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Veiculo {
	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	@Column (nullable = false)
	private String tipo;
	@Column (nullable = false)
	private String marca;
	@Column (nullable = false)
	private String modelo;
	@Column (nullable = false)
	private int ano;
	@Column (nullable = false)
	private String chassi;
	@Column (nullable = false)
	private String placa;
	@Column (nullable = false)
	private String dataRevisao;
	@Column (nullable = false)
	private double valor;
	@OneToOne (mappedBy="veiculo")
	private Locacao locacao;
	
	public Veiculo(){};
	
	public Veiculo(String tipo, String marca, String modelo, int ano, String chassi, String placa, String dataRevisao,
			double valor) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.chassi = chassi;
		this.placa = placa;
		this.dataRevisao = dataRevisao;
		this.valor = valor;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getDataRevisao() {
		return dataRevisao;
	}
	public void setDataRevisao(String dataRevisao) {
		this.dataRevisao = dataRevisao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Locacao getLocacao() {
		return locacao;
	}
	public void setLocacao(Locacao locacao) {
		this.locacao = locacao;
	}
}
