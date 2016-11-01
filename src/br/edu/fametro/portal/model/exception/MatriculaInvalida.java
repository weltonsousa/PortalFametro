package br.edu.fametro.portal.model.exception;

public class MatriculaInvalida extends Exception{
	
private static final long serialVersionUID = 1l;
	
	public  MatriculaInvalida() {
		
		super("Matrícula inválida ou não encontrada");
	} 
	
}