package progetto;

import java.util.Random;

public class Sedia {
	
	
       public Sedia (int posizione)
	{
	
		switch (posizione)
		{
			case'2':
				// crea oggetto Random
		        Random random = new Random();
		        // genera numero casuale tra 0 e 1
		        int number = random.nextInt(1);
		        System.out.println("il giocatore che inizia per primo è il" +number+ " e si prosegue in senso orario");
		        
			case'3':
				// crea oggetto Random
		        Random random1 = new Random();
		        // genera numero casuale tra 0 e 2
		        int number1 = random1.nextInt(2);
		        System.out.println("il giocatore che inizia per primo è il"+number1+ " e si prosegue in senso orario");
		        
			case'4':
				// crea oggetto Random
		        Random random2 = new Random();
		        // genera numero casuale tra 0 e 3
		        int number2 = random2.nextInt(3);
		        System.out.println("il giocatore che inizia per primo è il"+number2+ " e si prosegue in senso orario");
		}
	}
	}
		
