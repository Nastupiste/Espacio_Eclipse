import javax.swing.JOptionPane;

public class pruebaExamen_03_bis {

	public static void main(String[] args) {

		int numMes=0,numDias=0,numPiezas=0,totalPiezas=0,minPiezas=1000,maxPiezas=-1,prodDia=0;
		boolean menosDe300=false;

		numMes=Integer.parseInt(JOptionPane.showInputDialog("Mes: "));

		switch(numMes) 
		{
		case 1:
		case 3: 
		case 5:
		case 7: 
		case 8:
		case 10: 
		case 12: 
			numDias=31;
			break;

		case 4: 
		case 6:
		case 9: 
		case 11:
			numDias=30;
			break;
		case 2:
			numDias=28;
			break;
		}

		for(int dia=1; dia<=numDias;dia++) 
		{
			numPiezas=Integer.parseInt(JOptionPane.showInputDialog("Piezas del día "+dia+": "));

			if (numPiezas<300) 
			{
				menosDe300=true;
			}

			if (numPiezas<minPiezas) 
			{
				minPiezas=numPiezas;
			}
			if (numPiezas>maxPiezas)
			{
				maxPiezas=numPiezas;
				prodDia=dia;
			}
			totalPiezas+=numPiezas;
		}
		JOptionPane.showMessageDialog(null, "Día que se fabricaron más piezas: "+prodDia);
		JOptionPane.showMessageDialog(null, "Mínimo de piezas: "+minPiezas);
		JOptionPane.showMessageDialog(null, "Total de Piezas del Mes: "+totalPiezas);
		if (menosDe300)
			JOptionPane.showMessageDialog(null,"Existen días por debajo del mínimo.");
	}
}
