import java.util.Scanner;

public class BMICalculator {
    public static void main ( String[] args ) {
        double m, kg, bmi;

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Your height in m: " );
        m = keyboard.nextDouble();

        System.out.print( "Your weight in kg: " );
        kg = keyboard.nextDouble();

        bmi = kg / (m*m);

        System.out.println( "Your BMI is " + bmi );
    }
}