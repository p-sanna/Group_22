package Progetto;

public class Plancia {
	Tessera []riga1;
	Tessera []riga2;
	Tessera []riga3;
	Tessera []riga4;
	Tessera []riga5;
	Tessera []riga6;
	Tessera []riga7;
	Tessera []riga8;
	Tessera []riga9;
	int ngioc=0;
	
	public Plancia (int ngioc)
	{
	 this.ngioc=ngioc;
		switch (ngioc)
		{
			case'2':
				this.riga1=new Tessera[0];
				this.riga2=new Tessera[2];
				this.riga3=new Tessera[3];
				this.riga4=new Tessera[6];
				this.riga5=new Tessera[7];
				this.riga6=new Tessera[6];
				this.riga7=new Tessera[3];
				this.riga8=new Tessera[2];
				break;
			case'3':
				
				this.riga1=new Tessera[1];
				this.riga2=new Tessera[2];
				this.riga3=new Tessera[5];
				this.riga4=new Tessera[7];
				this.riga5=new Tessera[7];
				this.riga6=new Tessera[7];
				this.riga7=new Tessera[5];
				this.riga8=new Tessera[2];
				this.riga9=new Tessera[1];
				break;
			
			case '4':
				this.riga1=new Tessera[2];
				this.riga2=new Tessera[3];
				this.riga3=new Tessera[5];
				this.riga4=new Tessera[8];
				this.riga5=new Tessera[9];
				this.riga6=new Tessera[8];
				this.riga7=new Tessera[5];
				this.riga8=new Tessera[3];
				this.riga9=new Tessera[2];
				break;
				
		}
	
	}
  public void CaricaCarte(Tessera c, int i, Plancia p)
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
