import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt(); // Number of rows in the pattern

        System.out.print("Enter the number of columns: ");
        int col = sc.nextInt(); // Number of columns in the pattern

        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Loop to print asterisks in each row
            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after printing a row
        }
        
        sc.close(); // Close the scanner
    }
}
