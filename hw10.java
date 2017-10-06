import java.util.Scanner;

public class hw10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        char b = scn.next().charAt(0);
        char c = scn.next().charAt(0);
        System.out.println(a.replace(b ,c));

    }
}

