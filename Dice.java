import java.util.*;

public class Dice {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many sides do you want on your dice? ");
        int sides = in.nextInt();
        in.nextLine();
        if (sides == 0) {
            System.out.println("That's not possible");
        } else {
            int diceRoll = (int) (Math.random() * sides) + 1;
            System.out.println("Rolling...");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("You threw a " + diceRoll + "!");
        }
        

        in.close();
    }
}
