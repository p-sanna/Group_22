package Funzionalità;

import java.util.ArrayList;

import Progetto.Plancia;
import Progetto.Tessera;

public class Ciclico {
	int i=0;
	
	public Tessera[] Ciclo (int partenza,int aumento,ArrayList <Tessera> c,Plancia p)
	{
		for ( i=partenza;i<(partenza+aumento);i++)
		{
			p.riga2[i]=c.get(i);
		}
	return p.riga2;
	}
	
	public  int getI() {
		return i;
	}

}
