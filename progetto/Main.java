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
		  

		  //Inizio gioco
		  
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
          int a,b=0,c,d=0;
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
             String r,nome1,nome2,nome3 = null,nome4;
 	         char rc=0,sd=0;
        	 boolean correttezza=false,correttezza2=false,correttezza3=false,finepartita=false; 
        	 Scanner sc= new Scanner(System.in);
        switch(numerogiocatori)
        {
        case 2:
       
        do {
        	
        	System.out.println("Inserisci il nome del primo giocatore");
        	nome1=sc.nextLine();
        	System.out.println("Inserisci il nome del secondo giocatore");
        	nome2=sc.nextLine();
        	
        	
        	Giocatore primo= new Giocatore (nome1);
        	Giocatore secondo= new Giocatore(nome2);
        	
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
   	    	       }while(riga<1||riga>9);
        	  
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
            	        	
            	        		 
            	        	 

            		       
            		        	   System.out.println("Vuoi salire o scendere per la riga successiva? +1/-1");

            		       
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
            
            
            
            
            if(numerocarte==3)
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
            	        	
            	        		 
            	        	 

            		       
            		        	   System.out.println("Vuoi salire o scendere per la riga successiva1? ");

            		       
            		        	   a=sc.nextInt();
            		        	   System.out.println("Vuoi salire o scendere per la riga successiva2?" );
                        	        
            		        	   c=sc.nextInt();
            		        
                  	           
                  	            	
                  	            		 correttezza=p.Controllorighe3(t, riga, colonna, a,numerogiocatori,c);
                  	                     correttezza2=p.Controllo2(t);
                  	                     if(correttezza==true&&correttezza2==true)
                  	                     {
                  	                    	lib=Plancia.Prelievorighe3(t, riga, colonna,a,c); 
                  	          	            t=Plancia.AggiornaMatricerighe3(t,riga,colonna,a,c);
                  	            	   
                  	                    
                  	                     }
                  	                     
                  	                   
                      	            	
                      	            		 
                  	            	
                  	            
            	         }
            	         
            	         

                	         
                	           
                	           //togliere il generatore k
            	         
            	         
            	         if(rc=='o')
            	         {
            	        	 
            		        System.out.println("Vuoi andare alla colonna successiva1");
            		        b=sc.nextInt();
            		        System.out.println("Vuoi andare alla colonna successiva2?");
            		        d=sc.nextInt();
            		         
            		        
                  	           
                  	            	
                  	            		 correttezza=p.Controllocolonne3(t, riga, colonna, b, ng,d);
                  	                     correttezza2=p.Controllo2(t);
                  	                   if(correttezza==true&&correttezza2==true)
                	                     {
                	                    	lib=Plancia.Prelievocolonne3(t, riga, colonna,b,d); 
                	          	            t=Plancia.AggiornaMatricecolonne3(t,riga,colonna,b,d);
                	            	   
                	                    
                	                     }
                  	                   
                  	                   //correttezza=false;
                  	                  // correttezza2=false;
                  	                 
                  	            	//domani controlla questo e serve metodo per la terza carta
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
   	         
   	         
   	         
        }while(finepartita==false); 
        numerocarte=0;
       
   	      break;  
          
   	      
   	      
   	      
        case 3:
        	
        	 
        	
        	do {
            	
            	System.out.println("Inserisci il nome del primo giocatore");
            	nome1=sc.nextLine();
            	System.out.println("Inserisci il nome del secondo giocatore");
            	nome2=sc.nextLine();
            	System.out.println("Inserisci il nome del terzo giocatore");
            	nome3=sc.nextLine();
            	
            	
            	Giocatore primo= new Giocatore (nome1);
            	Giocatore secondo= new Giocatore(nome2);
            	Giocatore terzo= new Giocatore(nome3);
            	
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
       	    	       }while(riga<1||riga>9);
            	  
            	    do
            	    	{
            	    	  System.out.println("Inserisci la colonna della carta da prelevare ");
            	    	  colonna=sc.nextInt();
            	    	}while(colonna<1||colonna>9);
            	    
            	     
                     correttezza=p.Controllo(t, riga, colonna, numerocarte, ng);
                     System.out.println("Correttezza "+correttezza);
                     correttezza2=p.Controllo2(t);
                     System.out.println("Correttezza2 "+correttezza2);
                     
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
                	        	
                	        		 
                	        	 

                		       
                		        	   System.out.println("Vuoi salire o scendere per la riga successiva? +1/-1");

                		       
                		        	   a=sc.nextInt();
                            	        
                		        	
                		        
                      	           
                      	            	
                      	            		 correttezza=p.Controllorighe2(t, riga, colonna, a,numerogiocatori);
                      	                     correttezza2=p.Controllo2(t);
                      	                     //correttezza3=p.Controllo3r(t, riga, colonna, a);
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
                      	                     System.out.println("Controllo1"+correttezza);
                      	                   System.out.println("Controllo2"+correttezza2);
                      	                     //correttezza3=p.Controllo3c(t, riga, colonna, b);
                      	                   if(correttezza==true&&correttezza2==true)
                    	                     {
                    	                    	lib=Plancia.Prelievocolonne2(t, riga, colonna,b); 
                    	          	            t=Plancia.AggiornaMatricecolonne2(t,riga,colonna,b);
                    	            	   
                    	                    
                    	                     }
                      	            	
                	         }
                	         
                        }while(correttezza==false||correttezza2==false);
                	 
                	  
                	   
                		   
                        
                	         
                      	            		 
                      	            	
                      	            	
                      	           
                   
                
            }
                
                
                
                
                if(numerocarte==3)
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
                	        	
                	        		 
                	        	 

                		       
                		        	   System.out.println("Vuoi salire o scendere per la riga successiva1? ");

                		       
                		        	   a=sc.nextInt();
                		        	   System.out.println("Vuoi salire o scendere per la riga successiva2?" );
                            	        
                		        	   c=sc.nextInt();
                		        
                      	           
                      	            	
                      	            		 correttezza=p.Controllorighe3(t, riga, colonna, a,numerogiocatori,c);
                      	                     correttezza2=p.Controllo2(t);
                      	                     if(correttezza==true&&correttezza2==true)
                      	                     {
                      	                    	lib=Plancia.Prelievorighe3(t, riga, colonna,a,c); 
                      	          	            t=Plancia.AggiornaMatricerighe3(t,riga,colonna,a,c);
                      	            	   
                      	                    
                      	                     }
                      	                     
                      	                   
                          	            	
                          	            		 
                      	            	
                      	            
                	         }
                	         
                	         

                    	         
                    	           
                    	           //togliere il generatore k
                	         
                	         
                	         if(rc=='o')
                	         {
                	        	 
                		        System.out.println("Vuoi andare alla colonna successiva1");
                		        b=sc.nextInt();
                		        System.out.println("Vuoi andare alla colonna successiva2?");
                		        d=sc.nextInt();
                		         
                		        
                      	           
                      	            	
                      	            		 correttezza=p.Controllocolonne3(t, riga, colonna, b, ng,d);
                      	                     correttezza2=p.Controllo2(t);
                      	                   if(correttezza==true&&correttezza2==true)
                    	                     {
                    	                    	lib=Plancia.Prelievocolonne3(t, riga, colonna,b,d); 
                    	          	            t=Plancia.AggiornaMatricecolonne3(t,riga,colonna,b,d);
                    	            	   
                    	                    
                    	                     }
                      	                   
                      	                   //correttezza=false;
                      	                  // correttezza2=false;
                      	                 
                      	            	//domani controlla questo e serve metodo per la terza carta
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
       	         
       	         
       	         
            }while(finepartita==false); 
            numerocarte=0;
        	
        	
        	break;
          
          

   	         }
        
	
	
	
	
	}}

	// 4 metodi di fare punti 

    // 1-tessera obiettivo personale (possono/devono essere calcolati solo alla fine)
	// 2-tessera obiettivo comune (deve essere controllato ogni volta che vengono immesse tessere nella libreria)
	// 3-tessere uguali adiacenti (possono/devono essere calcolati solo alla fine)
	// 4-primo giocatore che completa la libreria (controllo ogni volta che vengono immesse tessere nella libreria, appena il primo completa la libreria termina il gioco)

	// metodo4: controllare che ogni elemento della libreria sia diverso da 0 (matrice della libreria inizializzata a tanti 0, prima di passare al turno successivo)

	// metodo1: verificare che la matrice obiettivo personale e la matrice della libreria abbiano elementi uguali nelle stesse coordinate (due cicli for che scorrono le  
	//          matrici e verificano ogni volta se l'elemento è uguale o no?, possibile problema: se la libreria non è completa potrebbe considerare gli zeri delle due  
    //          matrici come valore uguale)

    // metodo3: realizzare qualcosa di simile al controllo delle tessere adiacenti della plancia, si sceglie una iniziale e si verifica se ce ne siano di uguali adiacenti,
    //          si sommano gli eventuali punti e poi si passa alla lettera successiva.

    // metodo2: implementare un controllo diverso per ogni tessere obiettivo comune, in parte credo si possa adattare parte dei controlli del metodo3 ma sicuramente è il più
    //          difficile da realizzare, non mi vengono in mente idee per renderlo facile da realizzare
	// 4 metodi di fare punti 

    // 1-tessera obiettivo personale (possono/devono essere calcolati solo alla fine)
	// 2-tessera obiettivo comune (deve essere controllato ogni volta che vengono immesse tessere nella libreria)
	// 3-tessere uguali adiacenti (possono/devono essere calcolati solo alla fine)
	// 4-primo giocatore che completa la libreria (controllo ogni volta che vengono immesse tessere nella libreria, appena il primo completa la libreria termina il gioco)

	// metodo4: controllare che ogni elemento della libreria sia diverso da 0 (matrice della libreria inizializzata a tanti 0, prima di passare al turno successivo)

	// metodo1: verificare che la matrice obiettivo personale e la matrice della libreria abbiano elementi uguali nelle stesse coordinate (due cicli for che scorrono le  
	//          matrici e verificano ogni volta se l'elemento è uguale o no?, possibile problema: se la libreria non è completa potrebbe considerare gli zeri delle due  
    //          matrici come valore uguale)

    // metodo3: realizzare qualcosa di simile al controllo delle tessere adiacenti della plancia, si sceglie una iniziale e si verifica se ce ne siano di uguali adiacenti,
    //          si sommano gli eventuali punti e poi si passa alla lettera successiva.

    // metodo2: implementare un controllo diverso per ogni tessere obiettivo comune, in parte credo si possa adattare parte dei controlli del metodo3 ma sicuramente è il più
    //          difficile da realizzare, non mi vengono in mente idee per renderlo facile da realizzare