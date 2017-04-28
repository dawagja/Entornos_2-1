/**
*<p>Clase PerimetroRectangulo.</p>
*<p>La fórmula del perímetro de un rectángulo es 2*b + 2*h, siendo b la base y h la altura.</p>
*<p>Calcula y muestra el perímetro de un rectángulo, siendo b=2 y h=7.</p>
*@author Francisco Ramírez Ruiz
*/
class PerimetroRectangulo{

	public static void main(String[] args){

		int perimeter;
		int base=2;
		int height=7;

		perimeter=2*base+2*height;
		
		System.out.println("Rectangle's perimeter: "+ perimeter);

	}
}