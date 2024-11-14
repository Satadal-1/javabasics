import java.util.Scanner;

public class Loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n == 1) {
            int Marks = sc.nextInt();
            
            if (Marks >= 90) {
                System.out.println("This is Good");
            } else if (Marks >= 60 && Marks <= 89) {
                System.out.println("This is also Good");
            } else if (Marks >= 0 && Marks < 60) {
                System.out.println("This is Good as well because marks don’t matter but our effort does");
            }
        }
        
        sc.close();
    }
}
