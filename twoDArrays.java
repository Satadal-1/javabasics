import java.util.*;
public class twoDArrays{
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
      int r = sc.nextInt();
      int c = sc.nextInt();
      int [][] numbers = new int [r][c];
      //intput,//rows
      for(int i = 0; i < r; i++ ){
        //cols
        for(int j = 0; j < c; j++){
            numbers [i][j] = sc.nextInt();
        }
      }
      int x = sc.nextInt();
      //output
      for(int i = 0 ; i< r; i++){
        for(int j = 0; j < c; j++){
            if (numbers[i][j] == x){
                System.out.println("the number is found at index(" + i + "," + j + ")" );
            }
        }System.out.println();
      }
    }
}