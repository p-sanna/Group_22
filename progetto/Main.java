package progetto;
import java.util.*;

import Funzionalità.Ciclico;
import carte.CartaOb;
import carte.CartaObC;

public class Main {

	public static void main(String[] args) {

		int i=0,  punteggiot=0,punteggios=0,punteggiop=0;
		int ris1=0,ris2=0, number4=0;;
		CartaOb att= new CartaOb();
		att.CaricaMatrici();
	   Ciclico prova= new Ciclico(att.matrice1);
	   Ciclico.Main(att.matrice1);
	   Libreria atttttt= new Libreria("ciaone",1);
	   
	   atttttt.PuntiTessereAd(atttttt);
		
	
		int nverdi=22,nrosse=22,nblu=22,nazzurre=22,ngialle=22,nbianche=22;

		Random generatore = new Random();
		ArrayList <Tessera> carte= new ArrayList<>();

		 do //Generazione carte esattamente nelle quantità prescritte, con quindi controlli
		  {
			  int d = 1+ generatore.nextInt(6);
			  


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
				         
				         carte.add(g);
				         i++;
			    	  }



			        if(d==6&&nbianche>0)
			        {

				        Tessera bi= new Tessera (nbianche,"White","Libri");
				         nbianche--;
				         i++;
				         carte.add(bi);

		            }



			    d=0;

		  } while(i<132);
		 

		  int pos=0,pt=0,pt2=0;
		  
		  
		  int numerogiocatori=0;
		  
		    do
			   {
			    System.out.println("Inserisci il numero di giocatori (numero compreso tra 2 e 4)");
		        Scanner s= new Scanner(System.in);
		        numerogiocatori=s.nextInt();
			   }while(numerogiocatori<2||numerogiocatori>4);
		  String str = String.valueOf(numerogiocatori);
		  char ng= str.charAt(0);
		 
          Plancia p= new Plancia(ng);
          p.CaricaCarte(carte,  p,pos);
          Tessera t[][]= new Tessera[9][9];
          Giocatore primo= new Giocatore ("A");
     	 Giocatore secondo= new Giocatore("B");
     	 Giocatore terzo= new Giocatore("C");
     	 Giocatore quarto= new Giocatore("D");
     	 Libreria l1= new Libreria("A",1);
         Libreria l2= new Libreria("B",2);
         Libreria l3= new Libreria("C",3);
         Libreria l4= new Libreria("D",4);
        
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
             int riga = 0,colonna = 0,numerocarte=0,spaziodisponibile=0;
             int contatoreturni=1,number1=0;
             String r = null;
             String nome1 = "";
             String nome2 = "";
             String nome3 = "";
             String nome4 = "";
 	         char rc=0,sd=0;
        	 boolean correttezza=false,correttezza2=false,correttezza3=false,finepartita=false; 
        	 Scanner sc= new Scanner(System.in);
        	 int cr=0;
        	 Random random1 = new Random();
        	 int number = random1.nextInt(12);
        	do
        		{
        		
        		
        	     number1 = random1.nextInt(12);
        		}while(number==number1);
        	
