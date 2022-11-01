import javax.swing.JOptionPane;

/*	3.- Una empresa fabrica motores de automóviles. Se pretende contabilizar las unidades 
	fabricadas cada mes. Para ello, disponemos del número de motores que se ha fabricado 
	cada día. Realizar un programa en Java que: 

- Pida el número del mes que se va a introducir (sólo se van a introducir datos de un 
mes). 
- Para cada día de ese mes debe pedir el número de piezas que se ha fabricado. 
Sabemos que en un día nunca se van a fabricar más de 1000 motores. No todos los 
meses tienen igual número de días; consideramos febrero con 28 días. 
- Debe mostrarse al final: Qué día se fabricaron más piezas. Cuál fue el mínimo de 
motores fabricadas. Cuántos motores se han fabricado en el mes. Si algún día se ha 
fabricado menos de 300 motores, debe indicarse al final con el mensaje: “Existen días 
por debajo del mínimo”.*/

public class pruebaExamen_03 {

	public static void main(String[] args) {

		int diasMes=0;
		int prodDia=0;
		int prodTotal=0;
		int prodMax=0;
		int prodMin=Integer.MAX_VALUE;
		int topProd=0;
		String resultado="";
		int mes = Integer.parseInt(JOptionPane.showInputDialog("¿Qué mes es?:"));		

		while (mes<1||mes>12) 
		{
			mes = Integer.parseInt(JOptionPane.showInputDialog("Ta equivocao cabesa ponme un mes weno: "));
		}

		if (mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12)
		{
			diasMes=31;
		}
		else if (mes==4||mes==6||mes==9||mes==11)
		{
			diasMes=30;
		}
		else 
		{
			diasMes=28;
		}

		for (int i=1;i<diasMes+1;i++)
		{
			prodDia=Integer.parseInt(JOptionPane.showInputDialog("Día "+i+" ¿Cuál ha sido la producción hoy?: "));

			if (prodDia>1000) 
			{
				prodDia=1000;
			}

			if (prodDia<prodMin)

			{
				prodMin=prodDia;
			}
			
			if (prodDia>prodMax)

			{
				prodMax=prodDia;
				topProd=i;
			}

			prodTotal+=prodDia;
		}

		resultado="Información\nEl día "+topProd+" se fué el más productivo.\n"
				+ "La producción máxima fue de "+prodMax+" unidades.\n"
				+ "La producción mínima fue de "+prodMin+" unidades.\n"
				+ "La producción total del mes ha sido de "+prodTotal+" unidades.\n";
		if (prodMin<300) 
		{
			resultado+="Existen días por debajo del mínimo";
		}
		JOptionPane.showMessageDialog(null, resultado);
	}
}
