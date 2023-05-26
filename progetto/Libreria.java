package progetto;

import java.util.ArrayList;
import java.util.Scanner;

public class Libreria  {
	private String nomegiocatore;
	private int numgiocatore;
	private Tessera [][] casellario;
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
		boolean check=false;
		char sel;
		String sel1;
		do
		{
			System.out.println("Vuoi mettere le tue "+lunghezza+" carte in verticale o in orizzontale? v/o");
			sel1=sc.nextLine();
			sel=sel1.charAt(0);
			   if(sel=='o')
			   {
				   System.out.println("Inserisci la colonna di partenza, le carte vengono caricate dalla prima andando verso dx");
				   a=sc.nextInt();
				   r=Controllor(a,lunghezza,l);
				   if(r<10)
				   {
					   for(int j=a-1;j<=a-1+lunghezza&&i<lunghezza;j++)
					   {
						   if(riempimentocasella[r][j]==false)
						   {
							   casellario[r][j]=lib.get(i);
							   i++;
						   }
					   }
				   }
			   }if(sel=='c')
			   {
				   System.out.println("Inserisci la colonna");
				   a=sc.nextInt();
				   check=Controlr(a,lunghezza,l);
				   if(check==true)
				   {
					   for(int j=5;j>=0&&i<=lunghezza;j--)
					   {
						   if(riempimentocasella[j][a-1]==false)
						   {
							   casellario[j][a-1]=lib.get(i);
							   i++;
						   }
					   }
				   }
			   }
			
		}while(r>5);

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
		
		for (i=5;i>=0;i--)
		{
			if(lunghezza==1)
			{
				System.out.println("Rigaaa1 "+riga);
			   if(riempimentocasella[i][a-1]==false)
			    {
				   riga=i;
				   i=-6;
				   System.out.println("i"+i);
				   
				   System.out.println("Rigaaa2 "+riga);
				   check=true;
			    }
			}//fine lughezza1
			
			{
				if( lunghezza==2)
				{
					 if(riempimentocasella[i][a-1]==false)
					 {
						 if(riempimentocasella[i][a]==false)
						 {
							 riga=i;
							   i=-6;
							   check=true;
						 }
					 }
				}//fine lunghezza2
				
				{
					if (lunghezza==3)
					{
						 if(riempimentocasella[i][a-1]==false)
						 {
							 if(riempimentocasella[i][a]==false)
							 {
								 if(riempimentocasella[i][a+1]==false)
									 {
										 riga=i;
								         i=-6;
								        		 
								         check=true;
									 }
							 }
						 }
					}
				}
				
				
			}
		}
		 if(check==false)
		 {
			 riga=10;
		 }
		 System.out.println("Rigaaa "+riga);
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
		System.out.println("Casellario");
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=4;j++)
			{
				System.out.print(casellario[i][j].getInizialeColore());
				
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

}
