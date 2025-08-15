import java.util.Scanner;
public class Day4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // Madlibs game
    // Adjective - Describe Something
    // Noun - Person, place or thing
    // Verb - Action words 

    System.out.print("Enter an Adjective (description): ");
    String adjective1 = scan.nextLine();

    System.out.print("Enter an Noun (things or a person): ");
    String noun = scan.nextLine();

    System.out.print("Enter an Adjective (description): ");
    String adjective2 = scan.nextLine();

    System.out.print("Enter a Verb end with -ing (action): ");
    String verb = scan.nextLine();

    System.out.print("Enter a Ajective (description): ");
    String adjective3 = scan.nextLine();

    System.out.println("Today i went to a " + adjective1 + " school.");
    System.out.println("In School, I saw a " + noun + ".");
    System.out.println(noun + "was " + adjective2 + " and " + verb + " !");
    System.out.println("I was " + adjective3 + "!");

    scan.close();
  }
}
