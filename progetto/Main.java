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
		  
		  do
			  {
			    System.out.println("Inserisci il numero di giocatori");
		        Scanner s= new Scanner(System.in);
		        numerogiocatori=s.nextInt();
			  }while(numerogiocatori<2||numerogiocatori>4);
		  String str = String.valueOf(numerogiocatori);
		  char ng= str.charAt(0);
          Plancia p= new Plancia(ng);
          p.CaricaCarte(carte,  p);
          Tessera t[][]= new Tessera[9][9];
          t=p.StampaCarte(p);
          ArrayList <Tessera> lib= new ArrayList(); 
          Scanner sca0= new Scanner(System.in);
          int a,b=0;
            for(int k=0;k<9;k++)
            {
            	for(int w=0;w<9;w++)
            	{
            		System.out.print(t[k][w].getInizialeColore());
            	}
            	System.out.println("");
            }
            
            
            //Inizio prelievo
            int riga = 0,colonna = 0,numerocarte=0;
            String r;
 	         char rc=0,sd=0;
        	 boolean correttezza=false,correttezza2=false,correttezzaa=false,correttezza22=false; 
        	 Scanner sc= new Scanner(System.in);
        switch(numerogiocatori)
        {
        case 2:
       
            do
   	     {
   	    	 System.out.println("Inserisci il numero di carte che vuoi prelevare, da 1 a 3");
   	    	 numerocarte= sc.nextInt();
   	     }while(numerocarte>3||numerocarte<1);
            
            if (numerocarte==1)
            {
            
   	         do {
   	    	    do {
   	    	         System.out.println("Inserisci la riga della carta da prelevare  ");
   	    	         riga=sc.nextInt();
   	    	       }while(riga<2||riga>8);
        	  
        	    do
        	    	{
        	    	  System.out.println("Inserisci la colonna della carta da prelevare ");
        	    	  colonna=sc.nextInt();
        	    	}while(colonna<1||colonna>9);
        	    
        	     
                 correttezza=p.Controllo(t, riga, colonna, numerocarte, ng);
                 correttezza2=p.Controllo2(t);
	            }  while(correttezza==false||correttezza2==false);
   	         
   	       
   	        	correttezza=false;
   	        	correttezza2=false;
   	        	
   	        	lib=Plancia.Prelievo(t, riga, colonna);
   	        	System.out.println("metodo2 "+lib.get(0).getInizialeColore());
   	            t=Plancia.AggiornaMatrice(t,riga,colonna);
            }//fine if carte==1
            
            
            if(numerocarte==2)
            {
            	
            	 do 
	        	 {
       	    	         System.out.println("Inserisci la riga delle carte da prelevare, questa sarà la riga di partenza  ");
       	    	         riga=sc.nextInt();
       	    	       
            	  
            	   
            	    	 System.out.println("Inserisci la colonna delle carte da prelevare, questa sarà la colonna di partenza ");
            	    	 colonna=sc.nextInt();
            	    	
            	    
            	   
            		     System.out.println("Vuoi prelevare in verticale o orizzontale? v/o ");
            	       
            	      
            	         r=sca0.nextLine();
            	         System.out.println(r+"rrrrr");
            	         rc=r.charAt(0);
            	         System.out.println(rc+"a");
            	       
            	   
            	   
            	         if(rc=='v')
            	         {
            	        	
            	        		 
            	        	 
<<<<<<< HEAD
            		       
            		        	   System.out.println("Vuoi salire o scendere per la riga successiva? +1/-1");
=======
            		       //  do
            		        	 //{
            		        	   System.out.println("Vuoi andare alla riga successiva? +1/-1");
<<<<<<< Updated upstream
=======
>>>>>>> d2377bc0f31cd4a1586c26636e5a75a52050c673
>>>>>>> Stashed changes
            		        	   a=sc.nextInt();
                        	        
            		        	
            		        
                  	           
                  	            	
                  	            		 correttezza=p.Controllorighe2(t, riga, colonna, a,numerogiocatori);
                  	                     correttezza2=p.Controllo2(t);
                  	                     if(correttezza==true&&correttezza2==true)
                  	                     {
                  	                    	lib=Plancia.Prelievorighe2(t, riga, colonna,a); 
                  	          	            t=Plancia.AggiornaMatricerighe2(t,riga,colonna,a);
                  	            	   
                  	                    
                  	                     }
                  	            	
                  	            
            	         }
            	         
            	         

                	         
                	           
                	           
            	         
            	         
            	         if(rc=='o')
            	         {
            	        	 
            		        System.out.println("Vuoi andare alla colonna successiva +1 o -1?");
            		        b=sc.nextInt();
            		         
            		        
                  	           
                  	            	
                  	            		 correttezza=p.Controllocolonne2(t, riga, colonna, b, ng);
                  	                     correttezza2=p.Controllo2(t);
                  	                   if(correttezza==true&&correttezza2==true)
                	                     {
                	                    	lib=Plancia.Prelievocolonne2(t, riga, colonna,b); 
                	          	            t=Plancia.AggiornaMatricecolonne2(t,riga,colonna,b);
                	            	   
                	                    
                	                     }
                  	            	
            	         }
            	         
                    }while(correttezza==false||correttezza2==false);
            	 
            	  
            	   
            		   
                    
            	         
                  	            		 
                  	            	
                  	            	
                  	           
               
            
        }
   	         
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
   	         
   	       
   	      break;  
          
          
          

   	         }}}

	
