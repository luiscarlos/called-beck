package br.com.lc.called.model;

import java.time.LocalDate;
import java.util.Objects;

import br.com.lc.called.model.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

@Entity
public class Chamado {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private LocalDate dataAbertura = LocalDate.now();
	
	private LocalDate dataFechamento;
	
	private String roteiro;
	private String resultadoObtido;
	private String resultadoEsperado;
	private String titulo;
	private Status status;
	
	@Lob
    private byte[] foto;
	
	private Desenvolvedor desenvolvedor;
	private AnalistaQualidade analistaQualidade;
	
	
	
	public Chamado() {
		super();
	}



	public Chamado(Integer id, String roteiro, String resultadoObtido, String resultadoEsperado, String titulo,
			Status status, byte[] foto, Desenvolvedor desenvolvedor, AnalistaQualidade analistaQualidade) {
		super();
		this.id = id;
		this.roteiro = roteiro;
		this.resultadoObtido = resultadoObtido;
		this.resultadoEsperado = resultadoEsperado;
		this.titulo = titulo;
		this.status = status;
		this.foto = foto;
		this.desenvolvedor = desenvolvedor;
		this.analistaQualidade = analistaQualidade;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public LocalDate getDataAbertura() {
		return dataAbertura;
	}



	public void setDataAbertura(LocalDate dataAbertura) {
		this.dataAbertura = dataAbertura;
	}



	public LocalDate getDataFechamento() {
		return dataFechamento;
	}



	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}



	public String getRoteiro() {
		return roteiro;
	}



	public void setRoteiro(String roteiro) {
		this.roteiro = roteiro;
	}



	public String getResultadoObtido() {
		return resultadoObtido;
	}



	public void setResultadoObtido(String resultadoObtido) {
		this.resultadoObtido = resultadoObtido;
	}



	public String getResultadoEsperado() {
		return resultadoEsperado;
	}



	public void setResultadoEsperado(String resultadoEsperado) {
		this.resultadoEsperado = resultadoEsperado;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public Status getStatus() {
		return status;
	}



	public void setStatus(Status status) {
		this.status = status;
	}



	public byte[] getFoto() {
		return foto;
	}



	public void setFoto(byte[] foto) {
		this.foto = foto;
	}



	public Desenvolvedor getDesenvolvedor() {
		return desenvolvedor;
	}



	public void setDesenvolvedor(Desenvolvedor desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}



	public AnalistaQualidade getAnalistaQualidade() {
		return analistaQualidade;
	}



	public void setAnalistaQualidade(AnalistaQualidade analistaQualidade) {
		this.analistaQualidade = analistaQualidade;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Chamado other = (Chamado) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
