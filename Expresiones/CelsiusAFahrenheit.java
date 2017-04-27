/**
*Clase CelsiusAFahrenheit:
*En los EEUU sigue utilizándose los grados Fahrenheit para la medición de la temperatura.
*Calcula cuántos grados Fahrenheit son los puntos de ebullición (100 grados Celsius) y de congelación (0 grados Celsius)
*@author Francisco Ramirez Ruiz
*/
class CelsiusAFahrenheit{

	public static void main(String[] args){
		//Declaracion de variables
		int CELSIUS_EBULLICION = 100;
		int CELSIUS_EBULLICION = 0;
		double fahrenheitEbullicion;
		double fahrenheitCongelacion;

		//Calculo de los puntos
		fahrenheitEbullicion = CELSIUS_EBULLICION*1.8+32;
		fahrenheitCongelacion = CELSIUS_EBULLICION*1.8+32;
		
		//Se imprime por pantalla
		System.out.print("Los grados de Fahrenheit de ebullicion son: "+fahrenheitEbullicion+" y de congelacion es: "+fahrenheitCongelacion);


	}
}
