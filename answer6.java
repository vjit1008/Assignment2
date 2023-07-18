package assignmentday2;

import java.util.Scanner;

public class answer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
	       System.out.print("input lower");
	       int l=sc.nextInt();
	       System.out.print("input upper");
	       int u=sc.nextInt();
	       
	       int fib=0;
			  int next=1;
			  int th;
			  for (int i=5;i<40; i++) {
				  
				  if(fib>=l && fib<u)
				  System.out.print(fib+" ");
				   th=fib+next;
			       fib=next;
			       next=th;
			    	   
				  }
	    	   
	    	   
	}

}
