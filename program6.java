import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a decimal number: ");
        int num = scanner.nextInt();
        
        System.out.println("Binary representation: " + Integer.toBinaryString(num));
        System.out.println("Octal representaion: " + Integer.toOctalString(num));

        scanner.close();
    }
}
