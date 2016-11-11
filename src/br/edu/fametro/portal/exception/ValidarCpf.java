package br.edu.fametro.portal.exception;

public class ValidarCpf {
	
	
	    int validador1,validador2;
	    final  int [] cpfInt = new int[9];
	    String digito1,digito2;

	   
	    public void converterCpf(Contatos contato){
	            
	            
	                
	        String  sub = contato.getCpf();
	        System.out.println(sub);
	        sub = sub.substring(0, 11);
	              
	        int j = 0;
	        
	        for(int i = 0;i<cpfInt.length;i++){
	            
	            sub = sub.replace("-",""); 
	            sub = sub.replace(".","");
	            
	                    
	        cpfInt[i] = Integer.parseInt(sub.substring(j, j + 1));
	                 
	         j++;
	           }
	        
	        }
	    public void digito1(){
	        int soma = 0,resto;
	        int controle = 10;
	        for(int i = 0;i<cpfInt.length;i++){
	            soma += cpfInt[i] * controle;
	        
	        controle--;
	        }
	        
	        resto = 11 -  (soma % 11);
	        if(resto>=0 && resto<10){
	            this.validador1 = resto;
	        }else{
	            this.validador1 = 0;
	        }
	        
	    }
	    public void digito2(){
	        
	        int soma = 0,resto;
	        
	        int controle = 11;
	        
	        soma = soma + validador1 * 2;
	        
	        
	        for(int i = 0;i<cpfInt.length;i++){
	            
	            soma += cpfInt[i] * controle;
	        
	        controle--;
	        }
	        
	        
	        
	        resto = 11 -  (soma % 11);
	        
	        if(resto>=0 && resto<10){
	            this.validador2 = resto;
	        }else{
	            this.validador2 = 0;
	        }
	        
	    }
	    
	public boolean isValidador(Contatos contato){
	    
	        
	    
	    String dig1 = contato.getCpf().substring(12,13);
	    String dig2 = contato.getCpf().substring(13,14);
	    
	    
	    int d1 = Integer.parseInt(dig1);
	    int d2 = Integer.parseInt(dig2);
	    
	    return this.validador1 == d1 && this.validador2 == d2;
	   
	}
	    
	
	    
}

	   
