package firstproject;


import java.io.*;
public class projectgogo2 {

	  public static void main(String[] ar)throws IOException{
		  
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("������ �Է����ּҼ�: ");
        int year=0;

        year=Integer.parseInt(in.readLine());

        if(year%100==0&&year%400==0){
              System.out.println(year+"���� ����");
        }

        else if(year%4==0&&year%100!=0){
              System.out.println(year+"���� ����");
        }

        else
              System.out.println(year+"���� ����ƴմϴ�");
  }
}