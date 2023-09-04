import java.util.Scanner;

public class WinningBikers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[5];
        double[] speeds = new double[5];
        double sum = 0;

        // Input names and speeds of each racer
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name of racer " + (i + 1) + ": ");
            names[i] = scanner.nextLine(); //input name
            
            System.out.print("Enter speed of racer " + (i + 1) + ": ");
            speeds[i] = scanner.nextDouble();  // input speed
            // consumes only numeric value ignoring newline character
            sum += speeds[i]; // calculate total speed
            // consume buffer
            scanner.nextLine();
        }

        double averageSpeed = sum / 5;

        System.out.println("Average speed of all racers: " + averageSpeed);
        System.out.println("Qualifying racers:");

        // Check and print speeds of qualifying racers along with their names
        for (int i = 0; i < 5; i++) {
            if (speeds[i] > averageSpeed) {
                System.out.println(names[i] + " - " + speeds[i]);
            }
        }
    }
}
