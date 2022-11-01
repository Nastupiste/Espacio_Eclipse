/*Escribir el producto de los 10 primeros números impares, usando bucles.*/
public class E_09_bis {

	public static void main(String[] args) {

		int producto=1;
		for (int n=1;n<20;n+=2) 
		{
			producto=producto*n;
		}
	System.out.println(producto);	
	}
}
