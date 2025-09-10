import java.util.Scanner;
import java.time.Year;
import java.io.File;
import java.io.FileNotFoundException;

public class Game {
	private static Scanner scanner;

	public static void main(String[] args) {

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

        // Intro to the game
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
        String firstChoice = scanner.nextLine();
        System.out.println(firstChoice);
	}

	// Calculates age of player based of birthyear
	public static int calculateAge(int birthYear) {
		Year currentYear = Year.now();
		int age = currentYear.getValue() - birthYear;
		return age;
	}
}
