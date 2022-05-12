import java.time.LocalDateTime;
import java.util.*;

public class ObjetosPrueba {

	public static void main(String[] args) {
		StopWatch st = new StopWatch();
		st.start();
		System.out.println("EXERCISE 9.1");
		Rectangle Rectangle1  = new Rectangle();
		System.out.println(Rectangle1.getArea()+"" + "" +Rectangle1.getPerimeter());
		Rectangle Rectangle2 = new Rectangle(5 , 6); 
		System.out.println(Rectangle2.getArea()+"" + "" +Rectangle1.getPerimeter());
		
		System.out.println("EXERCISE 9.3");
		Date te = new Date();
		long elapsed=10000;
		while(elapsed < 100000000000L) {
			te.setTime(elapsed);
			elapsed=elapsed*10L;
			te.getTime();
			System.out.println(te.toString());

		}
		System.out.println("EXERCISE 9.4");
		Random ra = new Random(1000);
		for (int i = 0; i < 5; i++) {
			System.out.println(ra.nextInt(100));
		}
		System.out.println("EXERCISE 9.5");
		GregorianCalendar gc = new GregorianCalendar();
		gc.get(GregorianCalendar.YEAR);
		gc.get(GregorianCalendar.MONTH);
		gc.get(GregorianCalendar.DAY_OF_MONTH);
		
		System.out.println("Año: " + gc.get(GregorianCalendar.YEAR)+" Mes: "+gc.get(GregorianCalendar.MONTH)+
							" Dia: " + gc.get(GregorianCalendar.DAY_OF_MONTH));
		 
		gc.setTimeInMillis(1234567898765L);
		System.out.println(gc.getTime());
		
		
		LocalDateTime locaDate = LocalDateTime.now();
		int hours  = locaDate.getHour();
		int minutes = locaDate.getMinute();
		int seconds = locaDate.getSecond();
		System.out.println("Hora actual : " + hours  + ":"+ minutes +":"+seconds); 
		
		st.stop();
		st.getElapsedTime();
		
	}

}
