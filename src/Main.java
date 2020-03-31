import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Please enter preferred month: ");
            Scanner scanner = new Scanner(System.in);
            String monthToPrintString = scanner.nextLine().toUpperCase();
            try {
                Month inputMonth = Month.valueOf(monthToPrintString);
                Calendar.printCalendar(inputMonth);
                System.out.println();
            } catch (IllegalArgumentException e) {
                System.out.println("Wrong input!");
            }
        }
    }
}
