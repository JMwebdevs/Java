import java.util.Scanner;
public class Day5{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Arithmetic Operators & Augmented 
    System.out.print("Enter the value of X: ");
    int x = scanner.nextInt();
    System.out.print("Enter the value of y: ");
    int y = scanner.nextInt();
    x += y;
    x /= y;
    x %= y;
    x -= y;
    x *= y;
    System.out.println(x);

    // Increment and Decrement
    int age = 18;
    age++;
    age++;
    age--;
    System.out.println(age);

    // Order of Operations (PEMDAS)
    double result = 3 + 4 * (7 - 5) / 2.0;
    System.out.println(result);
    scanner.close();
  }
}