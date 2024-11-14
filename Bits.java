import java.util.*;

public class Bits{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int bitmask = 1<<(number-1);
        int newbit = ~(bitmask);
        int newnumber = newbit & number;
        if(newnumber == 0){
            System.out.println("It is power of 2");
        }else{System.out.println("It is not power of 2");}
    }
}