package Progetto;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		int i=0;
		int nverdi=22,nrosse=22,nblu=22,nazzurre=22,ngialle=22,nbianche=22;

		Random generatore = new Random();
		ArrayList <Carta> carte= new ArrayList<>();

		 do
		  {
			  int d = 1+ generatore.nextInt(6);
			  System.out.println("d "+d);


			       if(d==1)
			       {
			    	 if (nverdi>0)
			    	 {
			         Carta v= new Carta (nverdi,"Verde","Gatti");
			         nverdi--;
			         carte.add(v);
			         i++;
			    	 }
			    	 else
			    	 {
			    		 d=0;


			    	 }
			       }

			       if(d==2&&nrosse>0)
			       {


				         Carta r= new Carta (nrosse,"Rossa","Piante");
				         nrosse--;
				         carte.add(r);
				         i++;


			       }


			       if(d==3&&nblu>0)
			       {

				         Carta b= new Carta (nblu,"Blu","Cornici");
				         nblu--;
				         carte.add(b);
				         i++;


			       }

			       if(d==4&&nazzurre>0)
			       {

				         Carta az= new Carta (nazzurre,"Azzurra","Trofei");
				         nazzurre--;
				         i++;
				         carte.add(az);


			       }
			       if(d==5&&ngialle>0)
			       {


			    	     Carta g= new Carta (ngialle,"Gialla","Giochi");
				         ngialle--;
				         System.out.println("Ciao");
				         carte.add(g);
				         i++;
			    	  }



			        if(d==6&&nbianche>0)
			        {

				         Carta bi= new Carta (nbianche,"Bianca","Libri");
				         nbianche--;
				         i++;
				         carte.add(bi);

		            }



			    d=0;

		  } while(i<132);
		  int cont=0;

		  for(Carta c: carte)
		  {
			  System.out.println("Ciao");
			  System.out.println("Carta "+c.getColore());
			  cont++;
		  }
		  System.out.println("Conattaore "+cont);
		  System.out.println("Verdi "+nverdi);
		  System.out.println("Bianche "+nbianche);
		  System.out.println("Blu "+nblu);
		  System.out.println("Gialle "+ngialle);
		  System.out.println("Azzurre "+nazzurre);


	}

}
