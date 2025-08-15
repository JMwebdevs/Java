import java.util.Random;
import java.util.Scanner;
public class randomNum{
  public static void main(String[] args){
    Random random= new Random();
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a random number: ");
    int randomNumber = scanner.nextInt();
    int Results = random.nextInt(randomNumber) ;

    System.out.println("Random Number: " + Results);

    scanner.close();
  }
}