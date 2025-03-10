import java.util.Scanner;

public class program7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of days
        System.out.print("Enter the number of days: ");
        int totalDays = scanner.nextInt();

        // Convert days to years, weeks, and remaining days
        int years = totalDays / 365;
        int remainingDaysAfterYears = totalDays % 365;
        int weeks = remainingDaysAfterYears / 7;
        int days = remainingDaysAfterYears % 7;

        // Output the result
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + days);
    }
}
