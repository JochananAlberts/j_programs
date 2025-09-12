import java.util.*;

public class Reading {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner stdin = new Scanner(System.in);
        System.out.print("Enter integer value for a: ");
        int a;
        a = stdin.nextInt();
        char b = (char) a;
        System.out.println("You gave me: " + b);
    }
}