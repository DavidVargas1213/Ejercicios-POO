import java.util.Date;
import java.util.Iterator;
import java.util.Random;


public class ObjetosPrueba {

	public static void main(String[] args) {
		/*Rectangle Rectangle1  = new Rectangle();
		System.out.println(Rectangle1.getArea()+"" + "" +Rectangle1.getPerimeter());
		Rectangle Rectangle2 = new Rectangle(5 , 6); 
		System.out.println(Rectangle2.getArea()+"aa" + "" +Rectangle1.getPerimeter());

		Date te = new Date();
		long elapsed=10000;
		while(elapsed < 100000000000L) {
			te.setTime(elapsed);
			elapsed=elapsed*10L;
			te.getTime();
			System.out.println(te.toString());

		}*/
		Random ra = new Random(1000);
		for (int i = 0; i < 5; i++) {
			System.out.println(ra.nextInt(100));
		}
	}

}
