package com.miempresa.DTO;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class formularioDTO {
	
    private String documento;

    @NotBlank(message = "No puede estar en blanco")
    private String nro_documento;

    @NotBlank(message = "No puede estar en blanco")
    private String apellido_paterno;

    @NotBlank(message = "No puede estar en blanco")
    private String apellido_materno;

    @NotBlank(message = "No pueden estar en blanco")
    private String nombres;

    @NotBlank(message = "No puede estar en blanco")
    @Pattern(regexp = "^(0?[1-9]|[12][0-9]|3[01])$", message = "Ingrese un día válido")
    private String dia;

    
    private String mes;

    @NotBlank(message = "No puede estar en blanco")
    @Size(min = 4, max = 4, message = "Ingrese un año válido")
    private String anio;



    private OpcionesMes[] opcionesMes;

    
    private String sexo;

    private OpcionesSexo[] opcionesSexo;

    
    private String est_civil;

    private OpcionesCivil[] opcionesCivil;

    
    private String sit_laboral;

    private OpcionesLaboral[] opcionesLaboral;

    @NotBlank(message = "No puede estar en blanco")
    private String ruc;

    @NotBlank(message = "Debe aceptar los términos y condiciones")
    private String terminos;
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNro_documento() {
		return nro_documento;
	}
	public void setNro_documento(String nro_documento) {
		this.nro_documento = nro_documento;
	}
	public String getApellido_paterno() {
		return apellido_paterno;
	}
	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}
	public String getApellido_materno() {
		return apellido_materno;
	}
	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAnio() {
	    return anio;
	}

	public void setAnio(String anio) {
	    this.anio = anio;
	}
	public OpcionesMes[] getOpcionesMes() {
		return opcionesMes;
	}
	public void setOpcionesMes(OpcionesMes[] opcionesMes) {
		this.opcionesMes = opcionesMes;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public OpcionesSexo[] getOpcionesSexo() {
		return opcionesSexo;
	}
	public void setOpcionesSexo(OpcionesSexo[] opcionesSexo) {
		this.opcionesSexo = opcionesSexo;
	}
	public String getEst_civil() {
		return est_civil;
	}
	public void setEst_civil(String est_civil) {
		this.est_civil = est_civil;
	}
	public OpcionesCivil[] getOpcionesCivil() {
		return opcionesCivil;
	}
	public void setOpcionesCivil(OpcionesCivil[] opcionesCivil) {
		this.opcionesCivil = opcionesCivil;
	}
	public String getSit_laboral() {
		return sit_laboral;
	}
	public void setSit_laboral(String sit_laboral) {
		this.sit_laboral = sit_laboral;
	}
	public OpcionesLaboral[] getOpcionesLaboral() {
		return opcionesLaboral;
	}
	public void setOpcionesLaboral(OpcionesLaboral[] opcionesLaboral) {
		this.opcionesLaboral = opcionesLaboral;
	}
	public String getRuc() {
		return ruc;
	}
	public void setRuc(String ruc) {
		this.ruc = ruc;
	}
	public String getTerminos() {
		return terminos;
	}
	public void setTerminos(String terminos) {
		this.terminos = terminos;
	}

    
    
    
}
