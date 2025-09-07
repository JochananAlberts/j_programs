class Prime_100{

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            if (is_prime(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean is_prime(int n) {

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}