import java.util.*;

public class Homework2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("How many words do you want to sort? ");
        List<String> listOfWords = new ArrayList<>();

        int numberOfWords = in.nextInt();
        in.nextLine();

        for (int n = 0; n < numberOfWords; n++){
            System.out.println("Enter word: ");
            String newWord = in.nextLine().trim();
            listOfWords.add(newWord);

        }
        Collections.sort(listOfWords);


        System.out.println("\nSorted words: ");
        System.out.println(String.join(" ", listOfWords));



        in.close();
    }
}