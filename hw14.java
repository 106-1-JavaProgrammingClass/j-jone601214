import java.util.Scanner;

public class hw14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char a = scn.next().charAt(0);
        int b = (int) a;
        System.out.println(Integer.toHexString(b));
    }
}

