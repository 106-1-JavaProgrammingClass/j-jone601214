import java.util.Scanner;

public class 大寫幻小寫 {
    public static  void  main(String[]args){
        Scanner scn=new Scanner(System.in);
        int c=scn.nextInt();
        System.out.println(Math.round(c*9/5f+32));
        String str ="ASIA,FCU,NCHU";
        char ch =',';
        System.out.println(str.replace(',','\n'));
    }
}
