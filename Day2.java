public class Day2 {
  public static void main(String[] args) {

    //* Primitive */
    int age = 18;
    double gwa = 1.75;
    char middleInitial = 'L';
    boolean isOnline = true;
    boolean isHandsome = true;

    //* Reference */ 
    String name = "John Mark Lapenid";
    String email = "Lapenidjohnmark7@gmail.com";

    System.out.println("Name: " + name);
    System.out.println("Middle Initial: " + middleInitial);
    System.out.println("Age: " + age);
    System.out.println("General Weighted Mean: " + gwa);
    System.out.println("Is Online? " + isOnline);
    System.out.println("Email: " + email);

    if(isHandsome == true){
      System.out.println("John Mark Lapenid is Handsome");
    }
    else{
      System.out.println("Sigbin");
    }
  }
}
