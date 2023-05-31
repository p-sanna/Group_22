package progetto;
import Funzionalità.Ciclico;
public class Prova {

	public static void main(String[] args) {
		// TODO Auto-generated method stubpackage progetto;




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
 a[3][1]='m';
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
 
		
}



	}


