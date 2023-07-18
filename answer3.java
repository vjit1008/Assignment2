package assignmentday2;

public class answer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   
			  double x = 2.5;   
			        int numT = 10;    
			 
			        double result = 1.0;  
			        double term = 1.0;  
			        for (int n = 1; n <= numT; n++) { 
			            term *= x / n;  
			            result += term;   
			        } 
			 
		
			        System.out.println( result); 
			      
			 
			 } 
	}


