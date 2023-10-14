package com.proyecto.modelos;

import java.util.Date;

public class Orden {
	
	private Integer id;
	private String numero;
	private Date fechacreacion;
	private Date fecharecibida;
	
	private Double total;
	
	public Orden() {
		
	}

	public Orden(Integer id, String numero, Date fechacreacion, Date fecharecibida, Double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechacreacion = fechacreacion;
		this.fecharecibida = fecharecibida;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechacreacion() {
		return fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public Date getFecharecibida() {
		return fecharecibida;
	}

	public void setFecharecibida(Date fecharecibida) {
		this.fecharecibida = fecharecibida;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechacreacion=" + fechacreacion + ", fecharecibida="
				+ fecharecibida + ", total=" + total + "]";
	}


	
	
}
