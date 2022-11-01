import javax.swing.JOptionPane;

/*4.- Un país centroamericano se encuentra dividido en cuatro regiones autonómicas. La 
región número 1 tiene 10 provincias, la número 2 tiene 4 provincias, la 3 tiene 6 provincias, 
y la 4 sólo 1 provincia. Se pretende contabilizar los votos que se han efectuado en una de 
las autonomías. Realiza un programa en Java que: 

	- Pida el número de región del que se van a introducir datos (sólo se van a introducir 
	  datos de una autonomía). 
	- Pedir, para cada provincia de esa región, el nombre de la provincia, el número de 
	  votos obtenido por el partido “A”, número de votos del partido “B”, y número de 
	  abstenciones. 
	- Debe mostrarse al final: Porcentaje de votos totales y de abstención en la región.
	  Nombre de la provincia donde el partido “A” ha obtenido más votos, y donde el 
	  partido “B” ha obtenido más votos. Si en alguna provincia el número de 
	  abstenciones es mayor de 100.000, debe mostrarse al final el mensaje: “Alta 
	  abstención”.*/
public class pruebaExamen_04 {
	public static void main(String[] args) {

		int numRegion,numProvincias=0,votosA=0,totalA=0,votosB=0,totalB=0,abstencion=0,totalAbstencion=0,mejorA=0,mejorB=0;
		float porcentajeA=0,porcentajeB=0,porcentajeAbs=0;
		boolean abstencionAlta=false;
		String nombreProvincia = "",ganaA="", ganaB="",resultado="";

		numRegion=Integer.parseInt(JOptionPane.showInputDialog("Introduce el nº de la Región;\n1. Tiene 10 Provincias\n"
				+ "2. Tiene 4 provincias\n3. Tiene 6 provinvias\n4. Tiene 1 provincia"));

		switch(numRegion)
		{
		case 1: numProvincias=10;
		break;
		case 2: numProvincias=4;
		break;
		case 3: numProvincias=6;
		break;
		case 4: numProvincias=1;
		break;
		}		
		for(int i=0;i<numProvincias;i++)
		{
			nombreProvincia=JOptionPane.showInputDialog("Introduzca el nombre de la provincia: ");
			votosA=Integer.parseInt(JOptionPane.showInputDialog("Nº de votos del partido A: " ));
			votosB=Integer.parseInt(JOptionPane.showInputDialog("Nº de votos del partido B: " ));
			abstencion=Integer.parseInt(JOptionPane.showInputDialog("Nº de abstenciones: " ));

			if(votosA>mejorA)
			{
				mejorA=votosA;
				ganaA=nombreProvincia;
			}
			if(votosB>mejorB)
			{
				mejorB=votosB;
				ganaB=nombreProvincia;
			}
			if(abstencion>100000)
			{
				abstencionAlta=true;
			}
			totalA+=votosA;
			totalB+=votosB;
			totalAbstencion+=abstencion;
		}

		porcentajeA=((float)totalA/(totalA+totalB+totalAbstencion))*100;
		porcentajeB=((float)totalB/(totalA+totalB+totalAbstencion))*100;
		porcentajeAbs=((float)totalAbstencion/(totalA+totalB+totalAbstencion))*100;

		resultado="El partido A ha obtenido el "+porcentajeA+"% de los votos.\n"
				+ "El partido B ha obtenido el "+porcentajeB+"% de los votos.\n"
				+ "El porcentaje de abstención ha sido del "+porcentajeAbs+"%.\n"
				+ "El partido A ha obtenido más votos en la provincia: "+ganaA+".\n"
				+ "El partido B ha obtenido más votos en la provincia: "+ganaB+".\n";

		if(abstencionAlta=true)
		{
			resultado+="Alta abstención";
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
}
