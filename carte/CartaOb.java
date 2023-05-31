package carte;

import java.util.Random;

import progetto.Libreria;

public class CartaOb {
	 static String caso;
     char[][] matrice; 
		public char[][] matrice1;  
		public char[][] matrice2; 
		public char[][] matrice3 ; 
		public char[][] matrice4; 
		public char[][] matrice5 ; 
		public char[][] matrice6 ; 
		public char[][] matrice7 ; 
		public char[][] matrice8 ; 
		public char[][] matrice9 ; 
		public char[][] matrice10 ; 
		public char[][] matrice11 ; 
		public char[][] matrice12 ; 
		public int righe;
		public int colonne;
		
		
	public CartaOb()
	{
			 this.righe = 6;
			this.colonne = 5;
			this.matrice = new char[righe][colonne];
			this.matrice1 = new char[righe][colonne];
			this.matrice2 = new char[righe][colonne];
			this.matrice3 = new char[righe][colonne];
			this.matrice4= new char[righe][colonne];
			this.matrice5= new char[righe][colonne];
			this.matrice6= new char[righe][colonne];
			this.matrice7= new char[righe][colonne];
			this.matrice8= new char[righe][colonne];
			this.matrice9 = new char[righe][colonne];
			this.matrice10 = new char[righe][colonne];
			this.matrice11= new char[righe][colonne];
			this.matrice12= new char[righe][colonne];
			this.righe=6;
			this.colonne=5;
	}
	public void CaricaMatrici()
	{
			// Inizializza tutti gli elementi della matrice a zero di prova
			for (int i = 0; i < righe; i++) {
			    for (int j = 0; j <colonne; j++) {
			        matrice[i][j] = '0';
			    }
			}

			// Stampa matrice prova 
			System.out.println("libreria vuota prova");
			for (int i = 0; i < righe; i++) {
			    for (int j = 0; j < colonne; j++) {
			        System.out.print(matrice[i][j] + " ");
			    }
			    System.out.println(); 
			}
	        System.out.println();
			
			
			
			
			// Carta Personale 1
			System.out.println("personale 1 prova");
			
			for (int i = 0; i < righe; i++) {
			    for (int j = 0; j < colonne; j++) {
			        matrice1[i][j] = 'X';
			    }
			}
			
			matrice1[0][0] = 'R'; 
			matrice1[0][2] = 'B';
			matrice1[1][4] = 'V';
			matrice1[3][1] = 'G';
			matrice1[5][2] = 'A';
			matrice1[2][3] = 'W';
			
			for (int i = 0; i < righe; i++) {
			    for (int j = 0; j < colonne; j++) {
			        System.out.print(matrice1[i][j] + " ");
			    }
			    System.out.println(); 
			}
	        System.out.println();
	        
			// Carta Personale 2
			System.out.println("personale 2 prova");
			
			for (int i = 0; i < righe; i++) {
			    for (int j = 0; j < colonne; j++) {
			        matrice2[i][j] = 'X';
			    }
			}
			
			matrice2[1][1] = 'R'; 
			matrice2[5][4] = 'B';
			matrice2[2][0] = 'V';
			matrice2[2][2] = 'G';
			matrice2[4][3] = 'A';
			matrice2[3][4] = 'W';
			
			for (int i = 0; i < righe; i++) {
			    for (int j = 0; j < colonne; j++) {
			        System.out.print(matrice2[i][j] + " ");
			    }
			    System.out.println(); 
			}
	        System.out.println();
	        
			// Carta Personale 3
			System.out.println("personale 3 prova");
			
			for (int i = 0; i < righe; i++) {
			    for (int j = 0; j < colonne; j++) {
			        matrice3[i][j] = 'X';
			    }
			}
			
			matrice3[2][2] = 'R'; 
			matrice3[1][0] = 'B';
			matrice3[3][1] = 'V';
			matrice3[1][3] = 'G';
			matrice3[3][4] = 'A';
			matrice3[5][0] = 'W';
			
			for (int i = 0; i < righe; i++) {
			    for (int j = 0; j < colonne; j++) {
			        System.out.print(matrice3[i][j] + " ");
			    }
			    System.out.println(); 
			}
	        System.out.println();
	        
	     // Carta Personale 4
	     		System.out.println("personale 4 prova");
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        matrice4[i][j] = 'X';
	     		    }
	     		}
	     		
	     		matrice4[3][3] = 'R'; 
	     		matrice4[2][2] = 'B';
	     		matrice4[4][2] = 'V';
	     		matrice4[0][4] = 'G';
	     		matrice4[2][0] = 'A';
	     		matrice4[4][1] = 'W';
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        System.out.print(matrice4[i][j] + " ");
	     		    }
	     		    System.out.println(); 
	     		}
	             System.out.println();
	             
	     		// Carta Personale 5
	     		System.out.println("personale 5 prova");
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        matrice5[i][j] = 'X';
	     		    }
	     		}
	     		
	     		matrice5[4][4] = 'R'; 
	     		matrice5[3][1] = 'B';
	     		matrice5[5][3] = 'V';
	     		matrice5[5][0] = 'G';
	     		matrice5[1][1] = 'A';
	     		matrice5[3][2] = 'W';
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        System.out.print(matrice5[i][j] + " ");
	     		    }
	     		    System.out.println(); 
	     		}
	             System.out.println();
	             
	     		// Carta Personale 6
	     		System.out.println("personale 6 prova");
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        matrice6[i][j] = 'X';
	     		    }
	     		}
	     		
	     		matrice6[5][0] = 'R'; 
	     		matrice6[4][3] = 'B';
	     		matrice6[0][4] = 'V';
	     		matrice6[4][1] = 'G';
	     		matrice6[0][2] = 'A';
	     		matrice6[2][3] = 'W';
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        System.out.print(matrice6[i][j] + " ");
	     		    }
	     		    System.out.println(); 
	     		}
	             System.out.println();
	             
	          // Carta Personale 7
	     		System.out.println("personale 7 prova");
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        matrice7[i][j] = 'X';
	     		    }
	     		}
	     		
	     		matrice7[2][1] = 'R'; 
	     		matrice7[1][3] = 'B';
	     		matrice7[0][0] = 'V';
	     		matrice7[4][4] = 'G';
	     		matrice7[3][0] = 'A';
	     		matrice7[5][2] = 'W';
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        System.out.print(matrice7[i][j] + " ");
	     		    }
	     		    System.out.println(); 
	     		}
	             System.out.println();
	             
	     		// Carta Personale 8
	     		System.out.println("personale 8 prova");
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        matrice8[i][j] = 'X';
	     		    }
	     		}
	     		
	     		matrice8[3][0] = 'R'; 
	     		matrice8[0][4] = 'B';
	     		matrice8[1][1] = 'V';
	     		matrice8[5][3] = 'G';
	     		matrice8[2][2] = 'A';
	     		matrice8[4][3] = 'W';
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        System.out.print(matrice8[i][j] + " ");
	     		    }
	     		    System.out.println(); 
	     		}
	             System.out.println();
	             
	     		// Carta Personale 9
	     		System.out.println("personale 9 prova");
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        matrice9[i][j] = 'X';
	     		    }
	     		}
	     		
	     		matrice9[4][4] = 'R'; 
	     		matrice9[5][0] = 'B';
	     		matrice9[2][2] = 'V';
	     		matrice9[0][2] = 'G';
	     		matrice9[4][1] = 'A';
	     		matrice9[3][4] = 'W';
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        System.out.print(matrice9[i][j] + " ");
	     		    }
	     		    System.out.println(); 
	     		}
	             System.out.println();
	             
	          // Carta Personale 10
	     		System.out.println("personale 10 prova");
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        matrice10[i][j] = 'X';
	     		    }
	     		}
	     		
	     		matrice10[5][3] = 'R'; 
	     		matrice10[4][1] = 'B';
	     		matrice10[3][3] = 'V';
	     		matrice10[1][1] = 'G';
	     		matrice10[0][4] = 'A';
	     		matrice10[2][0] = 'W';
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        System.out.print(matrice10[i][j] + " ");
	     		    }
	     		    System.out.println(); 
	     		}
	             System.out.println();
	             
	          // Carta Personale 11
	     		System.out.println("personale 11 prova");
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        matrice11[i][j] = 'X';
	     		    }
	     		}
	     		
	     		matrice11[0][2] = 'R'; 
	     		matrice11[3][2] = 'B';
	     		matrice11[4][4] = 'V';
	     		matrice11[2][0] = 'G';
	     		matrice11[5][3] = 'A';
	     		matrice11[1][1] = 'W';
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        System.out.print(matrice11[i][j] + " ");
	     		    }
	     		    System.out.println(); 
	     		}
	             System.out.println();
	             
	          // Carta Personale 12
	     		System.out.println("personale 12 prova");
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        matrice12[i][j] = 'X';
	     		    }
	     		}
	     		
	     		matrice12[1][1] = 'R'; 
	     		matrice12[2][2] = 'B';
	     		matrice12[5][0] = 'V';
	     		matrice12[4][4] = 'G';
	     		matrice12[3][3] = 'A';
	     		matrice12[0][2] = 'W';
	     		
	     		for (int i = 0; i < righe; i++) {
	     		    for (int j = 0; j < colonne; j++) {
	     		        System.out.print(matrice12[i][j] + " ");
	     		    }
	     		    System.out.println(); 
	     		}
	             System.out.println();
	             
	  
	             
	        // controllare problemi iniziale colore (bianco-blu)

			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	       
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             
	             // crea oggetto Random
	        Random random = new Random();
	        // genera numero casuale tra 0 e 3
	        int number = random.nextInt(12);
	        switch(number) {
		case 0: 
			System.out.println("");
			break;
		case 1:
			System.out.println ("");
			break;
			
		case 2:
			System.out.println ("");
			break;
			
		case 3:
			System.out.println ("");
			break;
		case 4:
			System.out.println ("");
			break;
		case 5:
			System.out.println ("");
			break;
		case 6:
			System.out.println ("");
			break;
		case 7:
			System.out.println ("");
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
		case 12:
			System.out.println ("");
			break;
		}
		}
		


		

		//FARE NEL MAIN UN numero random da a 12 che ti dice quale matrice prendere

	public int PunteggioPersonale(Libreria l,char [][] a)
	{
		  int contatore=0,punteggio=0;
		   for(int i=0;i<6;i++)
		   {
			   for (int j=0;j<5;j++)
			   {
				   if(l.casellario[i][j].getInizialeColore()==a[i][j])
				   {
					   contatore++;
				   }
			   }
				   
		   }
		   
		   if(contatore==1)
		   {
			   punteggio++;
		   }if(contatore==2)
		   {
			   punteggio=2;
		   }if(contatore==3)
		   {
			   punteggio=4;
		   }if(contatore==4)
		   {
			   punteggio=6;
		   }
		   if(contatore==5)
		   {
			   punteggio=9;
		   }
		   if(contatore==6)
		   {
			   punteggio=12;
		   }
			return punteggio;   
	}
	}





	/*metodo nel main
	 * 
	 * 
	 * da ripetere per ngiocatori
	 * 
	 * ArrayList <char> obiettivopersonale= new ArrayList();
	 * CartaObiettivoPersonale m= new CartaObiettivoPersonale();
	 * int appoggio=0;
	 * do
	 * {
	 * int numero = random.nextInt(12);
	 * 
	 * }while(appoggio!=numero);
	 * appoggio=numero;
	 * 
	        switch(number) {
		case 0: 
			System.out.println("");
			obiettivopersonale.add(m.matrice1);
			
			break;
		case 1:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
			
		case 2:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
			
		case 3:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
		case 4:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
		case 5:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
		case 6:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
		case 7:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
		case 8:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
		case 9:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
		case 10:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
		case 11:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
		case 12:
			System.out.println ("");
			obiettivopersonale.add(m.matrice1);
			break;
		}
		}
		
	 * 
	 * 
	 * 
	 * 
	 */










