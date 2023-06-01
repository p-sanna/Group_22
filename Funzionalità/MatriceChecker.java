package Funzionalità;
import java.util.ArrayList;
import java.util.Random;

import progetto.Plancia;
import progetto.Tessera;

public class MatriceChecker {
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
        char[][] matricea = {
            {'x', '0', 'x', 'x', 'x', '0', '0', 'x', 'x'},
            {'0', 'x', ' ', '0', 'x', 'A', 'A', '0', 'x'},
            {'x', 'A', '0', 'x', ' ', 'x', 'x', '0', ' '},
            {'A', '0', 'x', ' ', 'x', '0', ' ', 'x', 'x'},
            {'A', 'x', ' ', 'x', '0', 'x', '0', ' ', '0'},
            {'0', ' ', 'x', '0', 'x', 'A', 'x', ' ', ' '},
            {'0', ' ', 'x', ' ', '0', 'x', 'x', ' ', ' '},
            {'x', '0', '0', 'x', ' ', ' ', ' ', 'x', '0'},
            {'x', 'x', ' ', 'x', '0', ' ', ' ', '0', 'x'}
            
        };
       Plancia p = new Plancia('2');
       Random generatore = new Random();
		ArrayList <Tessera> carte= new ArrayList<>();
        int nverdi=0,nblu=0,nbianche=0,ngialle=0,nrosse=0,nazzurre=0,i=0,j=0;
		 do //Generazione carte esattamente nelle quantità prescritte, con quindi controlli
		  {
			  int d = 1+ generatore.nextInt(6);
			  System.out.println("d "+d);


			       if(d==1)
			       {
			    	 if (nverdi>0)
			    	 {
			         Tessera v= new Tessera (nverdi,"Verde","Gatti");
			         nverdi--;
			         carte.add(v);
			         i++;
			    	 }
			    	 else
			    	 {
					 d=0;


			    	 }
			       }

			       if(d==2&&nrosse>0)
			       {


				         Tessera r= new Tessera (nrosse,"Rossa","Piante");
				         nrosse--;
				         carte.add(r);
				         i++;


			       }


			       if(d==3&&nblu>0)
			       {

				         Tessera b= new Tessera(nblu,"Blu","Cornici");
				         nblu--;
				         carte.add(b);
				         i++;


			       }

			       if(d==4&&nazzurre>0)
			       {

				         Tessera az= new Tessera (nazzurre,"Azzurra","Trofei");
				         nazzurre--;
				         i++;
				         carte.add(az);


			       }
			       if(d==5&&ngialle>0)
			       {


			    	    Tessera g= new Tessera (ngialle,"Gialla","Giochi");
				         ngialle--;
				         System.out.println("Ciao");
				         carte.add(g);
				         i++;
			    	  }



			        if(d==6&&nbianche>0)
			        {

				        Tessera bi= new Tessera (nbianche,"White","Libri");
				         nbianche--;
				         i++;
				         carte.add(bi);

		            }



			    d=0;

		  } while(i<132);
		  

       p.CaricaCarte(null, p);
       Tessera a[][]= p.StampaCarte(p);
        char [][] matrice= new char[9][9];
        		for( i=0;i<9;i++)
        		{
        			for( j=0;j<9;j++)
        			{
        				matrice[i][j]=a[i][j].getInizialeColore();
        			}
        		}

        if (isMatriceValid(matrice)) {
            System.out.println("La matrice è valida.");
        } else {
            System.out.println("La matrice non è valida.");
        }
    }
}