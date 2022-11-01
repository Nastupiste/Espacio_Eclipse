import javax.swing.JOptionPane;

/*1.- En un centro educativo, en un determinado nivel existen 4 grupos: A, B, C y D. El
grupo A tiene 25 alumnos, el B tiene 28, el C tiene 31 y el D tiene 29. Para cada alumno
disponemos de las notas del primer, segundo y tercer parcial. Realizar un programa en Java
que:
- Pida la letra del grupo que se va a introducir (sólo se va a introducir un grupo).
- Para ese grupo, pida para cada alumno el nombre, la nota del primer parcial, del
segundo y del tercero.
- Debe mostrarse al final: El nombre del alumno con mayor nota media (media de los
tres parciales). Cuántos alumnos tienen la nota media suspensa. Si existe algún
alumno con nota mayor o igual que 9, debe indicarse al final con el mensaje:
“Existen sobresalientes”*/

public class pruebaExamen_01 {

	public static void main(String[] args) {

		int grupo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número del grupo deseado.\nPulse 1 para Grupo A:\nPulse 2 para Grupo B:\nPulse 3 para Grupo C:\nPulse 4 para Grupo D:\n"));
		String bestStudent="",nombreAlumno="",resultado="";
		float n1,n2,n3,bestMedia=0,notaMedia=0;
		int suspensos=0;
		int sobresalientes=0;

		while (grupo<1||grupo>4) 
		{
			grupo = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número del grupo deseado.\nPulse 1 para Grupo A:\nPulse 2 para Grupo B:\nPulse 3 para Grupo C:\nPulse 4 para Grupo D:\n"));
		}

		switch(grupo) 
		{

		case 1: for(int i=0;i<4;i++) 
		{
			nombreAlumno=JOptionPane.showInputDialog("Grupo A\nNombre del Alumno: ");
			n1=Float.parseFloat(JOptionPane.showInputDialog("Nota 1º Parcial: "));
			n2=Float.parseFloat(JOptionPane.showInputDialog("Nota 2º Parcial: "));
			n3=Float.parseFloat(JOptionPane.showInputDialog("Nota 3º Parcial: "));
			notaMedia=(n1+n2+n3)/3;

			if (notaMedia<5)
			{
				suspensos++;
			}
			if (notaMedia>=9) 
			{
				sobresalientes++;
			}
			if (notaMedia>bestMedia) 
			{	
				bestMedia=notaMedia;
				bestStudent=nombreAlumno;
			}
		}	
		resultado="El alumno; "+bestStudent+" del grupo A.\nHa conseguido la mejor nota media: "+bestMedia+".\nHan suspendido: "+suspensos+" alumnos.\nHay "+sobresalientes+" sobresalientes";
		JOptionPane.showMessageDialog(null, resultado);
		break;
		
		case 2: for(int i=0;i<4;i++) 
		{
			nombreAlumno=JOptionPane.showInputDialog("Grupo B\nNombre del Alumno: ");
			n1=Float.parseFloat(JOptionPane.showInputDialog("Nota 1º Parcial: "));
			n2=Float.parseFloat(JOptionPane.showInputDialog("Nota 2º Parcial: "));
			n3=Float.parseFloat(JOptionPane.showInputDialog("Nota 3º Parcial: "));
			notaMedia=(n1+n2+n3)/3;

			if (notaMedia<5)
			{
				suspensos++;
			}
			if (notaMedia>=9) 
			{
				sobresalientes++;
			}
			if (notaMedia>bestMedia) 
			{	
				bestMedia=notaMedia;
				bestStudent=nombreAlumno;
			}
		}	
		resultado="El alumno; "+bestStudent+" del grupo B.\nHa conseguido la mejor nota media: "+bestMedia+".\nHan suspendido: "+suspensos+" alumnos.\nHay "+sobresalientes+" sobresalientes";
		JOptionPane.showMessageDialog(null, resultado);
		break;
		
		case 3: for(int i=0;i<4;i++) 
		{
			nombreAlumno=JOptionPane.showInputDialog("Grupo C\nNombre del Alumno: ");
			n1=Float.parseFloat(JOptionPane.showInputDialog("Nota 1º Parcial: "));
			n2=Float.parseFloat(JOptionPane.showInputDialog("Nota 2º Parcial: "));
			n3=Float.parseFloat(JOptionPane.showInputDialog("Nota 3º Parcial: "));
			notaMedia=(n1+n2+n3)/3;

			if (notaMedia<5)
			{
				suspensos++;
			}
			if (notaMedia>=9) 
			{
				sobresalientes++;
			}
			if (notaMedia>bestMedia) 
			{	
				bestMedia=notaMedia;
				bestStudent=nombreAlumno;
			}	
		}	
		resultado="El alumno; "+bestStudent+" del grupo C.\nHa conseguido la mejor nota media: "+bestMedia+".\nHan suspendido: "+suspensos+" alumnos.\nHay "+sobresalientes+" sobresalientes";
		JOptionPane.showMessageDialog(null, resultado);
		break;
		
		case 4: for(int i=0;i<4;i++) 
		{
			nombreAlumno=JOptionPane.showInputDialog("Grupo D\nNombre del Alumno: ");
			n1=Float.parseFloat(JOptionPane.showInputDialog("Nota 1º Parcial: "));
			n2=Float.parseFloat(JOptionPane.showInputDialog("Nota 2º Parcial: "));
			n3=Float.parseFloat(JOptionPane.showInputDialog("Nota 3º Parcial: "));
			notaMedia=(n1+n2+n3)/3;

			if (notaMedia<5)
			{
				suspensos++;
			}
			if (notaMedia>=9) 
			{
				sobresalientes++;
			}
			if (notaMedia>bestMedia) 
			{	
				bestMedia=notaMedia;
				bestStudent=nombreAlumno;
			}
		}
		resultado="El alumno; "+bestStudent+" del grupo D.\nHa conseguido la mejor nota media: "+bestMedia+".\nHan suspendido: "+suspensos+" alumnos.\nHay "+sobresalientes+" sobresalientes";
		JOptionPane.showMessageDialog(null, resultado);
		break;	
		}
	}
}
