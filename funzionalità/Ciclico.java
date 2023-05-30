package Funzionalità;

import java.util.ArrayList;

import progetto.Plancia;
import progetto.Tessera;

public class Ciclico {
	int i=0;
	
	public Tessera[] Ciclo (int partenza,int aumento,ArrayList <Tessera> c,Plancia p)
	{
		for ( i=partenza;i<(partenza+aumento);i++)
		{
			p.riga2[i]=c.get(i);
		}
	return p.riga2;
	}
	
	public  int getI() {
		return i;
	}

}

/*
public class GruppiCaratteriUguali {

    private static char[][] matrice = {
        {'A', 'A', 'B', 'B', 'C'},
        {'A', 'A', 'C', 'C', 'C'},
        {'D', 'D', 'D', 'E', 'E'},
        {'F', 'F', 'F', 'C', 'C'},
        {'F', 'F', 'D', 'E', 'B'},
        {'A', 'F', 'C', 'B', 'A'}
    };

    private static boolean[][] visitato;
    private static int righe;
    private static int colonne;

    public static void main(String[] args) {
        righe = matrice.length;
        colonne = matrice[0].length;
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
*/