/**
*<p>Clase AreaCirculo</p>
*<p>La fórmula del área un círculo es pi*r2, siendo r el radio del círculo</p>
*<p>Calcula y muestra el área de un círculo cuyo r=7.</p>
*@author Francisco Ramirez Ruiz
*/
class AreaCirculo{

	public static void main(String[] args){
		//Declaracion de variables
		double area;
		double pi=3.1415926535897932384;
		int diametro=49;

		//Calculo del area
		area = pi*diametro;
		
		//Se imprime por pantalla
		System.out.println("El area del circulo es: "+area);
	}
}