import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        char b = sc.next().charAt(0);
        System.out.println(a.replace(b ,'\n'));

    }

}

