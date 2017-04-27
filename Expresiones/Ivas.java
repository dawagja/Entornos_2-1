/**
*Clase Ivas.
*El iva es un impuesto aplicable al consumo en la CEE. En España hay tres tipos de ivas: superreducido 4%, reducido 10% y general 21%.
*Calcula y muestra el iva aplicado a los siguientes productos: Papel higiénico (2,70), pañales (15,95), maquinilla de afeitar (8,75), colonia (1,45).
*@author Francisco Ramirez Ruiz
*/
class Ivas{
	public static void main(String[] args){
		//Delaracion de variables
		double papelHigienico = 2.70;
		double panales = 15.95;
		double maquinilla = 8.75;
		double colonia = 1.45;
		double superreducido = 0.04;
		double reducido = 0.1;
		double general = 0.21;

		//variable papel Higienico
		double papelHigienicoSuperreducido;
		double papelHigienicoReducido;
		double papelHigienicoGeneral;

		//variable pañales
		double panalesSuperreducido;
		double panalesReducido;
		double panalesGeneral;

		//variable maquinilla
		double maquinillaSuperreducido;
		double maquinillaReducido;
		double maquinillaGeneral;

		//variable colonia
		double coloniaSuperreducido;
		double coloniaReducido;
		double coloniaGeneral;

		//Calculo con el porcentaje
		//papel
		papelHigienicoSuperreducido = (papelHigienico*superreducido)+papelHigienico;
		papelHigienicoReducido = (papelHigienico*reducido)+papelHigienico;
		papelHigienicoGeneral = (papelHigienico*general)+papelHigienico;

		//pañales
		panalesSuperreducido = (panales*superreducido)+panales;
		panalesReducido = (panales*reducido)+panales;
		panalesGeneral = (panales*general)+panales;

		//maquinilla
		maquinillaSuperreducido = (maquinilla*superreducido)+maquinilla;
		maquinillaReducido = (maquinilla*reducido)+maquinilla;
		maquinillaGeneral = (maquinilla*general)+maquinilla;

		//colonia
		coloniaSuperreducido = (colonia*superreducido)+colonia;
		coloniaReducido = (colonia*reducido)+colonia;
		coloniaGeneral = (colonia*general)+colonia;

		//Se imprime por pantalla
		System.out.println("\nPrecio del papel higienico es: "+papelHigienico);
		System.out.println("Precio del papel higienico superreducido: " +papelHigienicoSuperreducido);
		System.out.println("Precio del papel higienico reducido: "+papelHigienicoReducido);
		System.out.println("Precio del papel higienico general: "+papelHigienicoGeneral);
		System.out.println("\nPrecio de los panales es: "+panales);
		System.out.println("Precio de los panales superreducido: "+panalesSuperreducido);
		System.out.println("Precio de los panales reducido: "+panalesReducido);
		System.out.println("Precio de los panales general:"+panalesGeneral);
		System.out.println("\nPrecio de las maquinillas: "+maquinilla);
		System.out.println("Precio de las maquinillas superreducidas: "+maquinillaSuperreducido);
		System.out.println("Precio de las maquinillas reducidas: "+maquinillaReducido);
		System.out.println("Precio de las maquinillas generales: "+maquinillaGeneral);
		System.out.println("\nPrecio de la colonia es: "+colonia);
		System.out.println("Precio de la colonia superreducida es: "+coloniaSuperreducido);
		System.out.println("Precio de la colonia reducidad es: "+coloniaReducido);
		System.out.println("Precio de la colonia general es: "+coloniaGeneral);






	}


}