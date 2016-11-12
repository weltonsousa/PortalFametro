package br.edu.fametro.portal.exception;

public class SenhaException extends Exception{
	
private static final long serialVersionUID = 1l;
	
	public  SenhaException () {
		
		super("Senha inválida.");
	}
}


