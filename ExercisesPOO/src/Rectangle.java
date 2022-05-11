import java.util.Scanner;

public class Rectangle {

	double high=1, wide=1;
	Scanner sc = new Scanner(System.in);

	Rectangle(){
	}
	Rectangle(double highSc, double wideSc){

		highSc = sc.nextDouble();
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
