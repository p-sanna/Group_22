package progetto;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		int i=0;
		int nverdi=22,nrosse=22,nblu=22,nazzurre=22,ngialle=22,nbianche=22;

		Random generatore = new Random();
		ArrayList <Tessera> carte= new ArrayList<>();

		 do //Generazione carte esattamente nelle quantità prescritte, con quindi controlli
		  {
			  int d = 1+ generatore.nextInt(6);
			  System.out.println("d "+d);


			       if(d==1)
			       {
			    	 if (nverdi>0)
			    	 {
			         Tessera v= new Tessera (nverdi,"Verde","Gatti");
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


				         Tessera r= new Tessera (nrosse,"Rossa","Piante");
				         nrosse--;
				         carte.add(r);
				         i++;


			       }


			       if(d==3&&nblu>0)
			       {

				         Tessera b= new Tessera(nblu,"Blu","Cornici");
				         nblu--;
				         carte.add(b);
				         i++;


			       }

			       if(d==4&&nazzurre>0)
			       {

				         Tessera az= new Tessera (nazzurre,"Azzurra","Trofei");
				         nazzurre--;
				         i++;
				         carte.add(az);


			       }
			       if(d==5&&ngialle>0)
			       {


			    	    Tessera g= new Tessera (ngialle,"Gialla","Giochi");
				         ngialle--;
				         System.out.println("Ciao");
				         carte.add(g);
				         i++;
			    	  }



			        if(d==6&&nbianche>0)
			        {

				        Tessera bi= new Tessera (nbianche,"Bianca","Libri");
				         nbianche--;
				         i++;
				         carte.add(bi);

		            }



			    d=0;

		  } while(i<132);
		  

		  
		  
		  System.out.println("   Verdi "+nverdi);
		  System.out.println("Bianche "+nbianche);
		  System.out.println("Blu "+nblu);
		  System.out.println("Gialle "+ngialle);
		  System.out.println("Azzurre "+nazzurre);
		  int numerogiocatori=0;
		  System.out.println("Inserisci il numero di giocatori");
		  Scanner s= new Scanner(System.in);
		  numerogiocatori=s.nextInt();
		  String str = String.valueOf(numerogiocatori);
		  char ng= str.charAt(0);
          Plancia p= new Plancia(ng);
          p.CaricaCarte(carte,  p);
         Tessera t[][]= new Tessera[9][9];
          t=p.StampaCarte(p);
          ArrayList <Tessera> lib= new ArrayList(); 
            for(int k=0;k<9;k++)
            {
            	for(int w=0;w<9;w++)
            	{
            		System.out.print(t[k][w].getInizialeColore());
            	}
            	System.out.println("");
            }
            
            
            //Inizio prelievo
            int riga,colonna,numerocarte;
        	 boolean correttezza=false; 
        	 Scanner sc= new Scanner(System.in);
            do
   	     {
   	    	 System.out.println("Inserisci il numero di carte che vuoi prelevare, da 1 a 3");
   	    	 numerocarte= sc.nextInt();
   	     }while(numerocarte>3||numerocarte<1);
   	     
   	         if(numerocarte==1)
   	         {
   	        	 do
   	        	{
   	        		
   	        	   System.out.println("Inserisci la riga della carta da prelevare ");
   	        	
   	        	   riga=sc.nextInt();
   	        	   System.out.println("Inserisci la colonna della carta da prelevare ");
   	        	   colonna=sc.nextInt();
   	        	    if(t[riga-1][colonna+2].getInizialeColore()=='0'||t[riga][colonna+3].getInizialeColore()=='0'||t[riga+1][colonna+2].getInizialeColore()=='0'||t[riga][colonna+1].getInizialeColore()=='0')
        	         {
        	    	 correttezza=true;
        	    	 
        	         }
        	   
               
        	}while(correttezza==false);
   	        	
   	        	lib=Plancia.Prelievo(t, riga, colonna);
   	        	System.out.println("metodo2 "+lib.get(0).getInizialeColore());
   	            t=Plancia.AggiornaMatrice(t,riga,colonna);
   	            for ( i=0;i<numerocarte;i++)
   	            {
   	            	System.out.println("metodo2 "+lib.get(i).getInizialeColore());
   	            }
   	            
   	         for(int k=0;k<9;k++)
             {
             	for(int w=0;w<9;w++)
             	{
             		System.out.print(t[k][w].getInizialeColore());
             	}
             	System.out.println("");
             }
   	         //Pensare che la riga della plancia sia come in una matrice, aggiornare quindi gli indici   
          // /**Bozza idea per selezione carte (parte più difficile), bisogna usare la selezione numero giocatore
          
         //Si possono prendere solo carte in linea retta ed adiacenti ad altre carte
         //Creare metodo in classe plancia prendicarte, dove prendo la carta metto il valore 0 oppure la lettera x
          //Bisogna quindi fare in modo che l'utente non sbagli. Perchè la semplice selezione è molto facile basta dare le coordinate
          //ma noi vorremmo che il programma blocchi l'utente se questo bara.
          
          
          
          

   	         }}}

	
