/**
*<p>Clase  Circunferencia.</p>
*<p>La fórmula de la circunferencia de un círculo es 2*pi*r, siendo r el radio del círculo.</p>
*<p>Calcula y muestra la circunferencia de un círculo, siendo r=7.</p>
*@author Francisco Ramirez Ruiz
*/
class Circunferencia{
	
	public static void main(String[] args){
	//Declaracion de variables	
	double circunferencia;
	double PI=3.1415926535897932384;
	int radio=7;

	//calculo de la circunferencia
	circunferencia=2*PI*radio;

	//Se imprime por pantalla
	System.out.println("La circunferencia de un circulo es: "+circunferencia);

	}
}