import java.util.Scanner;

public class LocalizzatorePunto {
	
	public static void main(String[] args) {
		
		 punto p1;
		 @SuppressWarnings("resource")
		 Scanner tastiera = new Scanner(System.in);
         p1 = new punto(tastiera.nextInt(), tastiera.nextInt()); 
         System.out.printf("(x = %d Y = %d) Il numero si trova nel quadrante n. %d",p1.getX(),p1.getY(), p1.localizzaQuadrante());
          
          
          
          
//        p1.x = 12;
//        p1.y = -342;                       NO, è privata!
	}

}
