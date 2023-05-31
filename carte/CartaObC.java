package carte;

public class CartaObC {
	int numero=0;

	public  CartaObC(int random)
	{
		this.numero=random;
		switch(random) {
		case 0: 
			System.out.println( "completa un quadrato 2*2 dello stesso colore per 2 volte");
			break;
		case 1:
			System.out.println ("completa due colonne dello stesso colore per 2 volte");
			break;
			
		case 2:
			System.out.println ("completa una colonna da 4 dello stesso colore per 4 volte");
			break;
			
		case 3:
			System.out.println ("completa una coppia dello stetto colore su una colonna per 6 volte");
			break;
		case 4:
			System.out.println ("completa 2 righe dello stesso colore da 5 caselle");
			break;
		case 5:
			System.out.println ("completa i vertici della libreria dello stesso colore");
			break;
		case 6:
			System.out.println ("completa la digonale della libreria dello stesso colore");
			break;
		case 7:
			System.out.println ("completa in 3 righe differenti il seguente schema dello stesso oclore dal basso verso l'alto: 3,3,2");
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
		
			
		}
	}
	public int getNumero(CartaObC a)
	{
		return a.numero;
	}
}
