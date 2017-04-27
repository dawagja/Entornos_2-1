/**
*<p>Clase PerimetroRectangulo.</p>
*<p>La fórmula del perímetro de un rectángulo es 2*b + 2*h, siendo b la base y h la altura.</p>
*<p>Calcula y muestra el perímetro de un rectángulo, siendo b=2 y h=7.</p>
*@author Francisco Ramírez Ruiz
*/
class PerimetroRectangulo{

	public static void main(String[] args){
	//Declaracion de variables	
	int perimetro;
	int base=2;
	int altura=7;

	//Calculo del perimetro
	perimetro=2*base+2*altura;
	
	//Se imprime por pantalla
	System.out.println("El perimetro del rectangulo es: "+ perimetro);

	}
}