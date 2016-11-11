package br.edu.fametro.portal.exception;

public class MatriculaInvalida extends Exception{
	
private static final long serialVersionUID = 1l;
	
	public  MatriculaInvalida() {
		
		super("Matrícula inválida ou não encontrada");
	} 
	
}