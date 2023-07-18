package assignmentday2;

import java.util.Scanner;

public class answer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an angle:");
        double x = sc.nextDouble();
        x = Math.toRadians(x);
        double sum = 1; 

        double num = x;
        double fact = 1;
        for (int i = 2; i <= 10; i += 2) {
            num = -num * x * x; 
            fact *= (i - 1) * i; 
            sum += num / fact;
        }

        System.out.println("Approx: " + sum);
    }
}
