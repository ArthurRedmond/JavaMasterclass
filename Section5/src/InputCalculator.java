import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int count = 0;
        double avg = 0;
        System.out.println("INPUT:");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            sum += scanner.nextInt();
            scanner.nextLine();
            count++;
        }
        avg = (double) sum / count;
        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
    }
}
