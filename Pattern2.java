import java.util.*;
public class Pattern2 {
    public static void main (String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number:");
        float a= sc.nextFloat();
        System.out.println("Enter Second Number:");
        float b= sc.nextFloat();
        float sum = (a +b);
        System.out.println("The Sum is =" + sum);
     int n = 4;
        for(int i = 1 ; i <= n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            int space = (n-i)*2;
             for (int j = 1; j <= space; j++){
                System.out.print(" ");
             }
             for(int j = 1 ;j<= i;j++){
                System.out.print("*");
             }System.out.println();
        }
        for(int i = n ; i >= 1; i--){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            
             for (int j = 1; j<=(n-i)*2; j++){
                System.out.print(" ");
             }
             for(int j = 1 ;j<= i;j++){
                System.out.print("*");
            } System.out.println();
        } 
    }  
}