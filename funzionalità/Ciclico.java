package Funzionalità;

import java.util.ArrayList;

public class Ciclico {
	
	char matrice[][];
	private static boolean[][] visitato;
    private static int righe;
    private static int colonne;
	public Ciclico( char a[][])
	{
		this.matrice=new char[6][5];
		this.matrice=a;
	
	}
	    
	   

	    public static ArrayList <Integer>  Main(char matrice[][]) {
	        righe = 6;
	        colonne =5;
	        visitato = new boolean[righe][colonne];
            ArrayList <Integer> g= new ArrayList();
	        int gruppi = 0;
	        for (int i = 0; i < righe; i++) {
	            for (int j = 0; j < colonne; j++) {
	                if (!visitato[i][j]) {
	                    char carattere = matrice[i][j];
	                    int elementi = visitaRicorsiva(i, j, carattere,matrice);
	                    if (elementi > 0) {
	                        gruppi++;
	                        g.add(elementi);
	                        System.out.println("Gruppo " + gruppi + ": " + elementi + " elementi");
	                        
	                    }
	                }
	            }
	        }
	        System.out.println("Totale gruppi: " + gruppi);
	        return g;
	    }

	    private static int visitaRicorsiva(int i, int j, char carattere,char matrice[][]) {
	        if (i < 0 || i >= 6|| j < 0 || j >= 5 || visitato[i][j] || matrice[i][j] != carattere) {
	            return 0;
	        }

	        visitato[i][j] = true;

	        int elementi = 1;
	        if(carattere!='0')
	        {
	        elementi += visitaRicorsiva(i - 1, j, carattere,matrice); // Sopra
	        elementi += visitaRicorsiva(i + 1, j, carattere,matrice); // Sotto
	        elementi += visitaRicorsiva(i, j - 1, carattere,matrice); // Sinistra
	        elementi += visitaRicorsiva(i, j + 1, carattere,matrice); // Destra
	        }
	        return elementi;
	    }
	    
	    
	    
	    
	    public static boolean  Metodo2(char matrice[][],int ele,int ripetizioni) {
	        righe = 6;
	        colonne =5;
	        boolean a=false;
	        visitato = new boolean[righe][colonne];
            ArrayList <Integer> g= new ArrayList();
	        int gruppi = 0;
	        for (int i = 0; i < righe; i++) {
	            for (int j = 0; j < colonne; j++) {
	                if (!visitato[i][j]) {
	                    char carattere = matrice[i][j];
	                    int elementi = visitaRicorsiva(i, j, carattere,matrice);
	                    if (elementi > ele) {
	                        gruppi++;
	                        g.add(elementi);
	                        System.out.println("Gruppo " + gruppi + ": " + elementi + " elementi");
	                        
	                        
	                    }
	                }
	            }
	        }
	        System.out.println("Totale gruppi: " + gruppi);
	         if(gruppi==ripetizioni)
	         {
	        	 a= true;
	         }
			return a;
	        
	    }
	    
	    public boolean Metodo3(char a[][])
	    {
	    	boolean b=false;
	    	if(a[0][0]==a[0][4]&&a[0][0]==a[5][0]&&a[0][0]==a[5][4])
	    	{
	    		b=true;
	    	}
	    	return b;
	    }
	    
	    public boolean Metodo4(char a[][]) //metodo 4blocchi
	    {
	    	int j=0,contatore=0;
	    	boolean b=false;
	    	do
	    	{
	    		for(int i=0;i+1<6;i++)
	    		{
	    			if(a[i][j]==a[i][j+1]&&a[i][j]==a[i+1][j]&&a[i+1][j+1]==a[i][j])
	    			{
	    				contatore++;
	    			}
	    		}
	    		j++;	
	    	}while(j+1<5);
	    		
	    	if(contatore==2)
	    	{
	    		b=true;
	    		
	    	}
	    	return b;
	    }
	    public boolean Metodo5(char a[][])
	    {
	    	int contatore1 = 0,contatore2 = 0,j=0;
	    	boolean b=false;
	    	do
	    	{
	    		for(int i=0;i<5;i++)
	    		{
	    			if(a[i][j]!=0)
	    			{
	    				if(a[i+1][j]!=a[i][j])
	    				{
	    					contatore1++;
	    				}
	    			}
	    			if(contatore1<=3)
	    			{
	    				contatore2++;
	    			}
	    		}
	    	j++;}while(j<5);
	    	
	    	if(contatore2>=3)
	    	{
	    		b=true;
	    	}
	    	return b;
	    }
	    
	    public boolean Metodo6(char a[][])
	    {
	    	char app=a[0][0];
	    	int contw=0,contb=0,contg=0,contr=0,contv=0,conta=0;
	    	boolean b=false;
	    	   for(int i=0;i<6;i++)
	    		      for(int j=0;j<5;j++)
	    		      {
	    		    	  if (a[i][j]!=0&&a[i][j]=='W')
	    		    	  {
	    		    		  contw++;
	    		    	  }
	    		    	  if (a[i][j]!=0&&a[i][j]=='B')
	    		    	  {
	    		    		  contb++;
	    		    	  }
	    		    	  if (a[i][j]!=0&&a[i][j]=='G')
	    		    	  {
	    		    		  contg++;
	    		    	  }
	    		    	  if (a[i][j]!=0&&a[i][j]=='R')
	    		    	  {
	    		    		  contr++;
	    		    	  }
	    		    	  if (a[i][j]!=0&&a[i][j]=='V')
	    		    	  {
	    		    		  contv++;
	    		    	  }
	    		    	  
	    		    	  if (a[i][j]!=0&&a[i][j]=='A')
	    		    	  {
	    		    		  conta++;
	    		    	  }
	    		    	  
	    		      }
	    
	     if(contv>=8||conta>=8||contw>=8||contr>=8||contg>=8||contb>=8)
	     {
	    	 b=true;
	     }
	     return b;
	    }  
	    
	  public boolean Metodo7(char a[][])  
	  {
		  boolean b=false;
		     //prima diagonale
		  
		       if(a[0][0]==a[1][1]&&a[0][0]==a[2][2]&&a[0][0]==a[3][3]&&a[0][0]==a[4][4])
		       {
		    	   b=true;
		       }
		       if(a[1][0]==a[2][1]&&a[1][0]==a[3][2]&&a[1][0]==a[4][3]&&a[1][0]==a[5][4])
		       {
		    	   b=true;
		       }
		       if(a[0][4]==a[1][3]&&a[0][4]==a[2][2]&&a[0][4]==a[3][1]&&a[0][4]==a[4][0])
		       {
		    	   b=true;
		       }
		       if(a[1][4]==a[2][3]&&a[1][4]==a[3][2]&&a[1][4]==a[4][1]&&a[1][4]==a[5][0])
		       {
		    	   b=true;
		       }
		       return b;
	  }
	    
}

