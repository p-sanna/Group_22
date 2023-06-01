package progetto;
import Funzionalità.Ciclico;
public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage progetto;



int ris1=0,ris2=0;
boolean ao=false;

char [][] a= new char[6][5];
for (int i=0;i<6;i++)
{
	for (int j=0;j<5;j++)
	{
		a[i][j]='0';
	}
}
 a[0][0]='q';
 a[1][0]='h';
 a[2][0]='a';
 a[3][0]='v';
 a[4][0]='w';
 a[5][0]='A';
 a[0][1]='d';
 a[1][1]='s';
 a[2][1]='3';
 a[3][1]='z';
 a[4][1]='P';
 a[5][1]='a';
 //a[3][3]='A';
 //a[1][4]='A';
 //a[1][3]='A';
 ao=false;
 ao=Ciclico.Metodo9(a);
 System.out.println(ao +"AOOOOOOOOO POrCODIOD");
 
 //prova algoritmo completo
 Giocatore uno= new Giocatore("a");
 Giocatore due= new Giocatore("b");
 Libreria l1= new Libreria("A",1);
 System.out.println(uno.obc1+"DIOCANE");
  int w=l1.Difficile(l1, 8, 1, due, a);
  do{
	  if(ris1==0)
  
  {
	   ris1=l1.Difficile(l1, 9, 2, uno,a);
	   //System.out.println("Ris1"+ris1);
	   if (ris1!=0)
	   {
	    uno.punteggio=uno.punteggio+8;
	   }
  }
  else
  {
	  int supporto=ris1;
	  ris1=0;
	   ris1=l1.Difficile(l1, 9, 2, uno,a);
	     if(ris1==8)
	     {
	    	 uno.punteggio=uno.punteggio+4;
	     }
	     else
	     {
	      ris1=supporto;
	     }
  }
	  
  if(ris2==0)
  {
	   ris2=l1.Difficile(l1, 9, 2, uno,a);
	   if (ris2!=0)
	   {
	    uno.punteggio=uno.punteggio+8;
	   }
  }
  else
  {
	  int supporto2=ris2;
	  ris2=0;
	   ris2=l1.Difficile(l1, 9, 2, uno,a);
	     if(ris2==8)
	     {
	    	 uno.punteggio=uno.punteggio+4;
	     }
	     else
	     {
	      ris2=supporto2;
	     }
  }
System.out.println("Ris1"+ris1);
System.out.println(uno.obc1);
System.out.println(due.obc1);
  System.out.println("WW" +w);
	}while(ris1==0);
	}
 
 
		//fine partita tessere adiacenti e obiettivo personale
	    //controllo libreria sazio sufficiebte
	//Estensione a 3 e 4 giocatore anche su diffcile
	//togliere tutti gli output
	//Libreria piena
}


/*
 * public class MatriceChecker {
    public static boolean isMatriceValid(char[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                char currentChar = matrice[i][j];
                if (currentChar != 'x' && currentChar != '0' && hasAdjacentChar(matrice, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean hasAdjacentChar(char[][] matrice, int row, int col) {
        // Array di direzioni per controllare gli adiacenti
        int[] rowOffsets = {-1, 0, 1, 0};
        int[] colOffsets = {0, 1, 0, -1};

        for (int i = 0; i < 4; i++) {
            int newRow = row + rowOffsets[i];
            int newCol = col + colOffsets[i];

            // Controlla se la posizione adiacente è valida e contiene un carattere
            if (isValidPosition(matrice, newRow, newCol) && matrice[newRow][newCol] != ' ') {
                return true;
            }
        }
        return false;
    }

    private static boolean isValidPosition(char[][] matrice, int row, int col) {
        return row >= 0 && row < matrice.length && col >= 0 && col < matrice[row].length;
    }

    public static void main(String[] args) {
        char[][] matrice = {
            {'x', '0', 'x', ' ', ' ', '0', '0', 'x', 'x'},
            {'0', 'x', ' ', '0', 'x', ' ', ' ', '0', 'x'},
            {'x', ' ', '0', 'x', ' ', 'x', 'x', '0', ' '},
            {' ', '0', 'x', ' ', 'x', '0', ' ', 'x', 'x'},
            {' ', 'x', ' ', 'x', '0', 'x', '0', ' ', '0'},
            {'0', ' ', 'x', '0', 'x', ' ', 'x', ' ', ' '},
            {'0', ' ', 'x', ' ', '0', 'x', 'x', ' ', ' '},
            {'x', '0', '0', 'x', ' ', ' ', ' ', 'x', '0'},
            {'x', 'x', ' ', 'x', '0', ' ', ' ', '0', 'x'}
        };

        if (isMatriceValid(matrice)) {
            System.out.println("La matrice è valida.");
        } else {
            System.out.println("La matrice non è valida.");
        }
    }
}
*/
 */
	


