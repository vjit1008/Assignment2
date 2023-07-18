package assignmentday2;



public class answer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  
		  int fib=0;
		  int next=1;
		  int th;
		  for (int i=1;i<=30; i++) {
			   th=fib+next;
		       fib=next;
		       next=th;
		       if(th%2==0) 
		    	   
			  System.out.println(th);
			  }
	}
	}


