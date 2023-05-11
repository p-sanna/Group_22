package Progetto;

import java.util.Random;

public class Sedia {
	

	public Sedia (int punteggio)
	{
	
		switch (punteggio)
		{
			case'2':
				// crea oggetto Random
		        Random random = new Random();
		        // genera numero casuale tra 0 e 1
		        int number = random.nextInt(1);
		        System.out.println(number);
		        
			case'3':
				// crea oggetto Random
		        Random random1 = new Random();
		        // genera numero casuale tra 0 e 2
		        int number1 = random1.nextInt(2);
		        System.out.println(number1);
		        
			case'4':
				// crea oggetto Random
		        Random random2 = new Random();
		        // genera numero casuale tra 0 e 3
		        int number2 = random2.nextInt(3);
		        System.out.println(number2);
		}
	}
	}
		
