import javax.swing.JOptionPane;

public class pruebaExamen_02_bis {

	public static void main(String[] args) {

		int numArboles=0;
		int edad=0;
		int contEdad=0;
		int sumaEdad=0;
		float mediaEdades=0;
		char tipo=' ';
		float diametro=0;
		float diametroMax=0;
		float totalDiametro=0;
		float mediaDiametro=0;
		float altura=0;
		float alturaMax=0;
		float totalAltura=0;
		float mediaAltura=0;
		float diametroMin=Float.MAX_VALUE;
		float alturaMin=Float.MAX_VALUE;
		boolean huboAlgunoMayorDe30=false;
		String resultado="";

		numArboles=Integer.parseInt(JOptionPane.showInputDialog("Número de árboles: "));

		for(int i=0;i<numArboles;i++)
		{
			tipo=JOptionPane.showInputDialog("Tipo de árbol: ").toUpperCase().charAt(0);
			diametro=Float.parseFloat(JOptionPane.showInputDialog("Introduzca el diámetro: "));
			altura=Float.parseFloat(JOptionPane.showInputDialog("Introduzca la altura: "));

			if (altura>30)
			{
				huboAlgunoMayorDe30=true;
			}

			if (tipo == 'B') 
			{
				edad=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la edad"));
				sumaEdad+=edad;
				contEdad++;
			}
			totalDiametro+=diametro;
			totalAltura+=altura;

			if (altura>alturaMax)
			{
				alturaMax=altura;
			}
			if (altura>alturaMin)
			{
				alturaMin=altura;
			}
			if (diametro>diametroMax)
			{
				diametroMax=diametro;
			}
			if (diametro>diametroMin)
			{
				diametroMin=diametro;
			}
		}
		mediaDiametro=totalDiametro/numArboles;
		mediaAltura=totalAltura/numArboles;
		mediaEdades=(float)sumaEdad/contEdad;

		resultado="Media de alturas: "+mediaAltura+" metros.\n"
				+ "Altura máxima: "+alturaMax+" metros.\n"
				+ "Altura mínima: "+alturaMin+" metros.\n"
				+ "Media de diámetro: "+mediaDiametro+" metros.\n"
				+ "Diámetro máximo: "+diametroMax+" metros.\n"
				+ "Diámetro mínimo: "+diametroMin+" metros.\n";
		if (contEdad>0)
		{
			resultado+="Media edades árboles tipo B: "+mediaEdades+" años.\n";
		}		
		if (huboAlgunoMayorDe30)
		{	
			resultado+="Existen árboles de más de 30 m";
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
}
