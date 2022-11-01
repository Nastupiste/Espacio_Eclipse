import javax.swing.JOptionPane;

/* 2.- Un grupo de biólogos está realizando un trabajo de campo, tomando medidas de árboles 
de un bosque. Una vez tomados los datos, deben introducirlos en un ordenador. Los datos 
que han tomado de los árboles son: Tipo del árbol (A o B), diámetro del tronco y altura en 
metros. Además, si el árbol es de tipo B, se dispone de la edad del mismo en años. Realizar 
un programa en Java que:
 
- Pida el número de árboles de los que se van a introducir datos. 
- Para cada árbol, debe pedir el tipo, diámetro y altura; si es tipo B además, la edad. 
- Debe mostrarse al final: Media de las alturas de los árboles. Altura máxima, 
mínima, diámetro máximo y mínimo. Media de las edades de árboles del tipo B. Si 
existe algún árbol de más de 30 m., debe indicarse al final con el mensaje: “Existen 
árboles de más de 30 m.” */

public class pruebaExamen_02 {

	public static void main(String[] args) {

		int totalArboles=0,tipoArbol=0,edad=0,edadTotal=0,tipoB=0;
		float altura=0,alturaTotal=0,alturaMax=0,alturaMin=Float.MAX_VALUE,mediaAltura=0;
		float diametro=0,diametroMax=0,diametroMin=Float.MAX_VALUE;
		float edadMedia=0;
		String resultado="";
		
		totalArboles=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número total de árboles: "));

		for(int i=0;i<totalArboles;i++) 
		{
			tipoArbol = Integer.parseInt(JOptionPane.showInputDialog("¿Qué tipo de árbol es?\n - Pulse 1 para A.\n - Pulse 2 para B."));

			switch(tipoArbol) 
			{
			case 1:
			{
				altura= Float.parseFloat(JOptionPane.showInputDialog("Introduzca la altura: "));
				diametro= Float.parseFloat(JOptionPane.showInputDialog("Introduzca el diámetro: "));
			}	
			break;
			case 2:
			{
				altura= Float.parseFloat(JOptionPane.showInputDialog("Introduzca la altura: "));
				diametro= Float.parseFloat(JOptionPane.showInputDialog("Introduzca el diámetro: "));
				edad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad"));
				edadTotal+=edad;
				tipoB++;
			}
			break;	
			}
			if (altura<alturaMin)
			{
				alturaMin=altura;
			}
			if (altura>alturaMax) 
			{
				alturaMax=altura;
			}
			if (diametro<diametroMin)
			{
				diametroMin=diametro;
			}
			if (diametro>diametroMax) 
			{
				diametroMax=diametro;
			}
			alturaTotal+=altura;
		}
		mediaAltura=alturaTotal/totalArboles;
		edadMedia=(float)edadTotal/tipoB;
		resultado="Información:\n"
				+ "La altura Media de los árboles es: "+mediaAltura+"m.\n"
				+ "La altura Máxima es:"+alturaMax+" m.\n"
				+ "La altura Mínima es: "+alturaMin+"m.\n"
				+ "El diámetro Máximo es: "+diametroMax+"m.\n"
				+ "El diámetro Mínimo es: "+diametroMin+"m.\n";
				
	
		if (tipoB>0)
		{
			resultado+="La edad media de los árboles tipo B es: "+edadMedia+" años.\n";
		}	
		if (alturaMax>30)
		{
			resultado+="Existen árboles de más de 30 m.";
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
}
