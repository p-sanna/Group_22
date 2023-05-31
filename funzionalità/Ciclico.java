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
	}

