package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import carte.CartaOb;
import progetto.Libreria;
import progetto.Tessera;

public class J {
	@Test
  public void TestLibreriaPiena()
  {
	  Libreria l= new Libreria ("A", 1);
	     int i=0,j=0;
	     char a[][]= new char[6][5];
	     
	     for(i=0;i<6;i++)
	     {
	    	for(j=0;j<5;j++)
	    		{
	    		 l.riempimentocasella[i][j]=true;
	    		 l.casellario[i][j]=new Tessera(1000,"0","Nera");
	    		}
	    	
	     }
	     for(j=0;j<3;j++)
	    	 i=0;
 		{
 		 l.riempimentocasella[i][j]=true;
 		 l.casellario[i][j]=new Tessera(1000,"A","Nera");
 		}
 		i=0;
 		 for(j=0;j<5;j++)
	    	 
 		{
 		 l.riempimentocasella[i][j]=true;
 		 l.casellario[i][j]=new Tessera(1000,"a","Nera");
 		}
 		for(i=0;i<6;i++)
	     {
	    	for(j=0;j<3;j++)
	    		{
	    		a[0][j]='a';
	    		
	    		}
	    	
	     }
 		CartaOb w= new CartaOb();
	    assertEquals(w.PunteggioPersonale(l,a),4);
  }
}
