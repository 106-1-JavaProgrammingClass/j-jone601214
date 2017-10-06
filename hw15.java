import java.util.Scanner;

public class hw15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        int i = Integer.parseInt(a ,16);
        char b = (char)i;
        System.out.println(b);

    }
}

