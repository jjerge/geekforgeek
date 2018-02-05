	
import java.util.*;
	import java.lang.*;
	import java.io.*;
public class rt {






	
	    
	public static void main (String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		String N;
		while(T>0){
			
		    N =scan.next();
		    
		    
		    if(N.length()>1){
		        dup(N);
		    }
		   
		    T--;
		}
		scan.close();
	}


public static void dup(String N){
 
String red="";
int x;
char last=' ';
for( x=0;x<N.length();x++){
char current=N.charAt(x);
if(last==' ') {
	 red +=current;
}
else {
	if(current!=last) {
		red+=current;
	}
            
        }
last=current;
   
    } 



 N=red;
System.out.println(N);
}
}
