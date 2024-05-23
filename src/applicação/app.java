package applicação;

import Dispositivo.Iphone;
import Modelos.IphoneXsMAX;

public class app {
     public static void main(String[] args) {
		
    	Iphone iphone = null;
    	
    	iphone = new IphoneXsMAX("XS");
    	
    	
    	System.out.println(iphone + " METODOS APARELHO TELEFONICO");
    	
    	iphone.Ligar();
    	iphone.Atender();
    	iphone.IniciarCorreioVoz();
    	 
    	System.out.println();
        System.out.println();
      	 
     	 
        System.out.println(iphone + " METODOS NAVEGANDO NA INTERNET");  	 
    	  
        iphone.AdicionarNovaAba();
        iphone.AtutalizarPagina();
        
        System.out.println();
        System.out.println();

        
        System.out.println(iphone + " REPRODUTOR MUSICAL");
        
        iphone.SelecionaMusica();
        iphone.Pausar();
        iphone.Tocar();
        
        
        
        
        
    	 
    	 
     } 	 
     
}
