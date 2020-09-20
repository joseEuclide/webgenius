
package tecShine.com;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tecShine.com.JDBC.BD_Criar_SQL;
import tecShine.com.JDBC.Salvar_SQL;
import tecShine.com.JDBC.Tabelas_Criar_SQL;
import tecShine.com.model.WG.PCA_WG;

@SpringBootApplication 
public class TecShineApplication{

	public static void main(String[] args) {
		SpringApplication.run(TecShineApplication.class, args);

	
	  
		    
		    
	    
	    
	    
	    
	    /*
	     * 
	     *   BD_Criar_SQL bd = new BD_Criar_SQL();
	    Salvar_SQL s = new Salvar_SQL();
	    bd.criarBaseDeDados("wg");
	    
	    Tabelas_Criar_SQL c= new Tabelas_Criar_SQL();
	    c.criarTabelaPCA_WG("wg", "PCA");
	     
	    
	    
	    c.criarTabelaEscolas_WG();
	    
	    ArrayList<String> PCAs= null;
	    
	    System.out.println("PCAs: "+PCAs);
	    	
	    	
	    	  
	    	
	    	PCA_WG euclides = new PCA_WG();
		    euclides.setNome("Euclides Dos Santos");
		    euclides.setBi("005897414LA044");
		    
		    
		    PCA_WG felino = new PCA_WG();
		    felino.setNome("Felino Domingos");
		    felino.setBi("003916665LA039");
		    
		    
		    
		    s.inserir_PCA(euclides);
		    s.inserir_PCA(felino);
		    
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 
	     * 	*/
	  
	}
 
	

}
                                             