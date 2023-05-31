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
 
 
		
}



	


