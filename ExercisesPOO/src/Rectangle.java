//Scanner sobra. Los valores provienen del constructor, no de la consola.
import java.util.Scanner;

//Crear una clase llamada ObjetosPrueba con su método main en donde debe crear una instancia del objeto Rectangle.
public class Rectangle {
	
	//Los atributos de la clase deberían de tener el modificador de acceso 'private'
	//Los atributos NO deberían de tener el valor 1 por defecto. Se deberían declarar únicamente. Ej: int miVariable;
	double high=1, wide=1;
	
	//Scanner sobra. Los valores provienen del constructor, no de la consola.
	Scanner sc = new Scanner(System.in);
	
	//El constructor DEBE tener el modificador de acceso 'public'
	Rectangle(){
	}
	
	//El constructor DEBE tener el modificador de acceso 'public'
	//Sugiero hacer uso de la palabra this para hacer refencia a los atributos de la clase. Ej: this.high = highSc
	Rectangle(double highSc, double wideSc){
		
		//Scanner sobra. Los valores provienen del constructor, no de la consola.
		highSc = sc.nextDouble();
		//Scanner sobra. Los valores provienen del constructor, no de la consola.
		wideSc = sc.nextDouble();
		
		high = highSc;
		wide = wideSc;
	}
	
	double getArea() {
		return high * wide;

	}
	double getPerimeter() {
		return 2 * (high + wide);
	}
}
