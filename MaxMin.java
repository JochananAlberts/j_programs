import java.util.Scanner;

public class MaxMin {
    public static int maxOf3(int r, int s, int t) {
        return Math.max(r, Math.max(s,t));
    }

    public static int minOf3(int r, int s, int t) {
        return Math.min(r, Math.min(s,t));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int max = maxOf3(n1, n2, n3);
        int min = minOf3(n1, n2, n3);

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        in.close();
    }
}
