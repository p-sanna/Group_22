package progetto;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



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
	int posizione=0;
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
		 int j=0;
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
			posizione++; //adattare come sopra il caricamento e poi stampare
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
  
  public Tessera[][] StampaCarte(Plancia p)
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
	  Tessera t[][]= new Tessera[9][9];
	  int posizione=0,j=0;
	  int i;
	  switch(p.ngioc)
	  {
	  
	      case'2':
		 
		  
		  
			this.riga1=null;
			for(int k=0;k<9;k++)
			{
				for(int w=0;w<9;w++)
				{
				t[w][k]=new Tessera(1000,"0n","nero");
				
				}
				
			}
			
			
			{
				
			}
			 for(i=posizione;i<posizione+2;i++)
			 {
				 
				 rigac2[j]=riga2[j].getInizialeColore();
				 t[1][j+3]=riga2[j];
				
				 j++;
			 }
			 System.out.println("         "+Arrays.toString(rigac2));
		     posizione=i;
		     j=0;
		     
			 for(i=posizione;i<posizione+3;i++)
			 {
				 rigac3[j+1]=riga3[j].getInizialeColore();
				 t[2][j+3]=riga3[j];
				 
				 j++;
			 }
			 System.out.println("       "+ Arrays.toString(rigac3));
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+6;i++)
			 {
				 rigac4[j+1]=riga4[j].getInizialeColore();
				 t[3][j+2]=riga4[j];
				 j++;
			 }
			 System.out.println("    "+Arrays.toString(rigac4));
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 rigac5[j+1]=riga5[j].getInizialeColore();
				 t[4][j+1]=riga5[j];
				 j++;
			 }
			 posizione=i;
			 System.out.println(" "+ Arrays.toString(rigac5));
			 j=0;
			 for(i=posizione;i<posizione+6;i++)
			 {
				 rigac6[j+1]=riga6[j].getInizialeColore();
				 t[5][j+1]=riga6[j];
				 j++;
			 }
			 posizione=i;
			 System.out.println( " "+Arrays.toString(rigac6));
			 j=0;
			 for(i=posizione;i<posizione+3;i++)
			 {
				 rigac7[j+1]=riga7[j].getInizialeColore();
				 t[6][j+3]=riga7[j];
				 j++;
			 }
			 posizione=i;
			 j=0;
			 System.out.println( "       "+Arrays.toString(rigac7));
			 for(i=posizione;i<posizione+2;i++)
			 {
				 rigac8[j+1]=riga8[j].getInizialeColore();
				 t[7][j+4]=riga8[j];
				 j++;
				 
			 }
			 System.out.println("          "+ Arrays.toString(rigac8));
			 
		
			
			break;
	  case'3':
		  for(int k=0;k<9;k++)
			{
				for(int w=0;w<9;w++)
				{
				t[w][k]=new Tessera(1000,"0n","nero");
				
				}
				
			}
		  posizione=1;
		  rigac1[0]=riga1[0].getInizialeColore();
		  t[0][3]=riga1[0];
		  System.out.println("         "+Arrays.toString(rigac1));
		  for(i=posizione;i<posizione+2;i++)
			 {
				 
				 rigac2[j]=riga2[j].getInizialeColore();
				 t[1][j+3]=riga2[j];
				
				 j++;
			 }
			 System.out.println("         "+Arrays.toString(rigac2));
		     posizione=i;
		     j=0;
		     
			 for(i=posizione;i<posizione+5;i++)
			 {
				 rigac3[j]=riga3[j].getInizialeColore();
				 t[2][j+2]=riga3[j];
				 j++;
			 }
			 System.out.println("      "+ Arrays.toString(rigac3));
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 rigac4[j+1]=riga4[j].getInizialeColore();
				 t[3][j+2]=riga4[j];
				 j++;
			 }
			 System.out.println("    "+Arrays.toString(rigac4));
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 rigac5[j+1]=riga5[j].getInizialeColore();
				 t[4][j+1]=riga5[j];
				 j++;
			 }
			 posizione=i;
			 System.out.println(" "+ Arrays.toString(rigac5));
			 j=0;
			 for(i=posizione;i<posizione+7;i++)
			 {
				 rigac6[j]=riga6[j].getInizialeColore();
				 t[5][j]=riga6[j];
				 j++;
			 }
			 posizione=i;
			 System.out.println( ""+Arrays.toString(rigac6));
			 j=0;
			 for(i=posizione;i<posizione+5;i++)
			 {
				 rigac7[j]=riga7[j].getInizialeColore();
				 t[6][j+2]=riga7[j];
				 j++;
			 }
			 posizione=i;
			 j=0;
			 System.out.println( "      "+Arrays.toString(rigac7));
			 for(i=posizione;i<posizione+2;i++)
			 {
				 rigac8[j+1]=riga8[j].getInizialeColore();
				 t[7][j+4]=riga8[j];
				 j++;
			 }
			 posizione=i;
			 j=0;
			 System.out.println("          "+ Arrays.toString(rigac8));
			 rigac9[1]=riga9[0].getInizialeColore();
			 t[8][j+5]=riga9[j];
			 System.out.println("             "+Arrays.toString(rigac9));
			 
			 
			
			

			
			break;
	  case '4':
		  for(int k=0;k<9;k++)
			{
				for(int w=0;w<9;w++)
				{
				t[w][k]=new Tessera(1000,"0n","nero");
				
				}
				
			}
		  
		  rigac1[0]=riga1[0].getInizialeColore();
		  t[0][3]=riga1[0];
		  t[0][4]=riga1[1];
		  posizione=2;
		  rigac1[0]=riga1[0].getInizialeColore();
		  rigac1[1]=riga1[1].getInizialeColore();
		  System.out.println("         "+Arrays.toString(rigac1));
		  for(i=posizione;i<posizione+3;i++)
			 {
				 
				 rigac2[j]=riga2[j].getInizialeColore();
				 t[1][j+3]=riga2[j];
				 j++;
			 }
			 System.out.println("         "+Arrays.toString(rigac2));
		     posizione=i;
		     j=0;
		     
			 for(i=posizione;i<posizione+5;i++)
			 {
				 rigac3[j]=riga3[j].getInizialeColore();
				 t[2][j+2]=riga3[j];
				 j++;
			 }
			 System.out.println("      "+ Arrays.toString(rigac3));
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+8;i++)
			 {
				 rigac4[j]=riga4[j].getInizialeColore();
				 t[3][j+1]=riga4[j];
				 j++;
			 }
			 System.out.println("   "+Arrays.toString(rigac4));
			 posizione=i;
			 j=0;
			 for(i=posizione;i<posizione+9;i++)
			 {
				 rigac5[j]=riga5[j].getInizialeColore();
				 t[4][j]=riga5[j];
				 j++;
			 }
			 posizione=i;
			 System.out.println(""+ Arrays.toString(rigac5));
			 j=0;
			 for(i=posizione;i<posizione+8;i++)
			 {
				 rigac6[j]=riga6[j].getInizialeColore();
				 t[5][j]=riga6[j];
				 j++;
			 }
			 posizione=i;
			 System.out.println( ""+Arrays.toString(rigac6));
			 j=0;
			 for(i=posizione;i<posizione+5;i++)
			 {
				 rigac7[j]=riga7[j].getInizialeColore();
				 t[6][j+2]=riga7[j];
				 j++;
			 }
			 posizione=i;
			 j=0;
			 System.out.println( "      "+Arrays.toString(rigac7));
			 for(i=posizione;i<posizione+3;i++)
			 {
				 rigac8[j]=riga8[j].getInizialeColore();
				 t[7][j+3]=riga8[j];
				 j++;
			 }
			 posizione=i;
			 System.out.println("         "+ Arrays.toString(rigac8));
			 rigac9[1]=riga9[0].getInizialeColore();
			 t[8][j+4]=riga9[0];
			 t[1][j+5]=riga9[1];
			 rigac9[0]=riga9[1].getInizialeColore();
			 System.out.println("            "+Arrays.toString(rigac9));
			 
			
			
			break;
			
		
	 
  }
	  
	  return t;
	 
	 
	
	 
  }
  
  
  public static ArrayList <Tessera> Prelievo (Tessera [][] t,int riga, int colonna)
  {
	 ArrayList <Tessera>Lib = new ArrayList();
	
	        	Lib.add(t[riga-1][colonna-1]);
	        	
	        	
	         
	 return Lib;
  }
  
  public static Tessera[][] AggiornaMatrice(Tessera t[][],int riga,int colonna)
  {
	  t[riga-1][colonna-1]=new Tessera(1000,"xn","nera");
	  System.out.println("metodo3 "+t[riga-1][colonna-1].getInizialeColore());
	  return t;
  }
  
  public boolean Controllo (Tessera t[][],int riga, int colonna,int numerocarte,char ngioc)
  {
	  boolean correttezza=false;
	  int riga1,colonna1=0;
	  riga1=riga-1;
	  colonna1=colonna-1;
	
	  switch (ngioc)
	  {
	  case'2':
		     if(numerocarte==1)
		     {
		    	 	
	   	        	   
	   	        	    if(t[riga1-1][colonna1].getInizialeColore()=='0'||t[riga1][colonna1+1].getInizialeColore()=='0'||t[riga1+1][colonna1].getInizialeColore()=='0'||t[riga1][colonna1-1].getInizialeColore()=='0')
	        	         {
	   	        	    	if(t[riga1][colonna1].getInizialeColore()!='0')
	        	    	    correttezza=true;
	        	    	 
	        	         }
	        	   
	               
	        	
		    	 
		     }
	  }
	  return correttezza;
  }
  public boolean Controllo2(Tessera t[][])
  {
	  int riga,colonna;
	  boolean controllo=true;
	  boolean controlloa=true; boolean controllob=true; boolean controlloc=true;boolean controllod=true,controlloe=true;
	  //fare file cosa da fare
	  for (int i=0;i<9;i++)
		    for(int j=0;j<9;j++) //righe centrali
		    {
		    	if ((t[i][j].getInizialeColore()!='x'||t[i][j].getInizialeColore()!='0')&&i>1&&j>1&&j<8&&i<8)
		    	{
		    	 	
		    	
		    		
		    	     if(t[i+1][j].getInizialeColore()=='x'||t[i+1][j].getInizialeColore()=='0')
		    		{
		    			if(t[i-1][j].getInizialeColore()=='x'||t[i-1][j].getInizialeColore()=='0')
		    			{
		    				if(t[i][j+1].getInizialeColore()=='x'||t[i][j+1].getInizialeColore()=='0')
		    				{
		    					if(t[i][j-1].getInizialeColore()=='x'||t[i][j-1].getInizialeColore()=='0')
		    					{
		    						controlloa=false;
		    					}
		    				}
		    			}
		    				
		    		}
		    	     
		    	  }
		    	
		    	
		    	
		    	if ((t[i][j].getInizialeColore()!='x'||t[i][j].getInizialeColore()!='0')&&i<1&&j>1&&j<8&&i<8)
		    	{
		    	 	
		    	
		    		
		    	     if(t[i+1][j].getInizialeColore()=='x'||t[i+1][j].getInizialeColore()=='0')
		    		{
		    			
		    				if(t[i][j+1].getInizialeColore()=='x'||t[i][j+1].getInizialeColore()=='0')
		    				{
		    					if(t[i][j-1].getInizialeColore()=='x'||t[i][j-1].getInizialeColore()=='0')
		    					{
		    						controllob=false;
		    					}
		    				}
		    			}
		    				
		    	}
		    	  
		    	 
		    	if ((t[i][j].getInizialeColore()!='x'||t[i][j].getInizialeColore()!='0')&&i>1&&j<1&&j<8&&i<8)
		    	{
		    	 	
		    	   
		    	     if(t[i+1][j].getInizialeColore()=='x'||t[i+1][j].getInizialeColore()=='0')
		    		{
		    			if(t[i-1][j].getInizialeColore()=='x'||t[i-1][j].getInizialeColore()=='0')
		    			{
		    				if(t[i][j+1].getInizialeColore()=='x'||t[i][j+1].getInizialeColore()=='0')
		    				{
		    					
		    						controlloc=false;
		    					
		    				}
		    			}
		    				
		    		}
		    	}
		    	
		    	
		    	if ((t[i][j].getInizialeColore()!='x'||t[i][j].getInizialeColore()!='0')&&i>1&&j>1&&j==9&&i<8)
		    	{
		    	 	
		    	
		    		
		    	     if(t[i+1][j].getInizialeColore()=='x'||t[i+1][j].getInizialeColore()=='0')
		    		{
		    			if(t[i-1][j].getInizialeColore()=='x'||t[i-1][j].getInizialeColore()=='0')
		    			{
		    				
		    					if(t[i][j-1].getInizialeColore()=='x'||t[i][j-1].getInizialeColore()=='0')
		    					{
		    						controllod=false;
		    					}
		    				
		    			}
		    				
		    		}
		    	     
		    	  }
		    	
		    	
		    	
		    	if ((t[i][j].getInizialeColore()!='x'||t[i][j].getInizialeColore()!='0')&&i>1&&j>1&&j<8&&i==9)
		    	{
		    	 	
		    	
		    		
		    	     
		    			if(t[i-1][j].getInizialeColore()=='x'||t[i-1][j].getInizialeColore()=='0')
		    			{
		    				if(t[i][j+1].getInizialeColore()=='x'||t[i][j+1].getInizialeColore()=='0')
		    				{
		    					if(t[i][j-1].getInizialeColore()=='x'||t[i][j-1].getInizialeColore()=='0')
		    					{
		    						controlloe=false;
		    					}
		    				}
		    			}
		    				
		    		
		    	     
		    	  }
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		    	
		     }
		    
	        
	    if(controlloa==false&&controllob==false&&controlloc==false&&controllod==false&&controlloe==false)
	    {
	    	controllo=false;
	    	
	    }
	   
		     
	   
		return  controllo;
  }
  
}
  