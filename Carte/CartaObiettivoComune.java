package Carte;
import java.util.Random;

public class CartaObiettivoComune {
	
	static String caso;
	
		
	public static void main(String[] args) {
		
		
		 // crea oggetto Random
        Random random1 = new Random();
        // genera numero casuale tra 0 e 12
        int number1 = random1.nextInt(12);
        switch(number1) {
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
		System.out.println ("e");
		break;
	case 9:
		System.out.println ("f");
		break;
	case 10:
		System.out.println ("g");
		break;
	case 11:
		System.out.println ("n");
		break;
	case 12:
		System.out.println ("m");
		break;
	}
        // crea oggetto Random
        Random random2 = new Random();
        // genera numero casuale tra 0 e 3
        int number2 = random2.nextInt(12);
        do
        	switch(number2) {
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
    		System.out.println ("z");
    		break;
    	case 9:
    		System.out.println ("x");
    		break;
    	case 10:
    		System.out.println ("c");
    		break;
    	case 11:
    		System.out.println ("v");
    		break;
    	case 12:
    		System.out.println ("b");
    		break;
        }
        	while (number2==number1);
       
        
	}
	}

        
	


	
