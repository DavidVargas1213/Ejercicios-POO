
//Crear una clase llamada ObjetosPrueba con su método main en donde debe crear una instancia del objeto Rectangle.
public class Rectangle {
	
	//Los atributos de la clase deberían de tener el modificador de acceso 'private'
	//Los atributos NO deberían de tener el valor 1 por defecto. Se deberían declarar únicamente. Ej: int miVariable;
	private double high, wide;
	//El constructor DEBE tener el modificador de acceso 'public'
	public Rectangle(){
	}
	
	//El constructor DEBE tener el modificador de acceso 'public'
	//Sugiero hacer uso de la palabra this para hacer refencia a los atributos de la clase. Ej: this.high = highSc
	public Rectangle(double highSc, double wideSc){
		
		this.high = highSc; 
		this.wide = wideSc;
	}
	double getArea() {
		return high * wide;
	}
	double getPerimeter() {
		return 2 * (high + wide);
	}
}
