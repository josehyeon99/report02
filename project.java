package projectgogo;

import java.util.*;
public class project {

	  public static void main(String[] ar) {
		  int n;
		  int i = 1;
		  
		  System.out.print("구구단을 외우자!:");
		  
		  Scanner scan = new Scanner(System.in);
		  
		  n = scan.nextInt();
		  
		  while (i <= 9){ 
			  System.out.println(n + "*"+ i + "=" +n* i);
			  i++;
		  }
	  }
}