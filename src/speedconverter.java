import java.util.Scanner;
public class speedconverter {

    long rounded;

    int toMilesPerHour(double milesPerHour){

        this.rounded = Math.round(milesPerHour);

        return 1;
    }
    void printConversion(double kilometersPerHour){

    ;
        if(kilometersPerHour <0){

            System.out.println("Invalid Value");

        }else {

            double milesPerHour;
            milesPerHour = kilometersPerHour * 1.609;
            toMilesPerHour(milesPerHour);


            System.out.println(kilometersPerHour + "km/h" + "=" +  rounded+ "mi/h");
        }
    }

    public static void main(String[] args) {

        System.out.print("Enter Km/h = ");
        Scanner scan = new Scanner(System.in);

        double kmh = scan.nextDouble();

        speedconverter speed = new speedconverter();
        speed.printConversion(kmh);

    }

}
