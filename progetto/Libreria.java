package progetto;

import java.util.ArrayList;
import java.util.Scanner;

import Funzionalità.Ciclico;

public class Libreria  {
	private String nomegiocatore;
	private int numgiocatore;
	public Tessera [][] casellario;
	private boolean [][] riempimentocasella;

	public Libreria (String giocatore, int ngiocatore)
	{
		this.nomegiocatore=giocatore;
		this.numgiocatore= ngiocatore;
	    this.casellario= new Tessera [6][5];
	    this.riempimentocasella= new boolean [6][5];
	        for (int i=0;i<6;i++)
	        {
	        	for (int j=0;j<5;j++)
	        	{
	        		riempimentocasella[i][j]=false;
	        		casellario[i][j]= new Tessera(1000,"0","Nera");
	        	}
	        }
	     
	}

	public void RiempiLibreria ( ArrayList <Tessera> lib, Libreria l)
	{

		int lunghezza= lib.size();
		System.out.println
		("Lunghezza "+lunghezza);
		Scanner sc= new Scanner(System.in);
		int a=0;
		int i=0;
		int r=0;
		boolean ctr=false;
		boolean check=false;
		char sel;
		String sel1;
		i=lunghezza-1;
		do
		{
			System.out.println("");
			sel1=sc.nextLine();
			
				System.out.println("Inserisci la colonna");
				 a=sc.nextInt();
				 
				 r=Controllor(a,lunghezza,l);
				 System.out.println(r);
				  if(r!=-6)
				   {
					   for(int j=r;j>r-lunghezza;j--)
					   {
						   System.out.println("J"+j);
						   if(l.riempimentocasella[j][a-1]==false)
						   {
							   l.casellario[j][a-1]=lib.get(i);
							   i--;
							   System.out.println("J"+j);
							   l.riempimentocasella[j][a-1]=true;
							   
							   ctr=true;
						   }
					   }
				   
			   }
			   
		System.out.println("ctr"+ctr);		   
			
		}while(ctr==false);

		  //if(l.riempimentocasella[criga][ccolonna]==false)
		  {
			  //casellario[criga][ccolonna]=lib.get();
			  //riempimentocasella[criga][ccolonna]=true;
		  }
		 // else
		  {
			 // System.out.println("Casella già occupata");
		  }



	}
	
	public int Controllor(int a, int lunghezza,Libreria l)
	{
		int i=0,contatore=0;
		boolean check=false;
		int riga=0;
		   for(i=5;i>=0;i--)
		   {
			 if(lunghezza==1&&i>=0)
			 {
				 
			
			   if(l.riempimentocasella[i][a-1]==false)
			   {
				   
				   riga=i;
				   i=-6;
				   
			   }
			   else
			   {
				   riga=-6;
			   }
			   
		     }
			 
			 if (lunghezza==2&&i-1>=0)
			 {
				 System.out.println("i "+i);
				 
				 if(l.riempimentocasella[i][a-1]==false&&l.riempimentocasella[i-1][a-1]==false)
				 {
					  
					  
					   riga=i;
					   i=-6;
				 }
				 else
				   {
					   riga=-6;
				   }
			 }
			 if (lunghezza==3&&i-2>=0)
			 {
				 System.out.println("i "+i);
				 
				 if(l.riempimentocasella[i][a-1]==false&&l.riempimentocasella[i-1][a-1]==false&&l.riempimentocasella[i-2][a-1]==false)
				 {
					  
					   
					   riga=i;
					   i=-6;
					   
				 }
				 else
				   {
					   riga=-6;
				   }
			 }
			 
		   
		   
		   
		   }
		   System.out.println("Riga"+riga);
		return riga;
	}
	public boolean Controlr(int a, int lunghezza,Libreria l)
	{
		int i=0,contatore=0;
		boolean check=false;
		   for(i=5;i>=0;i--)
		   {
			   if(riempimentocasella[i][a-1]==false)
			   {
				   contatore++;
			   }
		   }
		   if(contatore>=lunghezza)
		   {
			   check=true;
		   }
		return check;
	}
	
	public void StampaLibreria(Libreria l)
	{
		System.out.println("Casellario di "+l.getGiocatore(l));
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print(l.casellario[i][j].getInizialeColore());
				
			}
			System.out.println("");
		}
	}
	
	
	
	public boolean getCasellaDisponibile(int criga, int ccolonna,Libreria l)
	{
		return riempimentocasella[criga][ccolonna];
	}

	public Tessera getCarta(int riga, int colonna)
	{
		return casellario[riga][colonna];
	}

	public String getGiocatore(Libreria r)
	{
		return r.nomegiocatore;
	}
	public int getPosGiocatore(Libreria r)
	{
		return r.numgiocatore;
	}
	public boolean SpazioDisponibile(Libreria r, int carte)
	{
		int contatore=0;
		boolean a=false;
		   for (int i=5;i>=0;i--)
		   {
			   for(int j=4;j>=0;j--)
			   {
				   if(r.riempimentocasella[i][j]==false)
				   {
					   contatore++;
				   }
			   }
		   }
		   
		   if(contatore>=carte)
		   {
			   a=true;
		   }
		   return a;
	}
	
	public boolean LibreriaPiena(Libreria l)
	{
		boolean a=false;
	    int contatore=0;
		  for(int i=0;i<5;i++)
		  {
			  if(l.riempimentocasella[0][i]==true)
			  {
				  contatore++;
			  }
				  
		  }
		  if(contatore>=5)
		  {
			  a=true;
		  }
		 return true;
	}
	
	
	public int PuntiTessereAd(Libreria l)
	{
		 char a[][]= new char[6][5];
		 int punteggio=0;
		 ArrayList <Integer> elementi= new ArrayList();
		  for(int i=0;i<6;i++)
		  {
			  for(int j=0;j<5;j++)
			  {
				  //a[i][j]=l.casellario[i][j].getInizialeColore();
				  
				  
			  }
			  
		  }
		  for (int i = 0; i < 6; i++) {
   		    for (int j = 0; j < 5; j++) {
   		        a[i][j] = 'X';
   		    }
   		}
   		
   		a[3][0] = 'R'; 
   		a[0][4] = 'B';
   		a[1][1] = 'V';
   		a[5][3] = 'G';
   		a[2][2] = 'A';
   		a[4][3] = 'W';
   		a[0][0]='A';
   		a[0][1]='A';
   		a[0][2]='A';
   		a[0][3]='A';
   		
   		
   		
		 Ciclico prova= new Ciclico(a);
		 
		   elementi=Ciclico.Main(a);
		   int lunghezza=  elementi.size();
		      for(int i=0;i<lunghezza;i++)
		      {
		    	  if(elementi.get(i)==3)
		    	  {
		    		  punteggio=punteggio+2;
		    	  }
		    	  if(elementi.get(i)==4)
		    	  {
		    		  punteggio=punteggio+3;
		    	  }
		    	  if(elementi.get(i)==5)
		    	  {
		    		  punteggio=punteggio+5;
		    	  }
		    	  if(elementi.get(i)>=6)
		    	  {
		    		  punteggio=punteggio+8;
		    	  }
		    	  
		    	      }
		      System.out.println("Punteggio"+punteggio);
		      return punteggio;	
		     
    }
	

}
