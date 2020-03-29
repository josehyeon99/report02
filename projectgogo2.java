package firstproject;


import java.io.*;
public class projectgogo2 {

	  public static void main(String[] ar)throws IOException{
		  
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("연도를 입력해주소서: ");
        int year=0;

        year=Integer.parseInt(in.readLine());

        if(year%100==0&&year%400==0){
              System.out.println(year+"년은 윤년");
        }

        else if(year%4==0&&year%100!=0){
              System.out.println(year+"년은 윤년");
        }

        else
              System.out.println(year+"연은 윤년아닙니다");
  }
}