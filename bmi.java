import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your Weight in Kg");
        double weight = s1.nextDouble();
        System.out.println("Input Height in meters");
        double height = s1.nextDouble();
        double a = weight / (height * height);
        System.out.println("The Bmi is :" + a + "kg/m2");
    }
}
