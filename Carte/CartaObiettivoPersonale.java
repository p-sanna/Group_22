package Carte;

import java.util.Random;

public class CartaObiettivoPersonale {
	static String caso;
	
	
	public static void main(String[] args) {
		
		
        // crea oggetto Random
        Random random = new Random();
        // genera numero casuale tra 0 e 11
        int number = random.nextInt(11);
        switch(number) {
	case 0: 
		System.out.println("prima colonna sesto blocco tessera rosa, "
				+ "seconda colonna terzo blocco tessera gialla,"
				+ " terza colonna primo blocco tessera azzurra e sesto blocco tessera blu,"
				+ " quarta colonna quarto blocco tessera bianca,"
				+ " quinta colonna quinto blocco tessera verde");
		break;
	case 1:
		System.out.println ("prima colonna quarto blocco tessera verde, "
				+ "seconda colonna quinto blocco tessera rosa, "
				+ "terza colonna quarto blocco tessera gialla, "
				+ "quarta colonna secondo blocco tessera azzurra, "
				+ "quinta colonna primo blocco tessera blu e terzo blocco tessera bianca");
		break;
		
	case 2:
		System.out.println ("prima colonna primo blocco tessera bianca e quinto blocco tessera blu,"
				+ " seconda colonna terzo blocco tessera verde, "
				+ "terza colonna quarto blocco tessera rosa, "
				+ "quarta colonna quinto blocco tessera gialla, "
				+ "quinta colonna terzo blocco tessera azzurra");
		break;
		
	case 3:
		System.out.println ("prima colonna quarto blocco tessera azzurra, "
				+ "seconda colonna secondo blocco tessera bianca, "
				+ "terza colonna secondo blocco tessera verde e quarto blocco tessera blu, "
				+ "quarta colonna terzo blocco tessera rosa, "
				+ "quinta colonna sesto blocco tessera gialla");
		break;
	case 4:
		System.out.println ("prima colonna primo blocco tessera gialla, "
				+ "seconda colonna terzo blocco tessera blu e quinto blocco tessera azzurra, "
				+ "terza colonna terzo blocco tessera bianca, "
				+ "quarta colonna primo blocco tessera verde, "
				+ "quinta colonna secondo blocco tessera rosa");
		break;
	case 5:
		System.out.println ("prima colonna primo blocco tessera rosa, "
				+ "seconda colonna secondo blocco tessera gialla, "
				+ "terza colonna sesto blocco tessera azzurra, "
				+ "quarta colonna secondo blocco tessera blu e quarto blocco tessera bianca, "
				+ "quinta colonna sesto blocco tessera verde");
		break;
	case 6:
		System.out.println ("prima colonna terzo blocco tessera azzurra e sesto blocco tessera verde, "
				+ "seconda colonna quarto blocco tessera rosa, "
				+ "terza colonna primo blocco tessera bianca, "
				+ "quarta colonna quinto blocco tessera blu, "
				+ "quinta colonna secondo blocco tessera gialla");
		break;
	case 7:
		System.out.println ("prima colonna terzo blocco tessera rosa, "
				+ "seconda colonna quinto blocco tessera verde, "
				+ "terza colonna quarto blocco tessera azzurra, "
				+ "quarta colonna primo blocco tessera gialla e secondo blocco tessera bianca, "
				+ "quinta colonna sesto blocco tessera blu");
		break;
	case 8:
		System.out.println ("prima colonna primo blocco tessera blu, "
				+ "seconda colonna secondo blocco tessera azzurra, "
				+ "terza colonna quarto blocco tessera verde e sesto blocco tessera gialla, "
				+ "quinta colonna secondo blocco tessera rosa e terzo blocco tessera bianca");
		break;
	case 9:
		System.out.println ("prima colonna quarto blocco tessera bianca, "
				+ "seconda colonna secondo blocco tessera blu e quinto blocco tessera gialla, "
				+ "quarta colonna primo blocco tessera rosa e terzo blocco tessera verde, "
				+ "quinta colonna sesto blocco tessera azzurra");
		break;
	case 10:
		System.out.println ("prima colonna quarto blocco tessera gialla, "
				+ "seconda colonna quinto blocco tessera bianca, "
				+ "terza colonna terzo blocco tessera blu e sesto blocco tessera rosa, "
				+ "quarta colonna primo blocco tessera azzurra, "
				+ "quinta colonna secondo blocco tessera verde");
		break;
	case 11:
		System.out.println ("prima colonna primo blocco tessera verde, "
				+ "seconda colonna quinto blocco tessera rosa, "
				+ "terza colonna quarto blocco tessera blu e sesto blocco tessera bianca, "
				+ "quarta colonna terzo blocco tessera azzurra, "
				+ "quinta colonna secondo blocco tessera gialla");
		break;
	}
	}
	
}

	

	

