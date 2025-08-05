import java.util.Scanner;
public class Day3_Calculate_areaof_rectang {
    public static void main(String[] args){

//        Calculate the Area of Rectangle
        Scanner scanner = new Scanner(System.in);

//        Variables
        double width = 0;
        double height = 0;
        double area = 0;

//        Ask User to Input
        System.out.print("Enter the width of a Rectangle: ");
        width =  scanner.nextDouble();

        System.out.print("Enter the height of a Rectangle: ");
        height =  scanner.nextDouble();

//        Calculation height * width
        area = width * height;

//        Print the Results
        System.out.print("The Are of a Rectangle is " + area + "cm²");
        
//        return 0;
        scanner.close();
    }
}
