import java.util.Scanner;

public class 攝氏轉華氏溫度 {
    public  static void  main(String[]args){
        Scanner scn=new Scanner(System.in);
        int c=scn.nextInt();
        System.out.println(Math.round(c*9/5F+32));
    }
}
