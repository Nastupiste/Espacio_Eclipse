import java.util.Scanner;

/*Pedir un número entero N, y mostrar todos los números enteros de 1 a N.*/

public class E_05 {

	public static void main(String[] args) {		
		
		System.out.print("Introduce un número, mostraré todos los enteros del 1 al número elegido: ");
		Scanner sc = new Scanner(System.in);
		int numero=sc.nextInt();
		sc.close();
		int contador=1;
		String resultado="";
		
		while (numero>1&&contador<=numero) 
		{			
			resultado=resultado+"\n"+contador;
			contador++;		
		}
		
		System.out.print(resultado);
	}
}
