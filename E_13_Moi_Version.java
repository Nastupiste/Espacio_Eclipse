import javax.swing.JOptionPane;
/*13. Pedir 25 números, y mostrar la media de los positivos, la media de los negativos y el número de ceros introducidos.*/

public class E_13_Moi_Version {

	public static void main(String[] args) {
		
		float numero,mediaPo,mediaNe,totalPositivo=0,totalNegativo=0,sumaNegativo=0,sumaPositivo=0,i=0,totalCeros=0;
		
		numero=Float.parseFloat(JOptionPane.showInputDialog("Diga numeros"));
		
		
		while (i<=25) 
	{
		i++;
		if (numero>0)
		{
			
		totalPositivo++;
        sumaPositivo=sumaPositivo+numero;
		
		numero=Float.parseFloat(JOptionPane.showInputDialog("Diga otro numero"));
	}	
		else if (numero<0)
	{		
		totalNegativo++;
		sumaNegativo=sumaNegativo+numero;
		
		numero=Float.parseFloat(JOptionPane.showInputDialog("Diga otro numero"));
	}
		else 
		{	
			totalCeros++;
			numero=Float.parseFloat(JOptionPane.showInputDialog("Diga otro numero"));
		}
		
	}
		mediaPo=sumaPositivo/totalPositivo;
		mediaNe=sumaNegativo/totalNegativo;	
		JOptionPane.showMessageDialog(null,"La media de los numeros positvios es : " + mediaPo + "\nLa media de los numeros negativos es : " + mediaNe + "\nY el total de ceros es: " + totalCeros);	
	}

}
