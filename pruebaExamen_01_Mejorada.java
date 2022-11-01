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


/*letra=nombre.charAt(0)*/

/*String nombre1,nombre2;
 
  nombre1="maría";
  nombre2=nombre1.toUpperCase();
 									
 									*/

public class pruebaExamen_01_Mejorada {

	public static void main(String[] args) {

		String bestStudent="",nombreAlumno="",resultado="",letra="";
		float n1,n2,n3,bestMedia=0,notaMedia=0;
		int suspensos=0;
		int sobresalientes=0;
		int numAlumnos=0;
		
		
		int grupo = JOptionPane.showInputDialog("Introduzca letra del grupo deseado.").toUpperCase().charAt(0);
		
		switch(grupo)
		{
		case 'A':
			numAlumnos=1;
			letra="A";
			break;
		case 'B':
			numAlumnos=2;
			letra="B";
			break;	
		case 'C':
			numAlumnos=3;
			letra="C";
			break;	
		case 'D':
			numAlumnos=4;
			letra="D";
			break;
		}

		for(int i=0;i<numAlumnos;i++) 
		{
			nombreAlumno=JOptionPane.showInputDialog("Grupo "+letra+"\nNombre del Alumno: ");
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
		resultado="El alumno; "+bestStudent+" del grupo"+letra+".\nHa conseguido la mejor nota media: "+bestMedia+".\nHan suspendido: "+suspensos+" alumnos.\nHay "+sobresalientes+" sobresalientes";
		JOptionPane.showMessageDialog(null, resultado);
	}
}

