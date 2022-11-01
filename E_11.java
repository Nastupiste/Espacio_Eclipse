import javax.swing.JOptionPane;

/*Pedir números hasta que se introduzca uno negativo, y mostrar la media.*/ 

public class E_11 {

	public static void main(String[] args) {

		int contador=0;
		int suma=0;
		float media;
		
		int a=Integer.parseInt(JOptionPane.showInputDialog("REGLAS:\n1. Introduce todos los números que quieras.\n2. Si introduces un número negativo:\n- Mostraré la media de los números anteriores"));

		while (a>0)
		{
			suma=suma+a;	
			contador++;
			a=Integer.parseInt(JOptionPane.showInputDialog("Introduce otro número: "));
			
		}
		media=(float)suma/contador;
		JOptionPane.showMessageDialog(null, "La media de los números es: \n"+media);
	}
}
