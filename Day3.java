import java.util.Scanner;
public class Day3{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your Name: ");
    String fuckingName = scanner.nextLine();

    System.out.print("Enter your Age: ");
    int age = scanner.nextInt();

    System.out.print("Enter your GWA: ");
    double gwa = scanner.nextDouble();

    System.out.print("Are you Student of ISPSC? (true/false): ");
    boolean isStudent = scanner.nextBoolean();

    System.out.println("Name: " + fuckingName);
    System.out.println("Age: " + age);
    System.out.println("GWA: " + gwa);

    if (gwa >= 1.70){
      System.out.println("The required GWA to qualify for Latin honors is less than 1.70.");
    }else{
      System.out.println("Latin Honors: Yes");
    }

    if (isStudent){
      System.out.println("Student of ISPSC: Yes");
    }else{
      System.out.println("Not Enrolled in ISPSC");
    }


    // Common Issues
      System.out.print("Enter your Money(₱): ");
    int money = scanner.nextInt();
    // Kapag walang scanner.nextline() yung inenter mo na space \n ang akala niya eto yung ininput mo
    scanner.nextLine();

      System.out.print("Enter your Favorite Color: ");
      String favColor = scanner.nextLine();

      System.out.println("\nMoney: " + money);
      System.out.println("Favorite Color: " + favColor);

    scanner.close();
  }
}