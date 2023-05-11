package Progetto;

public class Giocatore {
	
	private String nome;
	public int punteggio;
	private int posizione=0;
	
	public Giocatore (String nome) 
	{
		this.nome=nome;
		this.punteggio=0;
		posizione++;
		
		
	}
	
	public void setPunteggio(Giocatore g, int punti)
	{
		g.punteggio= g.punteggio+punti;
	}
	public int getPunteggio(Giocatore g)
	{
		return g.punteggio;
	}

}
