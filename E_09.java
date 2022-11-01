import javax.swing.JOptionPane;

/*Escribir el producto de los 10 primeros números impares, usando bucles.*/

public class E_09 {

	public static void main(String[] args) {

		int n=0;
		long producto=1;
		int numImpares=1;
		while(numImpares<20) 
		{
		System.out.print(numImpares+"\n");
		producto=producto*numImpares;
		n++;
		numImpares=1+n*2;
		}	
		JOptionPane.showMessageDialog(null, "El producto de los 10 primeros números impares es:\n"+producto);
	}
}
