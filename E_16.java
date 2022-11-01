import javax.swing.JOptionPane;

/*Pedir la edades y alturas de 30 alumnos, y mostrar la media de edad, la media de 
estatura, la cantidad de alumnos mayores de edad, y la cantidad de alumnos que 
miden más de 1,80*/

public class E_16 {

	public static void main(String[] args) {

		int edad=0,mayorEdad=0,altos=0,edadMedia=0,edadTot=0;
		float altura=0,alturaMedia=0,alturaTot=0;
		String resultado="";
		JOptionPane.showMessageDialog(null,"Introduce los siguientes datos sobre los alumnos;\n- Altura y Edad.");

		for (int i=0;i<30;i++)
		{
			edad=Integer.parseInt(JOptionPane.showInputDialog("Edad alumno "+(i+1)+": "));
			altura=Float.parseFloat(JOptionPane.showInputDialog("Altura alumno "+(i+1)+": "));
			edadTot+=edad;
			alturaTot+=altura;
			if(edad>=18)
			{
				mayorEdad++;
			}

			if(altura>1.8)
			{
				altos++;
			}
		}
		edadMedia=edadTot/30;
		alturaMedia=alturaTot/30;
		resultado="Información alumnos:\n"
				+ "La edad media es: "+edadMedia+" años.\n"
				+ "Hay "+mayorEdad+" alumnos mayores de edad.\n"
				+ "La altura media es: "+alturaMedia+"metros.\n"
				+ "Hay "+altos+ " alumnos considerados altos";
		JOptionPane.showMessageDialog(null, resultado);
	} 
}
