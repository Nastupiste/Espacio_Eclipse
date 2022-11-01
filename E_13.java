import javax.swing.JOptionPane;

/*Pedir 25 números, y mostrar la media de los positivos, la media de los negativos y el número de ceros introducidos.*/

public class E_13 {
	
	public static void main(String[] args) {

		/* pedir números por jOption, */

		float num;
		float positivos=0;
		float negativos=0;
		int cero=0;
		int contador=1;
		int contadorPositivos=0;
		int contadorNegativos=0;
		float mediaPositivos;
		float mediaNegativos;
		
		JOptionPane.showMessageDialog(null, "REGLAS\nIntroduce 25 números;\nPueden ser positivos y negativos.\nTe mostraré la media de cada grupo.");
		while(contador<=10) 
		{
			num=Float.parseFloat(JOptionPane.showInputDialog("introduce un número: "));
			if (num==0)
			{
				cero++;
			}
			else 
			{
				if(num>0)
				{
					positivos=positivos+num;
					contadorPositivos++;
				}
				else
				{	
					negativos=negativos+num;
					contadorNegativos++;
				}
			}
			contador++;
		}
		mediaPositivos=positivos/contadorPositivos;
		mediaNegativos=negativos/contadorNegativos;

		JOptionPane.showMessageDialog(null, "RESULTADOS;\nMedia de los positivos: "+mediaPositivos+"\nMedia de los Negativos: "+mediaNegativos+"\nNºCeros: "+cero);


	}

}
