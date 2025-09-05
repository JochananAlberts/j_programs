
class LogicalOpTable {
        public static void main(String args[]) {
            boolean p, q;

            System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

            p = true; q = true;
            System.out.println(p + "\t" + q + "\t");
            System.out.println((p&q) + "\t" + (p|q) + "\t");
            System.out.println((p^q) + "\t" + (!q) + "\t");
        }
}
