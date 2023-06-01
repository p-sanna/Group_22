package carte;

public class CartaObC {
	int numero=0;

	public  CartaObC(int random)
	{
		this.numero=random;
		switch(random) {
		case 0: 
			System.out.println ("Disponi le tessere nella libreria in modo da formare 6 gruppi di elementi di almeno 2 tesssre dello stesso tipo");
			break;
		case 1:
			System.out.println ("Disponi le tessere nella libreria in modo da formare 4 gruppi di elementi di almeno 4 tesssre dello stesso tipo");
			break;
			
		case 2:
			System.out.println ("Inserisci nei 4 vertici della libreria 4 tessere dello stesso colore");
			break;
			
		case 3:
			System.out.println ("Completa 2 gruppi ciascuno formato 4 tessere dello stesso tipo in un quadrato 2x2");
			break;
		case 4:
			System.out.println ("Completa 3 colonne da 6 tessere ciascuna, ogni colonna può contenere al massimo 3 tipi di tessere");
			break;
		case 5:
			System.out.println ("Inserisci nella libreria 8 tessere dello stesso colore, non ci sono vincoli di forma");
			break;
		case 6:
			System.out.println ("Inserisci nella libreria 5 tessere dello stesso tipo in modo che formino una diagonale");
			break;
		case 7:
			System.out.println ("Completa 4 righe da 5 tessere ciascuna, ogni riga può contenere al massimo 3 tipi di tessere");
			break;
		case 8:
			System.out.println ("Completa 2 colonne da 6 tessere ciascuna, ogni colonna deve contenere 6 tipi di tessere diversi");
			break;
		case 9:
			System.out.println ("Completa 2 righe da tessere ciascuna, ogni riga deve contenere 5 tipi di tessere diversi");
			break;
		case 10:
			System.out.println ("Inserisci nella libreria 5 tessere dello stesso tipo disposte a X");
			break;
		case 11:
			System.out.println ("Completa 5 colonne della libreria in modo che siano decrescenti o crescenti l'una con l'altra (5,4,3,2,1 o 1,2,3,4,5");
			break;
		
			
		}
	}
	public int getNumero(CartaObC a)
	{
		return a.numero;
	}
}
