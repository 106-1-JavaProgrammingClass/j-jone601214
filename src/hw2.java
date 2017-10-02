import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        if (v1 >= 60)
            System.out.println("及格");
        if (v1 < 60) {
            System.out.println("不及格");
        }else  {
            if(v1>100 && v1<0){
                System.out.println("錯誤");
            }
        }


    }


}
