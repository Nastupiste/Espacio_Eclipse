import javax.swing.JOptionPane;

/*Tras la polémica del caso “Carmen Mola”, en una librería se desea
hacer una estudio sobre autores y sus libros. Realiza un programa en Java que permita introducir los
datos de los autores y sus libros, y posteriormente muestre unos resultados.
Los datos se pedirán de la siguiente forma:

En primer lugar, se pedirá el número de autores de los que van a introducirse datos. Para cada
autor, se pedirá su nombre y su sexo, cosa que indicará mediante “M” o “H”. A continuación, se
introducirán los datos de sus libros, de la forma: título del libro (tipo String), precio unitario (float) y
unidades vendidas. La serie de libros escritos por cada autor terminará cuando su título sea “fin”. (1
punto la petición correcta de datos).

Los resultados que se deben mostrar al finalizar la introducción de datos son:
	a) (1,75 puntos) Porcentaje de autores que son mujer. Suponemos que al menos se va a
		introducir un autor de cada sexo.
	b) (1,75 puntos) Sexo del autor en el que más dinero se han gastado los clientes en total.
	c) (1,75 puntos) Cuántas autoras (mujer) han escrito 3 libros o más.
	d) (1,75 puntos) Título de los dos libros más baratos.
	e) (2 puntos) Cuál ha sido el título del libro más caro de entre los escritos por los autores que
	han escrito más de 2 libros. Si no hay ninguno, en su lugar se mostrará “ningún autor ha
	escrito más de dos libros”*/

public class pruebaExamen_05_libros {

	public static void main(String[] args) {

		int numAutores=0,unidadesVendidas=0,contLibros=0,contMujer=0,contHombre=0,totalAutores=0,superEscritora=0;
		float precio=0,porcentajeMujer=0,barato1=1000,barato2=1000,maxPrice=-1,profitLibro=0,profitTotal=0,topGanancias=0;
		String nombre="", titulo="",resultado="",mostExpensive="",oferta1="",oferta2="";
		char sexo=' ',topSeller=' ';

		/*Pedimos el número de autores para completar la condición del for*/

		numAutores=Integer.parseInt(JOptionPane.showInputDialog("Número de autores: "));

		for(int i=0;i<numAutores;i++) 
		{
			contLibros=0;
			/*Recogemos los datos para poder */
			nombre=JOptionPane.showInputDialog("Introduzca el nombre: ");
			sexo=JOptionPane.showInputDialog("Introduzca el sexo: ").toUpperCase().charAt(0);
			titulo=JOptionPane.showInputDialog("Titulo del libro: ");
			if (sexo=='M') 
			{
				contMujer++;
			}
			else 
			{
				contHombre++;
			}

			while(!titulo.equals("fin"))
			{

				contLibros++;

				precio=Float.parseFloat(JOptionPane.showInputDialog("Precio por unidad: "));
				if (precio<barato1)
				{
					barato2=barato1;
					barato1=precio;
					oferta1=titulo;
				}
				
				else if (precio<barato2)
				{
					barato2=precio;
					oferta2=titulo;
				}

				if (contLibros>2)
				{
					if(precio>maxPrice)
					{
						maxPrice=precio;
						mostExpensive=titulo;
					}
				}

				unidadesVendidas=Integer.parseInt(JOptionPane.showInputDialog("Unidades vendidas: "));
				profitLibro=precio*unidadesVendidas;
				profitTotal+=profitLibro;
				if (profitTotal>topGanancias)
				{
					topGanancias=profitTotal;
					topSeller=sexo;
				}
				titulo=JOptionPane.showInputDialog("Titulo del libro: ");
			}

			if (contLibros>=3&&sexo=='M') 
			{
				superEscritora++;
			}
		}

		totalAutores=contMujer+contHombre;
		porcentajeMujer=(((float)contMujer)/totalAutores)*100;

		resultado="El porcentaje de autores que son mujer es: "+porcentajeMujer+"%.\n"
				+ "El género del autor que más beneficio ha obtenido con sus libros es: "+topSeller+".\n"
				+ "El número de mujeres con 3 libros o más es: "+superEscritora+".\n"
				+ "Los títulos más baratos son: "+oferta1+" y "+oferta2+".\n";

		if (!mostExpensive.equals(""))
		{
			resultado+="El Título más caro de los autores con más de 2 libros es: "+mostExpensive+".";
		}
		else
		{
			resultado+="Ningún autor ha escrito más de dos libros.";
		}

		JOptionPane.showMessageDialog(null, resultado);
	}
}
