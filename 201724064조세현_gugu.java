package projectgogo;

import java.util.*;
public class project {

	  public static void main(String[] ar) {
		  int n;
		  int i = 1;
		  
		  System.out.print("±¸±¸´ÜÀ» ¿Ü¿ìÀÚ!:");
		  
		  Scanner scan = new Scanner(System.in);
		  
		  n = scan.nextInt();
		  
		  while (i <= 9){ 
			  System.out.println(n + "*"+ i + "=" +n* i);
			  i++;
		  }
	  }
}
