import javax.swing.JOptionPane;

/*Pedir un número N, pedir N sueldos, y mostrar el máximo sueldo.*/
public class E_17 {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de sueldos: "));
		float sueldo=0,sueldoMax=0;

		for(int i=0;i<n;i++)
		{
			sueldo=Float.parseFloat(JOptionPane.showInputDialog("Introduce el  sueldo "+(i+1)+": "));
			if (sueldo>sueldoMax) 
			{
				sueldoMax=sueldo;
			}
		}
		JOptionPane.showMessageDialog(null, "El sueldo mayor ha sido: "+sueldoMax+" euros");
	}
}
