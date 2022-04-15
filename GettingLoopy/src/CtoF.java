import java.util.Scanner;
public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double tempC = 0;
        double tempF = 0;
        boolean good = true;
        String trash = "";

        do {
            System.out.println("Please enter in a temperature in Celsius: ");
            if (in.hasNextDouble()) {
                tempC = in.nextDouble();
                in.nextLine();
                good = true;
            } else {
                good = false;
                trash = in.nextLine();
                System.out.println("error, please enter in a valid temperature");
            }
        } while (good == false);

        tempF = ((tempC * 9) / 5) + 32;
        System.out.println("Your temperature in Celsius was: " + tempC + ". Your temperature in fahrenheit is " +
                ": " + tempF + ".");
        if (tempF <= 32) {
            System.out.println(tempF + " degrees fahrenheit is freezing!");
        } else if (tempF >= 212) {
            System.out.println(tempF + " degrees fahrenheit is boiling!");
        }

    }
}