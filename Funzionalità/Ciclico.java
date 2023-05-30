package Funzionalità;

public class Ciclico {
	
	char matrice[][];
	private static boolean[][] visitato;
    private static int righe;
    private static int colonne;
	public Ciclico( char a[][])
	{
		this.matrice=new char[6][5];
		this.matrice=a;
	public GruppiCaratteriUguali{

	   
	        
	    }

	    
	   

	    public static void main(String[] args) {
	        righe = 6;
	        colonne =5;
	        visitato = new boolean[righe][colonne];

	        int gruppi = 0;
	        for (int i = 0; i < righe; i++) {
	            for (int j = 0; j < colonne; j++) {
	                if (!visitato[i][j]) {
	                    char carattere = matrice[i][j];
	                    int elementi = visitaRicorsiva(i, j, carattere);
	                    if (elementi > 0) {
	                        gruppi++;
	                        System.out.println("Gruppo " + gruppi + ": " + elementi + " elementi");
	                    }
	                }
	            }
	        }
	        System.out.println("Totale gruppi: " + gruppi);
	    }

	    private static int visitaRicorsiva(int i, int j, char carattere) {
	        if (i < 0 || i >= righe || j < 0 || j >= colonne || visitato[i][j] || matrice[i][j] != carattere) {
	            return 0;
	        }

	        visitato[i][j] = true;

	        int elementi = 1;
	        elementi += visitaRicorsiva(i - 1, j, carattere); // Sopra
	        elementi += visitaRicorsiva(i + 1, j, carattere); // Sotto
	        elementi += visitaRicorsiva(i, j - 1, carattere); // Sinistra
	        elementi += visitaRicorsiva(i, j + 1, carattere); // Destra

	        return elementi;
	    }
	}
}
