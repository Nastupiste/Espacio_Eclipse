import java.util.Scanner;

/*Pedir un número N, y mostrar los N primeros números de la sucesión de Fibonacci.*/

public class E_14 {
	public static void main(String[] args) {
		
	System.out.println("Introduce un número;\nMostraré la Sucesión de Fibonacci que llegan hasta él:");
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	sc.close();
	int num1=0,num2=1,suma=0;

	for(int i=0;i<num;i++) 
		{
		System.out.println(num1);
		suma=num1+num2;
		num1=num2;
		num2=suma;
		}
	}
}