package progetto;

public class Libreria  {
	private String nomegiocatore;
	private int numgiocatore;
	private Tessera [][] casellario;
	private boolean [][] riempimentocasella;

	public Libreria (String giocatore, int ngiocatore)
	{
		this.nomegiocatore=giocatore;
		this.numgiocatore= ngiocatore;
	    this.casellario= new Tessera [6][5];
	    this.riempimentocasella= new boolean [6][5];
	        for (int i=0;i<6;i++)
	        {
	        	for (int j=0;j<5;j++)
	        	{
	        		riempimentocasella[i][j]=false;
	        	}
	        }
	}

	public void RiempiLibreria (int criga, int ccolonna, Tessera carta, Libreria l)
	{

		  if(l.riempimentocasella[criga][ccolonna]==false)
		  {
			  casellario[criga][ccolonna]=carta;
			  riempimentocasella[criga][ccolonna]=true;
		  }
		  else
		  {
			  System.out.println("Casella già occupata");
		  }



	}
	public boolean getCasellaDisponibile(int criga, int ccolonna,Libreria l)
	{
		return riempimentocasella[criga][ccolonna];
	}

	public Tessera getCarta(int riga, int colonna)
	{
		return casellario[riga][colonna];
	}

	public String getGiocatore(Libreria r)
	{
		return r.nomegiocatore;
	}
	public int getPosGiocatore(Libreria r)
	{
		return r.numgiocatore;
	}

}
