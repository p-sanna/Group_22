package progetto;

public class Tessera {
	private int numero=0;
	private String colore;
	private String figura;
	private boolean finite=false;
	
	 public  Tessera (int tipologierimanenti, String colore, String figura)
	 {
		 numero++;
		   if (tipologierimanenti>0)
		     {
			   
			   
				this.colore=colore;
		        this.figura=figura;
		     }
		   else
		   {
			   boolean finite=true;
		   }
		   
		 
	 }
	 
	 public String getColore()
	 {
		 return this.colore;
	 }
	
	 public int getCarteRimanenti()
	 {
		 int rim=132-this.numero;
		 return rim;
	 }
	 public boolean getFinite()
	 {
		 return finite;
	 }
	public char getInizialeColore()
	{
		char a= colore.charAt(0);
		return  a;
	}

}
