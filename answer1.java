package assignmentday2;
import java.util.*;
public class answer1 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter r1: ");
        double r1 = scanner.nextDouble();
        System.out.print("Enter th1: ");
        double th1 = scanner.nextDouble();

        System.out.print("Enter r2: ");
        double r2 = scanner.nextDouble();
        System.out.print("Enter th2: ");
        double th2 = scanner.nextDouble();

        scanner.close();

        
        double x1 = r1 * Math.cos(Math.toRadians(th1));
        double y1 = r1 * Math.sin(Math.toRadians(th1));

        double x2 = r2 * Math.cos(Math.toRadians(th2));
        double y2 = r2 * Math.sin(Math.toRadians(th2));

       
        double x3 = x1 + x2;
        double y3 = y1 + y2;

        
        double r3 = Math.sqrt(Math.pow(x3, 2) + Math.pow(y3, 2));
        double th3 = Math.toDegrees(Math.atan2(y3, x3));

        System.out.printf("\nr3 = %.2f\nth3 = %.2f", r3, th3);
    }
	
}
