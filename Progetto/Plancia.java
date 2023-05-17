package Progetto;

import java.util.ArrayList;
import java.util.Arrays;

import Funzionalità.Ciclico;

public class Plancia {
	public Tessera []riga1;
	public Tessera []riga2;
	public Tessera []riga3;
	public Tessera []riga4;
	public Tessera []riga5;
	public Tessera []riga6;
	public Tessera []riga7;
	public Tessera []riga8;
	public Tessera []riga9;
	char ngioc;
	
	public Plancia (char ngioc)
	{
	 this.ngioc=ngioc;
	 
	 System.out.println("ngioc "+ngioc);
		switch (ngioc)
		{
			case'2':
				
				System.out.println("Ciaooooo");
				this.riga2=new Tessera[2];
				this.riga3=new Tessera[3];
				this.riga4=new Tessera[6];
				this.riga5=new Tessera[7];
				this.riga6=new Tessera[6];
				this.riga7=new Tessera[3];
				this.riga8=new Tessera[2];
				break;
			case'3':
				
				this.riga1=new Tessera[1];
				this.riga2=new Tessera[2];
				this.riga3=new Tessera[5];
				this.riga4=new Tessera[7];
				this.riga5=new Tessera[7];
				this.riga6=new Tessera[7];
				this.riga7=new Tessera[5];
				this.riga8=new Tessera[2];
				this.riga9=new Tessera[1];
				break;
			
			case '4':
				this.riga1=new Tessera[2];
				this.riga2=new Tessera[3];
				this.riga3=new Tessera[5];
				this.riga4=new Tessera[8];
				this.riga5=new Tessera[9];
				this.riga6=new Tessera[8];
				this.riga7=new Tessera[5];
				this.riga8=new Tessera[3];
				this.riga9=new Tessera[2];
				break;
				
		}
	
	}
  public void CaricaCarte(ArrayList <Tessera> c, Plancia p)
  {
	  int i;
	 switch(p.ngioc)
	  {
	  
	  case'2':
		  int posizione=0,j=0;
			this.riga1=null;
			 for(i=posizione;i<posizione+2;i++)
			 {
				 this.riga2[j]=c.get(i);
				 j++;
			 }
		     posizione=i;
		     j=0;
		     
		     System.out.println("Posizione "+posizione);
			 for(i=posizione;i<posizione+3;i++)
			 {
				 this.riga3[j]=c.get(i);
				 j++;
			 }
			 j=0;
			 posizione=i;
			 for(i=posizione;i<posizione+6;i++)
			 {
				 this.riga4[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 this.riga5[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+6;i++)
			 {
				 this.riga6[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+3;i++)
			 {
				 this.riga7[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+2;i++)
			 {
				 this.riga8[j]=c.get(i);
				 j++;
			 }
			 
		
			
			break;
		case'3':
			j=0;
			posizione=1; //adattare come sopra il caricamento e poi stampare
			this.riga1[0]=c.get(0);
			 for(i=posizione;i<posizione+2;i++)
			 {
				 this.riga2[j]=c.get(i);
				 j++;
			 }
		     posizione=i;
		     j=0;
			 for(i=posizione;i<posizione+5;i++)
			 {
				 this.riga3[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 this.riga4[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 this.riga5[j]=c.get(i);
				 j++;
				 
			 }
			 j=0;
			 posizione=i;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 this.riga6[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+5;i++)
			 {
				 this.riga7[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+2;i++)
			 {
				 this.riga8[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+1;i++)
			 {
				 this.riga9[j]=c.get(i);
				 j++;
			 }
		
			
			

			
			break;
		
		case '4':
			posizione=0;
			j=0;
			for(i=posizione;i<posizione+2;i++)
			 {
				 this.riga1[j]=c.get(i);
				 j++;
			 }
			posizione=i;
		     j=0;
			
			 for(i=posizione;i<posizione+3;i++)
			 {
				 this.riga2[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
		     j=0;
			 for(i=posizione;i<posizione+5;i++)
			 {
				 this.riga3[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
		     j=0;
			 for(i=posizione;i<posizione+8;i++)
			 {
				 this.riga4[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
		     j=0;
			 for(i=posizione;i<posizione+9;i++)
			 {
				 this.riga5[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
		     j=0;
			 for(i=posizione;i<posizione+8;i++)
			 {
				 this.riga6[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
		     j=0;
			 for(i=posizione;i<posizione+5;i++)
			 {
				 this.riga7[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
		     j=0;
			 for(i=posizione;i<posizione+3;i++)
			 {
				 this.riga8[j]=c.get(i);
				 j++;
			 }
			 posizione=i;
		     j=0;
			 for(i=posizione;i<posizione+2;i++)
			 {
				 this.riga9[j]=c.get(i);
				 j++;
			 }
		
			
			
			break;
	  }
  }
  
  public void StampaCarte(Plancia p)
  {
	  char[] rigac1=new char[2];
	  char [] rigac2= new char[3];
	  char [] rigac3= new char[5];
	  char [] rigac4= new char[8];
	  char [] rigac5= new char[9];
	  char [] rigac6= new char[8];
	  char [] rigac7= new char[5];
	  char [] rigac8= new char[3];
	  char [] rigac9= new char[2];
	  int posizione=0,j=0;
	  int i;
	  switch(p.ngioc)
	  {
	  
	      case'2':
		 
		  
		  
			this.riga1=null;
			 for(i=posizione;i<posizione+2;i++)
			 {
				 
				 rigac2[j]=riga2[j].getInizialeColore();
				
				 j++;
			 }
			 System.out.println("         "+Arrays.toString(rigac2));
		     posizione=i;
		     j=0;
		     
			 for(i=posizione;i<posizione+3;i++)
			 {
				 rigac3[j+1]=riga3[j].getInizialeColore();
				 j++;
			 }
			 System.out.println("       "+ Arrays.toString(rigac3));
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+6;i++)
			 {
				 rigac4[j+1]=riga4[j].getInizialeColore();
				 j++;
			 }
			 System.out.println("    "+Arrays.toString(rigac4));
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 rigac5[j+1]=riga5[j].getInizialeColore();
				 j++;
			 }
			 posizione=i;
			 System.out.println(" "+ Arrays.toString(rigac5));
			 j=0;
			 for(i=posizione;i<posizione+6;i++)
			 {
				 rigac6[j+1]=riga6[j].getInizialeColore();
				 j++;
			 }
			 posizione=i;
			 System.out.println( " "+Arrays.toString(rigac6));
			 j=0;
			 for(i=posizione;i<posizione+3;i++)
			 {
				 rigac7[j+1]=riga7[j].getInizialeColore();
				 j++;
			 }
			 posizione=i;
			 j=0;
			 System.out.println( "       "+Arrays.toString(rigac7));
			 for(i=posizione;i<posizione+2;i++)
			 {
				 rigac8[j+1]=riga8[j].getInizialeColore();
				 j++;
			 }
			 System.out.println("       "+ Arrays.toString(rigac8));
			 
		
			
			break;
	  case'3':
		  posizione=0;
		  rigac1[0]=riga1[0].getInizialeColore();
		  System.out.println("         "+Arrays.toString(rigac1));
		  for(i=posizione;i<posizione+2;i++)
			 {
				 
				 rigac2[j]=riga2[j].getInizialeColore();
				
				 j++;
			 }
			 System.out.println("         "+Arrays.toString(rigac2));
		     posizione=i;
		     j=0;
		     
			 for(i=posizione;i<posizione+5;i++)
			 {
				 rigac3[j]=riga3[j].getInizialeColore();
				 j++;
			 }
			 System.out.println("      "+ Arrays.toString(rigac3));
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 rigac4[j+1]=riga4[j].getInizialeColore();
				 j++;
			 }
			 System.out.println("    "+Arrays.toString(rigac4));
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 rigac5[j+1]=riga5[j].getInizialeColore();
				 j++;
			 }
			 posizione=i;
			 System.out.println(" "+ Arrays.toString(rigac5));
			 j=0;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 rigac6[j]=riga6[j].getInizialeColore();
				 j++;
			 }
			 posizione=i;
			 System.out.println( ""+Arrays.toString(rigac6));
			 j=0;
			 for(i=posizione;i<posizione+5;i++)
			 {
				 rigac7[j]=riga7[j].getInizialeColore();
				 j++;
			 }
			 posizione=i;
			 j=0;
			 System.out.println( "      "+Arrays.toString(rigac7));
			 for(i=posizione;i<posizione+2;i++)
			 {
				 rigac8[j+1]=riga8[j].getInizialeColore();
				 j++;
			 }
			 posizione=i;
			 System.out.println("          "+ Arrays.toString(rigac8));
			 rigac9[1]=riga9[0].getInizialeColore();
			 System.out.println("             "+Arrays.toString(rigac9));
			 
			 
			
			

			
			break;
	  case '4':
			posizione=0;
			//for(i=posizione;i<posizione+2;i++)
			 {
				 System.out.println(riga1[0].getColore()+riga1[1].getColore());
			 }
			
			 for(i=posizione;i<posizione+3;i++)
			 {
				 System.out.println(riga2[i].getColore());
			 }
		     posizione=i;
			 for(i=posizione;i<posizione+5;i++)
			 {
				 System.out.println(riga3[i].getColore());
			 }
			 posizione=i;
			 for(i=posizione;i<posizione+8;i++)
			 {
				 System.out.println(riga4[i].getColore());
			 }
			 posizione=i;
			 for(i=posizione;i<posizione+9;i++)
			 {
				 System.out.println(riga5[i].getColore());
			 }
			 posizione=i;
			 for(i=posizione;i<posizione+8;i++)
			 {
				 System.out.println(riga6[i].getColore());
			 }
			 posizione=i;
			 for(i=posizione;i<posizione+5;i++)
			 {
				 System.out.println(riga7[i].getColore());
			 posizione=i;
			 }
			 for(i=posizione;i<posizione+3;i++)
			 {
				 System.out.println(riga8[i].getColore());
			 }
			 posizione=i;
			 for(i=posizione;i<posizione+2;i++)
			 {
				 System.out.println(riga9[i].getColore());
			 }
		
			
			
			break;
			
		
	  
  }
	 
	 
	
	 
}
}
  
