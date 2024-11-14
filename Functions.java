import java.util.*;

public class Functions{
    public static void main(String Args[]){
    Scanner sc = new Scanner(System.in);
       String name = sc.next();
       String personalised =greeting(name);
       System.out.println(personalised + "I love you verrryyyyy much" );
       
    }
    static String greeting(String name){
        String message = "Hello " + name;
        return message; 
    }
     


    static int sum(){
         Scanner sc = new Scanner(System.in);
        int num1,num2,sum;

        System.out.print("Enter number 1:");
         num1 = sc.nextInt();
        System.out.print("Enter number 2:");
         num2 = sc.nextInt();
         sum = num1 +num2;
        return sum;
        
    }
   
}
    
