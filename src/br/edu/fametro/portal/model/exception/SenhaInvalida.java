package br.edu.fametro.portal.model.exception;

public class SenhaInvalida extends Exception{
	
private static final long serialVersionUID = 1l;
	
	public  SenhaInvalida () {
		
		super("Senha inválida.");
	}
}