        	CartaObC x= new CartaObC(number);
        	CartaObC y= new CartaObC(number1);
        	boolean conplancia=false;
        switch(numerogiocatori)
        {
        case 2:
        	while(nome1.isEmpty()|| nome2.isEmpty()||nome1.equals(nome2))
        	{
	        	
        		System.out.println("Inserisci il nome del primo giocatore (non include la posizione nel gioco)");
	        	nome1=sc.nextLine();
	        	
	        	
	        	System.out.println("Inserisci il nome del secondo giocatore (non include la posizione nel gioco)");
	        	nome2=sc.nextLine();
	        	
	        	if(nome1.isEmpty()||nome2.isEmpty())
	        	{System.out.println("I nomi dei giocatori non possono essere vuoti. Riprova");
	        	} else if(nome1.equals(nome2))
	        	{System.out.println("I nomi dei giocatori non possono essere uguali. Riprova");
	        	
	        	}}
        	
        	
        	
        	Random random3 = new Random();
        	 int number5 = random3.nextInt(2);
        	 if(number5==1)
        	 {
        		  primo.setNome(secondo, nome2);
        		  l1.setNome(l1, nome2);
        		 System.out.println("Inizia il giocatore "+primo.getNome(primo));
        		 secondo.setNome(primo, nome1);
        		  l2.setNome(l2, nome1);
        	 }
        	 else
        	 {
        		 primo.setNome(primo, nome1);
        		 l1.setNome(l1,nome1);
        		 System.out.println("Inizia il giocatore "+primo.getNome(primo));
        		 secondo.setNome(secondo, nome2);
        		  l2.setNome(l2, nome2);
        	 }
        	
        	
        	char m1[][]= new char[6][5];
        	char m2[][]= new char[6][5];
        	
        	
        	 Random random = new Random();
 	        
 	        int number3 = random.nextInt(12);
         	CartaOb q= new CartaOb();
         	m1=q.Carta1(number3);
         	do {
         	 number4 = random.nextInt(12);
         	}while(number4==number3);
         	m2=q.Carta1(number4);
        	
        do {
        	
            
	       
        	
        	
        	
        	do 
       	 { 	correttezza=false;
        	correttezza2=false;
            do
   	     {
   	    	 System.out.println("Inserisci il numero di tessere adiacenti tra loro che vuoi prelevare, da 1 a 3");
   	    	 numerocarte= sc.nextInt();
   	    	 conplancia=p.ConPlancia(t);
   	    	 
   	    	 
   	    	   
   	    	 if(contatoreturni%2==0)
   	    	 {
   	    		 
   	    	 spaziodisponibile=l1.LibreriaPiena(l1);
   	    	 }
   	    	 else
   	    	 {
   	    		 spaziodisponibile=l2.LibreriaPiena(l2);
   	    	 }
   	    	     if(spaziodisponibile<numerocarte)
   	    	      {
   	    		   numerocarte=5;
   	    	      }
   	     }while(numerocarte>3||numerocarte<1);
            
            if (numerocarte==1)
            {
            
   	         do {
   	    	    do {
   	    	         System.out.println("Inserisci la riga della tessera da prelevare");
   	    	         riga=sc.nextInt();
   	    	       }while(riga<1||riga>9);
        	  
        	    do
        	    	{
        	    	  System.out.println("Inserisci la colonna della tessera da prelevare");
        	    	  colonna=sc.nextInt();
        	    	}while(colonna<1||colonna>9);
        	    
        	     
                 correttezza=p.Controllo(t, riga, colonna, numerocarte, ng);
                 correttezza2=p.Controllo2(t);
	            }  while(correttezza==false||correttezza2==false);
   	         
   	       
   	        	
   	        	
   	        	lib=Plancia.Prelievo(t, riga, colonna);
   	        	//System.out.println("metodo2 "+lib.get(0).getInizialeColore());
   	            t=Plancia.AggiornaMatrice(t,riga,colonna);
            }//fine if carte==1
            
            
            if(numerocarte==2)
            {
            	
            	 do 
	        	 {
       	    	         System.out.println("Inserisci la riga della prima tessera da prelevare, questa sarà la riga di partenza");
       	    	         riga=sc.nextInt();
       	    	       
            	  
            	   
            	    	 System.out.println("Inserisci la colonna della prima tessera da prelevare, questa sarà la colonna di partenza");
            	    	 colonna=sc.nextInt();
            	    	
            	    
            	   
            		     System.out.println("Vuoi prelevare la seconda tessera in verticale o orizzontale? v/o");
            	       
            	      
            	         r=sca0.nextLine();
            	         //System.out.println(r+"rrrrr");
            	         rc=r.charAt(0);
            	         //System.out.println(rc+"a");
            	       
            	   
            	   
            	         if(rc=='v')
            	         {
            	        	
            	        		 
            	        	 

            		       
            		        	   System.out.println("Vuoi passare alla riga inferiore (+1) o superiore (-1) per la seconda tessera?");

            		       
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
            	        	 
            		        System.out.println("Vuoi passare alla colonna successiva (+1) o precedente (-1) per la seconda tessera?");
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
            	
            	 
       	    	         System.out.println("Inserisci la riga della prima tessera da prelevare, questa sarà la riga di partenza");
       	    	         riga=sc.nextInt();
       	    	       
            	  
            	   
            	    	 System.out.println("Inserisci la colonna della prima tessera da prelevare, questa sarà la riga di partenza");
            	    	 colonna=sc.nextInt();
            	    	
            	    
            	   
            		     System.out.println("Vuoi prelevare le altre tessere in verticale o orizzontale? v/o");
            	       
            	      
            	         r=sca0.nextLine();
            	         //System.out.println(r+"rrrrr");
            	         rc=r.charAt(0);
            	         //System.out.println(rc+"a");
            	       
            	   
            	   
            	         if(rc=='v')
            	         {
            	        	
            	        		 
            		        	   System.out.println("Vuoi passare alla riga inferiore (+1) o superiore (-1) per la seconda tessera?");
            		        	   a=sc.nextInt();
            		        	   
            		        	   System.out.println("Vuoi passare a due righe inferiori (+2) o superiori (-2) rispetto alla riga di partenza per la terza tessera?" );
            		        	   c=sc.nextInt();
            		        
                  	           
                  	            		 correttezza=p.Controllorighe3(t, riga, colonna, a,numerogiocatori,c);
                  	                     correttezza2=p.Controllo2(t);
                  	                     if(correttezza==true&&correttezza2==true)
                  	                     {
                  	                    	lib=Plancia.Prelievorighe3(t, riga, colonna,a,c); 
                  	          	            t=Plancia.AggiornaMatricerighe3(t,riga,colonna,a,c);
                  	            	   
                  	                    
                  	                     }
                  	                     
                  	                   
                      	            	
                      	            		 
                  	            	
                  	            
            	         }
            	         
            	         
                	          
            	         
            	         
            	         if(rc=='o')
            	         {
            	        	 
            		        System.out.println("Vuoi passare alla colonna successiva (+1) o precedente (-1) per la seconda tessera?");
            		        b=sc.nextInt();
            		        System.out.println("Vuoi passare a due colonne successive (+2) o precedenti (-2) rispetto alla colonna di partenza per la terza tessera?");
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
                  	                 
                  	            	
            	         }
            	         
                    }}while(correttezza==false||correttezza2==false);
            	 
            	  
            	   
            		   
                    
            	         
                  	            		 
                  	            	
                  	            	
                  	           
               
            
        	if (conplancia==true)
	    	   {
        		
        		  
	    		   p=null;
	    		   t=null;
	    		   
	    		   p= new Plancia('2');
	    		   p.CaricaCarte(carte, p,pos+29);
	    		   t= new Tessera[9][9];
	    		   t=p.StampaCarte(p);
	    		 
	    	   }
   	         
   	            for ( i=0;i<numerocarte;i++)
   	            {
   	            	//System.out.println("metodo2 "+lib.get(i).getInizialeColore());
   	            }
   	            
   	         for(int k=0;k<9;k++)
             {
             	for(int w=0;w<9;w++)
             	{
             		System.out.print(t[k][w].getInizialeColore());
             	}
             	System.out.println("");
             
             }
   	         
   	         
   	      numerocarte=0;
          if(contatoreturni%2!=0)
          {
        	   
        	 l1.RiempiLibreria(lib,l1);
        	 l1.StampaLibreria(l1);
        	   if(ris1==0)
        	   {
        		   ris1=l1.Difficile(l1, number, numerogiocatori, primo);
        		   if (ris1!=0)
        		   {
        		    primo.punteggio=primo.punteggio+8;
        		   }
        	   }
        	   else
        	   {
        		  int supporto=ris1;
        		  ris1=0;
        		   ris1=l1.Difficile(l1, number, numerogiocatori, primo);
        		     if(ris1==8)
        		     {
        		    	 primo.punteggio=primo.punteggio+4;
        		     }
        		     else
        		     {
        		      ris1=supporto;
        		     }
        	   }
        	   if(ris2==0)
        	   {
        		   ris2=l1.Difficile(l1, number1, numerogiocatori, primo);
        		   if (ris2!=0)
        		   {
        		    primo.punteggio=primo.punteggio+8;
        		   }
        	   }
        	   else
        	   {
        		  int supporto2=ris2;
        		  ris2=0;
        		   ris2=l1.Difficile(l1, number1, numerogiocatori, primo);
        		     if(ris2==8)
        		     {
        		    	 primo.punteggio=primo.punteggio+4;
        		     }
        		     else
        		     {
        		      ris2=supporto2;
        		     }
        	   }
        	   
        	finepartita=l1.LibreriaPiena2(l1);
        	    
          }
          else
          {
        	  l2.RiempiLibreria(lib,l2);
        	  l2.StampaLibreria(l2);
        	  
        	  if(ris1==0)
       	   {
       		   ris1=l2.Difficile(l2, number, numerogiocatori, secondo);
       		   if (ris1!=0)
       		   {
       		    secondo.punteggio=secondo.punteggio+8;
       		   }
       	   }
       	   else
       	   {
       		  int supporto=ris1;
       		  ris1=0;
       		   ris1=l2.Difficile(l2, number, numerogiocatori, secondo);
       		     if(ris1==8)
       		     {
       		    	 secondo.punteggio=secondo.punteggio+4;
       		     }
       		     else
       		     {
       		      ris1=supporto;
       		     }
       	   }
       	   if(ris2==0)
       	   {
       		   ris2=l2.Difficile(l2, number1, numerogiocatori, secondo);
       		   if (ris2!=0)
       		   {
       		    secondo.punteggio=secondo.punteggio+8;
       		   }
       	   }
       	   else
       	   {
       		  int supporto2=ris2;
       		  ris2=0;
       		   ris2=l2.Difficile(l2, number1, numerogiocatori, secondo);
       		     if(ris2==8)
       		     {
       		    	 secondo.punteggio=secondo.punteggio+4;
       		     }
       		     else
       		     {
       		      ris2=supporto2;
       		     }
       	   }
       	   
       	  finepartita=l2.LibreriaPiena2(l2);
       	    
         }
        	  
          
          lib=null;
          
   	      System.out.println("Fine del turno. Tocca al giocatore successivo");  
   	      contatoreturni++;
   	         
        }while(finepartita==false); 
         punteggiop=0;
         punteggios=0;
        punteggiop=q.PunteggioPersonale(l1,m1 );
    	punteggios=q.PunteggioPersonale(l2, m2);
    	primo.punteggio=primo.punteggio+punteggiop;
    	secondo.punteggio=secondo.punteggio+punteggios;
    	punteggiop=0;
    	punteggiop=l1.PuntiTessereAd(l1);
    	primo.punteggio=primo.punteggio+punteggiop;
    	punteggios=0;
    	punteggios=l2.PuntiTessereAd(l2);
    	secondo.punteggio=secondo.punteggio+punteggios;
    	  if((contatoreturni-1)%2!=0)
    	  {
    		  primo.punteggio=primo.punteggio+1;
    	  }
    	  else
    	  {
    		  secondo.punteggio=secondo.punteggio+1;
    	  }
    	  
    	  if(primo.punteggio>secondo.punteggio)
    	  {
    		  System.out.println("HA VINTO IL GIOCATORE "+primo.getNome(primo)+" con "+primo.punteggio+" punti");
    		  System.out.println("Il secondo classificato ha "+secondo.punteggio);
    	  }
    	  else
    		  
    	  {
    		  System.out.println("HA VINTO IL GIOCATORE "+secondo.getNome(secondo)+" con "+secondo.punteggio+" punti");
    		  System.out.println("Il secondo classificato ha "+primo.punteggio);
    	  }
    		  
    		 
    		  
        
        
   	      break;  
          
   	      
   	      
   	      
        case 3:
        	int c1=3,c2=2,c3=1;
        	while(nome1.isEmpty()||nome2.isEmpty()||nome3.isEmpty()||nome1.equals(nome2)||nome2.equals(nome3)||nome3.equals(nome1))
        	{
        	System.out.println("Inserisci il nome del primo giocatore");
        	nome1=sc.nextLine();
        	System.out.println("Inserisci il nome del secondo giocatore");
        	nome2=sc.nextLine();
        	System.out.println("Inserisci il nome del terzo giocatore");
        	nome3=sc.nextLine();
        	 
             l1= new Libreria("A",1);
             l2= new Libreria("B",2);
             l3= new Libreria("C",3);
             
        	if(nome1.isEmpty()||nome2.isEmpty()||nome3.isEmpty())
        	{System.out.println("I nomi dei giocatori non possono essere vuoti. Riprova");
        	} else if(nome1.equals(nome2)||nome2.equals(nome3)||nome3.equals(nome1))
        	{System.out.println("I nomi dei giocatori non possono essere uguali. Riprova");
        	
        	}}
        	 random3 = new Random();
       	  number5 = random3.nextInt(3);
       	 if(number5==1)
       	 {
       		  primo.setNome(secondo, nome2);
       		  l1.setNome(l1, nome2);
       		 System.out.println("Inizia il giocatore "+primo.getNome(primo));
       		 
       		 secondo.setNome(primo, nome1);
       		 System.out.println("Come secondo il giocatore "+secondo.getNome(secondo));
       		
       		 terzo.setNome(terzo, nome3);
       		 System.out.println("Come terzo il giocatore "+terzo.getNome(terzo));
       		  l2.setNome(l2, nome1);
       		  l3.setNome(l3, nome3);
       	 }
       	 if(number5==0)
       	 {
       		 primo.setNome(primo, nome1);
       		 l1.setNome(l1,nome1);
       		 System.out.println("Inizia il giocatore "+primo.getNome(primo));
       		 
       		 secondo.setNome(secondo, nome2);
       		System.out.println("Come secondo il giocatore "+secondo.getNome(secondo));
       		 terzo.setNome(terzo, nome3);
       		 System.out.println("Come terzo il giocatore "+terzo.getNome(terzo));
       		  l2.setNome(l2, nome2);
       		  l3.setNome(l3, nome3);
       	 }
       	if(number5==2)
       	 {
       		 primo.setNome(terzo, nome3);
       		 l1.setNome(l1,nome3);
       		 System.out.println("Inizia il giocatore "+primo.getNome(primo));
       		 secondo.setNome(secondo, nome2);
       		System.out.println("Come secondo il giocatore "+secondo.getNome(secondo));
       		terzo.setNome(primo, nome1);
       		System.out.println("Come terzo il giocatore "+terzo.getNome(terzo));
       		  l2.setNome(l2, nome2);
       		  
       		l3.setNome(l3, nome1);
       		  
       	 }
       	 
       	
        int number6 = random1.nextInt(12);
        m1= new char[6][5];
      	 m2= new char[6][5];
        Random f3= new Random();
        int number7=0,number8=0;
     	CartaOb h= new CartaOb();
     	m1=h.Carta1(number6);
     	do {
     	  number7 = f3.nextInt(12);
     	}while(number7==number6);
     	m2=h.Carta1(number7);
     	do {
       	  number8 = f3.nextInt(12);
       	}while(number8==number6||number8==number7);
       	 
       	 char m3[][]=new char[6][5];
       	m3=h.Carta1(number8);
        	
        	
        	do {
            	
            	
            	
            	
            	
            	
         do {
        	 correttezza=false;
	         correttezza2=false;
        	
        	 do
         
       	     {
       	    	 System.out.println("Inserisci il numero di tessere adiacenti tra loro che vuoi prelevare, da 1 a 3");
       	    	 numerocarte= sc.nextInt();
       	    	conplancia=p.ConPlancia(t);
      	    	 
      	    	 
      	    	   
      	    	 if(c1%3==0)
      	    	 {
      	    		 
      	    	 spaziodisponibile=l1.LibreriaPiena(l1);
      	    	 }
      	    	 if(c2%3==0)
      	    	 {
      	    		 spaziodisponibile=l2.LibreriaPiena(l2);
      	    	 }
      	    	 if(c3%3==0)
      	    	 {
      	    		spaziodisponibile=l3.LibreriaPiena(l3);
      	    	 }
      	    	     if(spaziodisponibile<numerocarte)
      	    	      {
      	    		   numerocarte=5;
      	    	      }
       	     }while(numerocarte>3||numerocarte<1);
                
                if (numerocarte==1)
                {
                
       	         do {
       	    	    do {
       	    	         System.out.println("Inserisci la riga della tessera da prelevare");
       	    	         riga=sc.nextInt();
       	    	       }while(riga<1||riga>9);
            	  
            	    do
            	    	{
            	    	  System.out.println("Inserisci la colonna della tessera da prelevare");
            	    	  colonna=sc.nextInt();
            	    	}while(colonna<1||colonna>9);
            	    
            	     
                     correttezza=p.Controllo(t, riga, colonna, numerocarte, ng);
                     //System.out.println("Correttezza "+correttezza);
                     correttezza2=p.Controllo2(t);
                     //System.out.println("Correttezza2 "+correttezza2);
                     
    	            }  while(correttezza==false||correttezza2==false);
       	         
       	       
       	        	
       	        	
       	        	lib=Plancia.Prelievo(t, riga, colonna);
       	        	//System.out.println("metodo2 "+lib.get(0).getInizialeColore());
       	            t=Plancia.AggiornaMatrice(t,riga,colonna);
                }//fine if carte==1
                
                
                if(numerocarte==2)
                {
                	
                	 do 
    	        	 {
           	    	         System.out.println("Inserisci la riga della prima tessera da prelevare, questa sarà la riga di partenza");
           	    	         riga=sc.nextInt();
           	    	       
                	  
                	   
                	    	 System.out.println("Inserisci la colonna della prima tessera da prelevare, questa sarà la riga di partenza");
                	    	 colonna=sc.nextInt();
                	    	
                	    
                	   
                		     System.out.println("Vuoi prelevare la seconda tessera in verticale o orizzontale? v/o");
                	       
                	      
                	         r=sca0.nextLine();
                	         //System.out.println(r+"rrrrr");
                	         rc=r.charAt(0);
                	         //System.out.println(rc+"a");
                	       
                	   
                	   
                	         if(rc=='v')
                	         {
                	        	
                	        		 
                	        	 

                		       
                		        	   System.out.println("Vuoi passare alla riga inferiore (+1) o superiore (-1) per la seconda tessera?");

                		       
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
                	        	 
                		        System.out.println("Vuoi passare alla colonna successiva (+1) o precedente (-1) per la seconda tessera?");
                		        b=sc.nextInt();
                		         
                		        
                      	           
                      	            	
                      	            		 correttezza=p.Controllocolonne2(t, riga, colonna, b, ng);
                      	                     correttezza2=p.Controllo2(t);
                      	                     //System.out.println("Controllo1"+correttezza);
                      	                   //System.out.println("Controllo2"+correttezza2);
                      	                     
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
                	
                	      	 System.out.println("Inserisci la riga della prima tessera da prelevare, questa sarà la riga di partenza");
           	    	         riga=sc.nextInt();
           	    	       
                	  
                	   
                	    	 System.out.println("Inserisci la colonna della prima tessera da prelevare, questa sarà la riga di partenza");
                	    	 colonna=sc.nextInt();
                	    	
                	    
                	   
                		     System.out.println("Vuoi prelevare le altre tessere in verticale o orizzontale? v/o");
                	       
                	      
                	         r=sca0.nextLine();
                	         //System.out.println(r+"rrrrr");
                	         rc=r.charAt(0);
                	         //System.out.println(rc+"a");
                	       
                	   
                	   
                	         if(rc=='v')
                	         {
                	        	
                	        		 
                	        	 

                		       
                		        	   System.out.println("Vuoi passare alla riga inferiore (+1) o superiore (-1) per la seconda tessera?");

                		       
                		        	   a=sc.nextInt();
                		        	   System.out.println("Vuoi passare a due righe inferiori (+2) o superiori (-2) rispetto alla riga di partenza per la terza tessera?" );
                            	        
                		        	   c=sc.nextInt();
                		        
                      	           
                      	            	
                      	            		 correttezza=p.Controllorighe3(t, riga, colonna, a,numerogiocatori,c);
                      	                     correttezza2=p.Controllo2(t);
                      	                     if(correttezza==true&&correttezza2==true)
                      	                     {
                      	                    	lib=Plancia.Prelievorighe3(t, riga, colonna,a,c); 
                      	          	            t=Plancia.AggiornaMatricerighe3(t,riga,colonna,a,c);
                      	            	   
                      	                    
                      	                     }
                      	                     
                      	                   
                          	            	
                          	            		 
                      	            	
                      	            
                	         }
                	         
                	         

                    	         
                    	           
                	         
                	         
                	         if(rc=='o')
                	         {
                	        	 
                		        System.out.println("Vuoi passare alla colonna successiva (+1) o precedente (-1) per la seconda tessera?");
                		        b=sc.nextInt();
                		        System.out.println("Vuoi passare a due colonne successive (+2) o precedenti (-2) rispetto alla colonna di partenza per la terza tessera?");
                		        d=sc.nextInt();
                		         
                		        
                      	           
                      	            	
                      	            		 correttezza=p.Controllocolonne3(t, riga, colonna, b, ng,d);
                      	                     correttezza2=p.Controllo2(t);
                      	                   if(correttezza==true&&correttezza2==true)
                    	                     {
                    	                    	lib=Plancia.Prelievocolonne3(t, riga, colonna,b,d); 
                    	          	            t=Plancia.AggiornaMatricecolonne3(t,riga,colonna,b,d);
                    	            	   
                    	                    
                    	                     }
                      	                   
                      	                  
                	         }
                	         
                        }}while(correttezza==false||correttezza2==false);
                	 
                	  
                	   
                		   
                        
                	         
                      	            		 
                      	            	
                      	            	
                      	           
                   
                
        	
       	         
       	            for ( i=0;i<numerocarte;i++)
       	            {
       	            	//System.out.println("metodo2 "+lib.get(i).getInizialeColore());
       	            }
       	            
       	     
       	    if (conplancia==true)
	    	   {
     		
     		  
	    		   p=null;
	    		   t=null;
	    		   
	    		   p= new Plancia('2');
	    		   p.CaricaCarte(carte, p,pos+29);
	    		   t= new Tessera[9][9];
	    		   t=p.StampaCarte(p);
	    		 
	    	   }
	         
	            for ( i=0;i<numerocarte;i++)
	            {
	            	//System.out.println("metodo2 "+lib.get(i).getInizialeColore());
	            }
	            
	         for(int k=0;k<9;k++)
          {
          	for(int w=0;w<9;w++)
          	{
          		System.out.print(t[k][w].getInizialeColore());
          	}
          	System.out.println("");
          
          }
	         
	         
	      numerocarte=0;
       if(c1%3==0)
       {
     	   
     	 l1.RiempiLibreria(lib,l1);
     	 l1.StampaLibreria(l1);
     	   if(ris1==0)
     	   {
     		   ris1=l1.Difficile(l1, number, numerogiocatori, primo);
     		   if (ris1!=0)
     		   {
     		    primo.punteggio=primo.punteggio+8;
     		   }
     	   }
     	   if (ris1!=0&&pt==0)
     	   {
     		  int supporto=ris1;
     		  ris1=0;
     		   ris1=l1.Difficile(l1, number, numerogiocatori, primo);
     		     if(ris1==8)
     		     {
     		    	 primo.punteggio=primo.punteggio+6;
     		     }
     		     else
     		     {
     		      ris1=supporto;
     		     }
     	   }
     	  if (ris1!=0&&pt!=0)
    	   {
    		  int supporto=ris1;
    		  ris1=0;
    		   ris1=l1.Difficile(l1, number, numerogiocatori, primo);
    		     if(ris1==8)
    		     {
    		    	 primo.punteggio=primo.punteggio+4;
    		     }
    		     else
    		     {
    		      ris1=supporto;
    		     }
    	   }
     	   if(ris2==0)
     	   {
     		   ris2=l1.Difficile(l1, number1, numerogiocatori, primo);
     		   if (ris2!=0)
     		   {
     		    primo.punteggio=primo.punteggio+8;
     		   }
     	   }
     	  if(ris2!=0&&pt2==0)
     	   {
     		  int supporto2=ris2;
     		  ris2=0;
     		   ris2=l1.Difficile(l1, number1, numerogiocatori, primo);
     		     if(ris2==8&&pt==0)
     		     {
     		    	 primo.punteggio=primo.punteggio+6;
     		    	 pt2=5;
     		     }
     		     else
     		     {
     		      ris2=supporto2;
     		     }
     	   }
     	 if(ris2!=0&&pt2!=0)
   	   {
   		  int supporto2=ris2;
   		  ris2=0;
   		   ris2=l1.Difficile(l1, number1, numerogiocatori, primo);
   		     if(ris2==8&&pt==0)
   		     {
   		    	 primo.punteggio=primo.punteggio+6;
   		    	 
   		     }
   		     else
   		     {
   		      ris2=supporto2;
   		     }
   	   }
     	  
     	   
     	finepartita=l1.LibreriaPiena2(l1);
     	    
       }
       if(c2%3==0)
       {
     	  l2.RiempiLibreria(lib,l2);
     	  l2.StampaLibreria(l2);
     	  
     	  if(ris1==0)
    	   {
    		   ris1=l2.Difficile(l2, number, numerogiocatori, secondo);
    		   if (ris1!=0)
    		   {
    		    secondo.punteggio=secondo.punteggio+8;
    		   }
    	   }
     	  
    	  if(ris1!=0&&pt==0)
    	   {
    		  int supporto=ris1;
    		  ris1=0;
    		   ris1=l2.Difficile(l2, number, numerogiocatori, secondo);
    		     if(ris1==8)
    		     {
    		    	 secondo.punteggio=secondo.punteggio+6;
    		    	 pt=5;
    		     }
    		     else
    		     {
    		      ris1=supporto;
    		     }
    	   }if(ris1!=0&&pt!=0)
    	   {
    		  int supporto=ris1;
    		  ris1=0;
    		   ris1=l2.Difficile(l2, number, numerogiocatori, secondo);
    		     if(ris1==8)
    		     {
    		    	 secondo.punteggio=secondo.punteggio+4;
    		    	
    		     }
    		     else
    		     {
    		      ris1=supporto;
    		     }
    	   }
    	  
    	   if(ris2==0)
    	   {
    		   ris2=l2.Difficile(l2, number1, numerogiocatori, secondo);
    		   if (ris2!=0)
    		   {
    		    secondo.punteggio=secondo.punteggio+8;
    		   }
    	   }
    	   if(ris2!=0&&pt2==0)
    	   {
    		  int supporto2=ris2;
    		  ris2=0;
    		   ris2=l2.Difficile(l2, number1, numerogiocatori, secondo);
    		     if(ris2==8)
    		     {
    		    	 secondo.punteggio=secondo.punteggio+6;
    		    	 pt2=5;
    		     }
    		     else
    		     {
    		      ris2=supporto2;
    		     }
    	   }
    	   if(ris2!=0&&pt2!=0)
    	   {
    		  int supporto2=ris2;
    		  ris2=0;
    		   ris2=l2.Difficile(l2, number1, numerogiocatori, secondo);
    		     if(ris2==8)
    		     {
    		    	 secondo.punteggio=secondo.punteggio+4;
    		    	 
    		     }
    		     else
    		     {
    		      ris2=supporto2;
    		     }
    	   }
    	   
    	  finepartita=l2.LibreriaPiena2(l2);
    	    
      }
       if(c3%3==0)
       {
     	  l3.RiempiLibreria(lib,l3);
     	  l3.StampaLibreria(l3);
     	  
     	  if(ris1==0)
    	   {
    		   ris1=l3.Difficile(l3, number, numerogiocatori, terzo);
    		   if (ris1!=0)
    		   {
    		    terzo.punteggio=terzo.punteggio+8;
    		   }
    	   }
    	   if (ris1!=0&&pt==0)
    	   {
    		  int supporto=ris1;
    		  ris1=0;
    		   ris1=l3.Difficile(l3, number, numerogiocatori, terzo);
    		     if(ris1==8)
    		     {
    		    	 terzo.punteggio=terzo.punteggio+6;
    		    	 pt=5;
    		     }
    		     else
    		     {
    		      ris1=supporto;
    		     }
    	   }
    	   if (ris1!=0&&pt!=0)
    	   {
    		  int supporto=ris1;
    		  ris1=0;
    		   ris1=l3.Difficile(l2, number, numerogiocatori, terzo);
    		     if(ris1==8)
    		     {
    		    	 terzo.punteggio=terzo.punteggio+4;
    		     }
    		     else
    		     {
    		      ris1=supporto;
    		     }
    	   }
    	   
    	   if(ris2==0)
    	   {
    		   ris2=l3.Difficile(l3, number1, numerogiocatori, terzo);
    		   if (ris2!=0)
    		   {
    			   terzo.punteggio=terzo.punteggio+8;
    		   }
    	   }
    	   if(ris2!=0&&pt2==0)
    	   {
    		  int supporto2=ris2;
    		  ris2=0;
    		   ris2=l3.Difficile(l3, number1, numerogiocatori, terzo);
    		     if(ris2==8)
    		     {
    		    	 terzo.punteggio=terzo.punteggio+6;
    		    	 pt2=5;
    		     }
    		     else
    		     {
    		      ris2=supporto2;
    		     }
    	   }
    	   if(ris2!=0&&pt2!=0)
    	   {
    		  int supporto2=ris2;
    		  ris2=0;
    		   ris2=l3.Difficile(l3, number1, numerogiocatori, terzo);
    		     if(ris2==8)
    		     {
    		    	 terzo.punteggio=(terzo.punteggio)+4;
    		     }
    		     else
    		     {
    		      ris2=supporto2;
    		     }
    	   }
    	   
    	   
    	   
    	  finepartita=l3.LibreriaPiena2(l3);
    	    
      }
       
     	  
       
       lib=null;
       
	      System.out.println("Fine del turno. Tocca al giocatore successivo");  
	      c1++;
	      c2++;
	      c3++;
        	
        	
        	}while(finepartita==false); 
             numerocarte=0;
             punteggiop=0;
             punteggios=0;
           
            punteggiop=h.PunteggioPersonale(l1,m1 );
        	punteggios=h.PunteggioPersonale(l2, m2);
        	punteggiot=h.PunteggioPersonale(l3, m3);
        	primo.punteggio=primo.punteggio+punteggiop;
        	secondo.punteggio=secondo.punteggio+punteggios;
        	punteggiop=0;
        	punteggiop=l1.PuntiTessereAd(l1);
        	primo.punteggio=primo.punteggio+punteggiop;
        	punteggios=0;
        	punteggios=l2.PuntiTessereAd(l2);
        	secondo.punteggio=secondo.punteggio+punteggios;
        	terzo.punteggio=terzo.punteggio+punteggiot;
        	punteggiot=0;
        	punteggiot=l3.PuntiTessereAd(l3);
        	terzo.punteggio=terzo.punteggio+punteggiot;
        	
        	  if((c1-1)%3==0)
        	  {
        		  primo.punteggio=primo.punteggio+1;
        	  }
        	  if((c2-1)%3==0)
        	  {
        		  secondo.punteggio=secondo.punteggio+1;
        	  }
        	  if((c3-1)%3==0)
        	  {
        		  terzo.punteggio=terzo.punteggio+1;
        	  }
        	  
        	  if(primo.punteggio>secondo.punteggio)
        	  {
        		  if(secondo.punteggio>terzo.punteggio)
        		  {
        		  
        		  System.out.println("HA VINTO IL GIOCATORE "+primo.getNome(primo)+" con "+primo.punteggio+" punti");
        		  System.out.println("Il secondo classificato è "+secondo.getNome(secondo)+" con "+secondo.punteggio);
        		  System.out.println("Il terzo classificato è "+terzo.getNome(terzo)+" con "+terzo.punteggio);
        		  }
        		  if(terzo.punteggio>primo.punteggio)
        		  {
        		  
        		  System.out.println("HA VINTO IL GIOCATORE "+terzo.getNome(terzo)+" con "+terzo.punteggio+" punti");
        		  System.out.println("Il secondo classificato è "+primo.getNome(primo)+" con "+primo.punteggio);
        		  System.out.println("Il terzo classificato è "+secondo.getNome(secondo)+" con "+secondo.punteggio);
        		  }
        		  
        	  }
        	  if(secondo.punteggio>primo.punteggio)
        	  {
        		  if(terzo.punteggio>secondo.punteggio)
        		  {
        		  
        		  System.out.println("HA VINTO IL GIOCATORE "+terzo.getNome(terzo)+" con "+terzo.punteggio+" punti");
        		  System.out.println("Il secondo classificato è "+secondo.getNome(secondo)+" con "+secondo.punteggio);
        		  System.out.println("Il terzo classificato è "+primo.getNome(primo)+" con "+primo.punteggio);
        		  }
        		  if(primo.punteggio>terzo.punteggio)
        		  {
        		  
        		  System.out.println("HA VINTO IL GIOCATORE "+secondo.getNome(terzo)+" con "+secondo.punteggio+" punti");
        		  System.out.println("Il secondo classificato è "+primo.getNome(primo)+" con "+primo.punteggio);
        		  System.out.println("Il terzo classificato è "+terzo.getNome(secondo)+" con "+terzo.punteggio);
        		  }
        		  
        	  }
        	  if(primo.punteggio>terzo.punteggio)
        	  {
        		  if(terzo.punteggio>secondo.punteggio)
        		  {
        		  
        		  System.out.println("HA VINTO IL GIOCATORE "+primo.getNome(primo)+" con "+primo.punteggio+" punti");
        		  System.out.println("Il secondo classificato è "+terzo.getNome(terzo)+" con "+terzo.punteggio);
        		  System.out.println("Il terzo classificato è "+secondo.getNome(secondo)+" con "+secondo.punteggio);
        		  }
        	  }
        		
        	  if(secondo.punteggio>terzo.punteggio)
        	  {
        		  if(terzo.punteggio>primo.punteggio)
        		  {
        		  
        		  System.out.println("HA VINTO IL GIOCATORE "+secondo.getNome(secondo)+" con "+secondo.punteggio+" punti");
        		  System.out.println("Il secondo classificato è "+terzo.getNome(terzo)+" con "+terzo.punteggio);
        		  System.out.println("Il terzo classificato è "+primo.getNome(primo)+" con "+primo.punteggio);
        		  }
        	  }
        	
        	break;
            
        case 4:
        	
        	while(nome1.isEmpty()||nome2.isEmpty()||nome3.isEmpty()||nome4.isEmpty()||nome1.equals(nome2)||nome2.equals(nome3)||nome3.equals(nome1)||nome1.equals(nome4)||nome2.equals(nome4)||nome3.equals(nome4))
        	{
        	System.out.println("Inserisci il nome del primo giocatore");
        	nome1=sc.nextLine();
        	System.out.println("Inserisci il nome del secondo giocatore");
        	nome2=sc.nextLine();
        	System.out.println("Inserisci il nome del terzo giocatore");
        	nome3=sc.nextLine();
        	System.out.println("Inserisci il nome del quarto giocatore");
        	nome4=sc.nextLine();
        	
        	if(nome1.isEmpty()||nome2.isEmpty()||nome3.isEmpty()||nome4.isEmpty())
        	{System.out.println("I nomi dei giocatori non possono essere vuoti. Riprova");
        	} else if(nome1.equals(nome2)||nome2.equals(nome3)||nome3.equals(nome1)||nome1.equals(nome4)||nome2.equals(nome4)||nome3.equals(nome4))
        	{System.out.println("I nomi dei giocatori non possono essere uguali. Riprova");
        	
        	}}
        	 
        	primo= new Giocatore (nome1);
        	secondo= new Giocatore(nome2);
        	terzo= new Giocatore(nome3);
        	//Giocatore quarto= new Giocatore(nome4);
        	
        	do {
            	
            	
            	
            	
            	
            	
         do {
        	 correttezza=false;
	         correttezza2=false;
        	
        	 do
         
       	     {
       	    	 System.out.println("Inserisci il numero di tessere adiacenti tra loro che vuoi prelevare, da 1 a 3");
       	    	 numerocarte= sc.nextInt();
       	     }while(numerocarte>3||numerocarte<1);
                
                if (numerocarte==1)
                {
                
       	         do {
       	    	    do {
       	    	         System.out.println("Inserisci la riga della tessera da prelevare");
       	    	         riga=sc.nextInt();
       	    	       }while(riga<1||riga>9);
            	  
            	    do
            	    	{
            	    	  System.out.println("Inserisci la colonna della tessera da prelevare");
            	    	  colonna=sc.nextInt();
            	    	}while(colonna<1||colonna>9);
            	    
            	     
                     correttezza=p.Controllo(t, riga, colonna, numerocarte, ng);
                     
                     correttezza2=p.Controllo2(t);
                     
                     
    	            }  while(correttezza==false||correttezza2==false);
       	         
       	       
       	        	
       	        	
       	        	lib=Plancia.Prelievo(t, riga, colonna);
       	        	
       	            t=Plancia.AggiornaMatrice(t,riga,colonna);
                }//fine if carte==1
                
                
                if(numerocarte==2)
                {
                	
                	 do 
    	        	 {
           	    	         System.out.println("Inserisci la riga della prima tessera da prelevare, questa sarà la riga di partenza");
           	    	         riga=sc.nextInt();
           	    	       
                	  
                	   
                	    	 System.out.println("Inserisci la colonna della prima tessera da prelevare, questa sarà la riga di partenza");
                	    	 colonna=sc.nextInt();
                	    	
                	    
                	   
                		     System.out.println("Vuoi prelevare la seconda tessera in verticale o orizzontale? v/o");
                	       
                	      
                	         r=sca0.nextLine();
                	         
                	         rc=r.charAt(0);
                	         
                	       
                	   
                	   
                	         if(rc=='v')
                	         {
                	        	
                	        		 
                	        	 

                		       
                		        	   System.out.println("Vuoi passare alla riga inferiore (+1) o superiore (-1) per la seconda tessera?");

                		       
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
                	        	 
                		        System.out.println("Vuoi passare alla colonna successiva (+1) o precedente (-1) per la seconda tessera?");
                		        b=sc.nextInt();
                		         
                		        
                      	           
                      	            	
                      	            		 correttezza=p.Controllocolonne2(t, riga, colonna, b, ng);
                      	                     correttezza2=p.Controllo2(t);
                      	                     
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
                	
                	         System.out.println("Inserisci la riga della prima tessera da prelevare, questa sarà la riga di partenza");
           	    	         riga=sc.nextInt();
           	    	       
                	  
                	   
                	    	 System.out.println("Inserisci la colonna della prima tessera da prelevare, questa sarà la riga di partenza");
                	    	 colonna=sc.nextInt();
                	    	
                	    
                	   
                		     System.out.println("Vuoi prelevare le altre tessere in verticale o orizzontale? v/o");
                	       
                	      
                	         r=sca0.nextLine();
                	         
                	         rc=r.charAt(0);
                	         
                	       
                	   
                	   
                	         if(rc=='v')
                	         {
                	        	
                	        		 
                	        	 

                		       
                		        	   System.out.println("Vuoi passare alla riga inferiore (+1) o superiore (-1) per la seconda tessera?");

                		       
                		        	   a=sc.nextInt();
                		        	   System.out.println("Vuoi passare a due righe inferiori (+2) o superiori (-2) rispetto alla riga di partenza per la terza tessera?" );
                            	        
                		        	   c=sc.nextInt();
                		        
                      	           
                      	            	
                      	            		 correttezza=p.Controllorighe3(t, riga, colonna, a,numerogiocatori,c);
                      	                     correttezza2=p.Controllo2(t);
                      	                     if(correttezza==true&&correttezza2==true)
                      	                     {
                      	                    	lib=Plancia.Prelievorighe3(t, riga, colonna,a,c); 
                      	          	            t=Plancia.AggiornaMatricerighe3(t,riga,colonna,a,c);
                      	            	   
                      	                    
                      	                     }
                      	                     
                      	                   
                          	            	
                          	            		 
                      	            	
                      	            
                	         }
                	         
                	         

                    	         
                    	           
                    	           
                	         
                	         
                	         if(rc=='o')
                	         {
                	        	 
                		        System.out.println("Vuoi passare alla colonna successiva (+1) o precedente (-1) per la seconda tessera?");
                		        b=sc.nextInt();
                		        System.out.println("Vuoi passare a due colonne successive (+2) o precedenti (-2) rispetto alla colonna di partenza per la terza tessera?");
                		        d=sc.nextInt();
                		         
                		        
                      	           
                      	            	
                      	            		 correttezza=p.Controllocolonne3(t, riga, colonna, b, ng,d);
                      	                     correttezza2=p.Controllo2(t);
                      	                   if(correttezza==true&&correttezza2==true)
                    	                     {
                    	                    	lib=Plancia.Prelievocolonne3(t, riga, colonna,b,d); 
                    	          	            t=Plancia.AggiornaMatricecolonne3(t,riga,colonna,b,d);
                    	            	   
                    	                    
                    	                     }
                      	                   
                      	                   
                	         }
                	         
                        }}while(correttezza==false||correttezza2==false);
                	 
                	  
                	   
                		   
                        
                	         
                      	            		 
                      	            	
                      	            	
                      	           
                   
                
        	
       	         
       	            for ( i=0;i<numerocarte;i++)
       	            {
       	            	//System.out.println("metodo2 "+lib.get(i).getInizialeColore());
       	            }
       	            
       	         for(int k=0;k<9;k++)
                 {
                 	for(int w=0;w<9;w++)
                 	{
                 		System.out.print(t[k][w].getInizialeColore());
                 	}
                 	System.out.println("");
                 
                 }
       	         
       	         
       	       System.out.println("Fine del turno. Tocca al giocatore successivo"); 
            }while(finepartita==false); 
            numerocarte=0;
        	
        	
        	break;

   	         }
        
	
	
	
	
	}}
