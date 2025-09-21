import java.util.Scanner;
import java.time.Year;
import java.io.File;
import java.io.FileNotFoundException;

public class Game {
	private static Scanner scanner;

	public static void main(String[] args) {
//region Intro to game
		int stateId = 0;
		boolean playing = true;
		System.out.println(
				"	         __                    _          ___       __                 __                 \n"
						+ "		/ /__  ____________  _( )_____   /   | ____/ /   _____  ____  / /___  __________  \n"
						+ "	   __  / / _ \\/ ___/ ___/ / / /// ___/  / /| |/ __  / | / / _ \\/ __ \\/ __/ / / / ___/ _ \\\n"
						+ "	  / /_/ /  __/ /  / /  / /_/ / (__  )  / ___ / /_/ /| |/ /  __/ / / / /_/ /_/ / /  /  __/ \n"
						+ "	  \\____/\\___/_/  /_/   \\__, / /____/  /_/  |_\\__,_/ |___/\\___/_/ /_/\\__/\\__,_/_/   \\___/  \n"
						+ "			      /____/  	\n\nby: dav1nc1\n");

		scanner = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = scanner.nextLine();
		System.out.print("Hi " + name +
				" :)\nWhat's your birth year? ");
		int age = scanner.nextInt();
		System.out.println("You are " + calculateAge(age) + " years old.");
        try {
            Scanner fileScanner = new Scanner(new File("intro.txt"));
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("intro.txt not found.");
        }
		scanner.nextLine();
//endregion
        // gameloop
		while (playing){
			String choice = getInput(scanner);
        	stateId = takeAction(choice, stateId);
			System.out.println(stateId);
		}
	}
	/* 
	Takes input from the player as action and checks if action is allowed. 
	Lets the player try up to 3 times if the action is invalid.
	Returns action, or quits game if more than 3 invalid actions
	*/
	public static String getInput(Scanner in) {
		int attempts = 0;
		while (attempts < 3) {
			System.out.print("What do you want to do? ");
			String choice = in.nextLine().trim();

			switch (choice.toLowerCase()) {
				case "open the door":
				case "go north":
				case "go east":
				case "go south":
				case "go west":
				case "take item":
				case "drop item":
				case "use item":
					return choice;
				default:
				attempts++;
				if (attempts < 3) {
					System.out.println("Invalid choice. Please try again.");
				} else {
					System.out.println("To many invalid attempts. Game over");
					System.exit(0);
				}
			}
		}
		return null;
	}
	// Takes the stateId and the players action and returns new stateId
	public static int takeAction(String action, int currentState){
		int newGameState = currentState;
		switch (currentState) {
			case 0:
				switch (action) {
					case "open the door":
						newGameState = 1;
						break;
					case "take item":
						newGameState = 2;
						break;
					default:
						break;
				}
			case 1:
				switch (action) {
					case "go east":
						newGameState = 3;
						break;
					default:
						break;
				}
			default:
				break;
		}
		return newGameState;
	}
	// Calculates age of player based of birthyear and returns age
	public static int calculateAge(int birthYear) {
		Year currentYear = Year.now();
		int age = currentYear.getValue() - birthYear;
		return age;
	}
}
