import java.util.*;
public class ConditionalStatement
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    if (a>0){
	        System.out.println("positive");
	    }
	    else if(a<0){
	        	System.out.println("Negative");
	    }
	    else{
	        System.out.println("zero");
	    }
	    switch(a){
	        case 1:{
	            	System.out.println("sunday");
	            	break;
	        }
	        case 2:{
	            	System.out.println("Monday");
	            	break;
	        }
	        case 3:{
	            	System.out.println("Tuesday");
	            	break;
	        }
	        case 4:{
	            	System.out.println("Wednesday");
	            	break;
	        }
	         case 5:{
	            	System.out.println("Thursday");
	            	break;
	        }
	        case 6:{
	            	System.out.println("Friday");
	            	break;
	        }
	         case 7:{
	            	System.out.println("Saturday");
	            	break;
	        }
	        default:{
	             
	            	System.out.println("Invalid number");
	            	
	        }
	        
	        
	    }
	    for(int i=1;i<=a;i++){
	        System.out.print(i+" ");
	    }
	    System.out.println();
	    while(a!=0){
	        System.out.print(a+" ");
	        a--;
	    }
	    System.out.println();
	    int n=1;
	    do{
	        System.out.print(n+" ");
	        n++;
	    }
	    while(n<=3);
	    
	    
	
	}
}