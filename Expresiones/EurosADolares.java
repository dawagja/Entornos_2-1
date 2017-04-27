/**
*<p>Clase EurosADolares.</p>
*<p>Mirando la tabla de cambios, veo que el euro está a 1,1256 dólares americanos.</p>
*<p>Mi abuela se dispone a hacer un viaje a LA, California (EEUU). ¿Cuántos dólares obtendrá al cambiar 300 Euros?</p>
*@author Francisco Ramirez Ruiz
*/

class EuroADolares{

	public static void main(String[] args) {
		//Declaracion de variables
		double dolares;
		int euros=300;

		//Calculo de los dolares
		dolares=euros*1.1256;
		
		//Se imprime por pantalla
		System.out.println("Obtendra "+dolares+" dolares");

	}
}