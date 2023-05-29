package carte;

import java.util.Random;

public class CartaObiettivoPersonale {
	static String caso;
	
	
	public static void main(String[] args) {
		
		
		int righe = 6;
		int colonne = 5;
		char[][] matrice = new char[righe][colonne];

		// Inizializza tutti gli elementi della matrice a zero di prova
		for (int i = 0; i < righe; i++) {
		    for (int j = 0; j < colonne; j++) {
		        matrice[i][j] = '0';
		    }
		}

		// Stampa matrice prova 
		System.out.println("libreria vuota prova");
		for (int i = 0; i < righe; i++) {
		    for (int j = 0; j < colonne; j++) {
		        System.out.print(matrice[i][j] + " ");
		    }
		    System.out.println(); 
		}
        System.out.println();
		
		
		char[][] matrice1 = new char[righe][colonne];
		char[][] matrice2 = new char[righe][colonne];
		char[][] matrice3 = new char[righe][colonne];
		char[][] matrice4 = new char[righe][colonne];
		char[][] matrice5 = new char[righe][colonne];
		char[][] matrice6 = new char[righe][colonne];
		char[][] matrice7 = new char[righe][colonne];
		char[][] matrice8 = new char[righe][colonne];
		char[][] matrice9 = new char[righe][colonne];
		char[][] matrice10 = new char[righe][colonne];
		char[][] matrice11 = new char[righe][colonne];
		char[][] matrice12 = new char[righe][colonne];
		
		// Carta Personale 1
		System.out.println("personale 1 prova");
		
		for (int i = 0; i < righe; i++) {
		    for (int j = 0; j < colonne; j++) {
		        matrice1[i][j] = '0';
		    }
		}
		
		matrice1[0][0] = 'R'; 
		matrice1[0][2] = 'B';
		matrice1[1][4] = 'V';
		matrice1[3][1] = 'G';
		matrice1[5][2] = 'A';
		matrice1[2][3] = 'W';
		
		for (int i = 0; i < righe; i++) {
		    for (int j = 0; j < colonne; j++) {
		        System.out.print(matrice1[i][j] + " ");
		    }
		    System.out.println(); 
		}
        System.out.println();
        
		// Carta Personale 2
		System.out.println("personale 2 prova");
		
		for (int i = 0; i < righe; i++) {
		    for (int j = 0; j < colonne; j++) {
		        matrice2[i][j] = '0';
		    }
		}
		
		matrice2[1][1] = 'R'; 
		matrice2[5][4] = 'B';
		matrice2[2][0] = 'V';
		matrice2[2][2] = 'G';
		matrice2[4][3] = 'A';
		matrice2[3][4] = 'W';
		
		for (int i = 0; i < righe; i++) {
		    for (int j = 0; j < colonne; j++) {
		        System.out.print(matrice2[i][j] + " ");
		    }
		    System.out.println(); 
		}
        System.out.println();
        
		// Carta Personale 3
		System.out.println("personale 3 prova");
		
		for (int i = 0; i < righe; i++) {
		    for (int j = 0; j < colonne; j++) {
		        matrice3[i][j] = '0';
		    }
		}
		
		matrice3[2][2] = 'R'; 
		matrice3[1][0] = 'B';
		matrice3[3][1] = 'V';
		matrice3[1][3] = 'G';
		matrice3[3][4] = 'A';
		matrice3[5][0] = 'W';
		
		for (int i = 0; i < righe; i++) {
		    for (int j = 0; j < colonne; j++) {
		        System.out.print(matrice3[i][j] + " ");
		    }
		    System.out.println(); 
		}
        System.out.println();
        
     // Carta Personale 4
     		System.out.println("personale 4 prova");
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        matrice4[i][j] = '0';
     		    }
     		}
     		
     		matrice4[3][3] = 'R'; 
     		matrice4[2][2] = 'B';
     		matrice4[4][2] = 'V';
     		matrice4[0][4] = 'G';
     		matrice4[2][0] = 'A';
     		matrice4[4][1] = 'W';
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        System.out.print(matrice4[i][j] + " ");
     		    }
     		    System.out.println(); 
     		}
             System.out.println();
             
     		// Carta Personale 5
     		System.out.println("personale 5 prova");
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        matrice5[i][j] = '0';
     		    }
     		}
     		
     		matrice5[4][4] = 'R'; 
     		matrice5[3][1] = 'B';
     		matrice5[5][3] = 'V';
     		matrice5[5][0] = 'G';
     		matrice5[1][1] = 'A';
     		matrice5[3][2] = 'W';
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        System.out.print(matrice5[i][j] + " ");
     		    }
     		    System.out.println(); 
     		}
             System.out.println();
             
     		// Carta Personale 6
     		System.out.println("personale 6 prova");
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        matrice6[i][j] = '0';
     		    }
     		}
     		
     		matrice6[5][0] = 'R'; 
     		matrice6[4][3] = 'B';
     		matrice6[0][4] = 'V';
     		matrice6[4][1] = 'G';
     		matrice6[0][2] = 'A';
     		matrice6[2][3] = 'W';
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        System.out.print(matrice6[i][j] + " ");
     		    }
     		    System.out.println(); 
     		}
             System.out.println();
             
          // Carta Personale 7
     		System.out.println("personale 7 prova");
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        matrice7[i][j] = '0';
     		    }
     		}
     		
     		matrice7[2][1] = 'R'; 
     		matrice7[1][3] = 'B';
     		matrice7[0][0] = 'V';
     		matrice7[4][4] = 'G';
     		matrice7[3][0] = 'A';
     		matrice7[5][2] = 'W';
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        System.out.print(matrice7[i][j] + " ");
     		    }
     		    System.out.println(); 
     		}
             System.out.println();
             
     		// Carta Personale 8
     		System.out.println("personale 8 prova");
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        matrice8[i][j] = '0';
     		    }
     		}
     		
     		matrice8[3][0] = 'R'; 
     		matrice8[0][4] = 'B';
     		matrice8[1][1] = 'V';
     		matrice8[5][3] = 'G';
     		matrice8[2][2] = 'A';
     		matrice8[4][3] = 'W';
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        System.out.print(matrice8[i][j] + " ");
     		    }
     		    System.out.println(); 
     		}
             System.out.println();
             
     		// Carta Personale 9
     		System.out.println("personale 9 prova");
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        matrice9[i][j] = '0';
     		    }
     		}
     		
     		matrice9[4][4] = 'R'; 
     		matrice9[5][0] = 'B';
     		matrice9[2][2] = 'V';
     		matrice9[0][2] = 'G';
     		matrice9[4][1] = 'A';
     		matrice9[3][4] = 'W';
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        System.out.print(matrice9[i][j] + " ");
     		    }
     		    System.out.println(); 
     		}
             System.out.println();
             
          // Carta Personale 10
     		System.out.println("personale 10 prova");
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        matrice10[i][j] = '0';
     		    }
     		}
     		
     		matrice10[5][3] = 'R'; 
     		matrice10[4][1] = 'B';
     		matrice10[3][3] = 'V';
     		matrice10[1][1] = 'G';
     		matrice10[0][4] = 'A';
     		matrice10[2][0] = 'W';
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        System.out.print(matrice10[i][j] + " ");
     		    }
     		    System.out.println(); 
     		}
             System.out.println();
             
          // Carta Personale 11
     		System.out.println("personale 11 prova");
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        matrice11[i][j] = '0';
     		    }
     		}
     		
     		matrice11[0][2] = 'R'; 
     		matrice11[3][2] = 'B';
     		matrice11[4][4] = 'V';
     		matrice11[2][0] = 'G';
     		matrice11[5][3] = 'A';
     		matrice11[1][1] = 'W';
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        System.out.print(matrice11[i][j] + " ");
     		    }
     		    System.out.println(); 
     		}
             System.out.println();
             
          // Carta Personale 12
     		System.out.println("personale 12 prova");
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        matrice12[i][j] = '0';
     		    }
     		}
     		
     		matrice12[1][1] = 'R'; 
     		matrice12[2][2] = 'B';
     		matrice12[5][0] = 'V';
     		matrice12[4][4] = 'G';
     		matrice12[3][3] = 'A';
     		matrice12[0][2] = 'W';
     		
     		for (int i = 0; i < righe; i++) {
     		    for (int j = 0; j < colonne; j++) {
     		        System.out.print(matrice12[i][j] + " ");
     		    }
     		    System.out.println(); 
     		}
             System.out.println();
             
             
             
        // controllare problemi iniziale colore (bianco-blu)

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
        // crea oggetto Random
        Random random = new Random();
        // genera numero casuale tra 0 e 3
        int number = random.nextInt(3);
        switch(number) {
	case 0: 
		System.out.println("");
		break;
	case 1:
		System.out.println ("");
		break;
		
	case 2:
		System.out.println ("");
		break;
		
	case 3:
		System.out.println ("");
		break;
	case 4:
		System.out.println ("");
		break;
	case 5:
		System.out.println ("");
		break;
	case 6:
		System.out.println ("");
		break;
	case 7:
		System.out.println ("");
		break;
	case 8:
		System.out.println ("");
		break;
	case 9:
		System.out.println ("");
		break;
	case 10:
		System.out.println ("");
		break;
	case 11:
		System.out.println ("");
		break;
	case 12:
		System.out.println ("");
		break;
	}
	}
	
}

	

	

