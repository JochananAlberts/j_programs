class LogicalOpTable {
        public static void main(String args[]) {
            boolean p, q;

            System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

            p = true; q = true;
            System.out.print(b2i(p) + "\t" + b2i(q) + "\t");
            System.out.print(b2i(p&q) + "\t" + b2i(p|q) + "\t");
            System.out.println(b2i(p^q) + "\t" + b2i(!q) + "\t");

            p = true; q = false;
            System.out.print(b2i(p) + "\t" + b2i(q) + "\t");
            System.out.print(b2i(p&q) + "\t" + b2i(p|q) + "\t");
            System.out.println(b2i(p^q) + "\t" + b2i(!q) + "\t");

            p = false; q = true;
            System.out.print(b2i(p) + "\t" + b2i(q) + "\t");
            System.out.print(b2i(p&q) + "\t" + b2i(p|q) + "\t");
            System.out.println(b2i(p^q) + "\t" + b2i(!q) + "\t");

            p = false; q = false;
            System.out.print(b2i(p) + "\t" + b2i(q) + "\t");
            System.out.print(b2i(p&q) + "\t" + b2i(p|q) + "\t");
            System.out.println(b2i(p^q) + "\t" + b2i(!q) + "\t");
        }

    static int b2i(boolean b){
        return b ? 1 : 0;
    }
}