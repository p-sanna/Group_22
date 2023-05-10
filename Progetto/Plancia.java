package Progetto;

public class Plancia {
	Carta []riga1;
	Carta []riga2;
	Carta []riga3;
	Carta []riga4;
	Carta []riga5;
	Carta []riga6;
	Carta []riga7;
	Carta []riga8;
	Carta []riga9;
	int ngioc=0;
	
	public Plancia (int ngioc)
	{
	 this.ngioc=ngioc;
		switch (ngioc)
		{
			case'2':
				this.riga1=new Carta[0];
				this.riga2=new Carta[2];
				this.riga3=new Carta[3];
				this.riga4=new Carta[6];
				this.riga5=new Carta[7];
				this.riga6=new Carta[6];
				this.riga7=new Carta[3];
				this.riga8=new Carta[2];
				break;
			case'3':
				
				this.riga1=new Carta[1];
				this.riga2=new Carta[2];
				this.riga3=new Carta[5];
				this.riga4=new Carta[7];
				this.riga5=new Carta[7];
				this.riga6=new Carta[7];
				this.riga7=new Carta[5];
				this.riga8=new Carta[2];
				this.riga9=new Carta[1];
				break;
			
			case '4':
				this.riga1=new Carta[2];
				this.riga2=new Carta[3];
				this.riga3=new Carta[5];
				this.riga4=new Carta[8];
				this.riga5=new Carta[9];
				this.riga6=new Carta[8];
				this.riga7=new Carta[5];
				this.riga8=new Carta[3];
				this.riga9=new Carta[2];
				break;
				
		}
	
	}
  public void CaricaCarte(Carta c, int i, Plancia p)
  {
	  switch(p.ngioc)
	  {
	  case'2':
			this.riga1[i]=null;
			this.riga2[i]=c;
			this.riga3[i]=c;
			this.riga4[i]=c;
			this.riga5[i]=c;
			this.riga7[i]=c;
			this.riga8[i]=c;
			
			
			break;
		case'3':
			
			this.riga1[i]=c;
			this.riga2[i]=c;
			this.riga3[i]=c;
			this.riga4[i]=c;
			this.riga5[i]=c;
			this.riga7[i]=c;
			this.riga8[i]=c;
			this.riga9[i]=c;
			
			break;
		
		case '4':
			
			
			this.riga1[i]=c;
			this.riga2[i]=c;
			this.riga3[i]=c;
			this.riga4[i]=c;
			this.riga5[i]=c;
			this.riga7[i]=c;
			this.riga8[i]=c;
			this.riga9[i]=c;
			break;
	  }
  }
}
