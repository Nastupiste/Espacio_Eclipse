import javax.swing.JOptionPane;

/*Pedir las edades y nombres de 15 alumnos, y mostrar el nombre del alumno de edad máxima y el de edad mínima.*/
public class E_18 {

	public static void main(String[] args) {

		int edad=0,edadMin=Integer.MAX_VALUE,edadMax=0;
		String nombre="",viejoven="",jovenaso = "";
		JOptionPane.showMessageDialog(null, "Necesitamos recoger los siguientes datos del alumnado; ");
		for(int i=0;i<5;i++)
		{
			nombre=JOptionPane.showInputDialog("Nombre del alumno "+(i+1)+"º:");
			edad=Integer.parseInt(JOptionPane.showInputDialog("Edad del alumno: "+(i+1)+"º:"));
			if(edad>edadMax)
			{
				edadMax=edad;
				viejoven=nombre;
			}
			else
				if(edad<edadMin)
				{
					edadMin=edad;
					jovenaso=nombre;
				}
		}
		JOptionPane.showMessageDialog(null, "Resultados;\n"
				+ "El alumno mayor es "+viejoven+" con "+edadMax+" años.\n"
				+ "El alumno más joven es "+jovenaso+" con "+edadMin+" años.");
	}
}