package progetto;

public class Giocatore {
	
	private String nome;
	public int punteggio;
	private int posizione=0;
	boolean obc1=false;
	boolean obc2=false;
	
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
	public String getNome(Giocatore g)
	{
		return g.nome;
	}
	public void setNome(Giocatore g,String nome2)
	{
		this.nome=nome2;
	}
	
	

}
