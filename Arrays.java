import java.util.*;

public class Arrays {
   public static void printArray(int arr[]) {
      for (int i = 0; i < arr.length; i++) {
         System.out.print(arr[i] + " ");
      }
      System.out.println();
   }

   public static void main(String Args[]) {

      // int[] marks = { 100, 84, 98, 76, 67 };
      // System.out.println(marks.length);
      // for (int i = 0; i < marks.length; i++) {
      // System.out.println(marks[i]);
      // }
      // for(int element : marks){
      // System.out.println(element);
      // }
      // for (int i = marks.length-1; i >= 0 ; i--) {
      // System.out.println(marks[i]);
      // }
      // how to print 2d arrays
      // int [][] flats;
      // flats=new int[2][3];
      // flats[0][0]=101;
      // flats[0][1]=102;
      // flats[0][2]=103;
      // flats[1][0]=201;
      // flats[1][1]=202;
      // flats[1][2]=203;

      // for(int i =0; i< flats.length;i++){
      // for(int j= 0; j< flats[i].length; j++){
      // System.out.print(flats[i][j]+ " ");
      // }System.out.println("");
      // }
      // question 1
      // print the sum of an given array
      // float[] number = { 89.6f, 45.7f, 56.7f, 89.5f, 100.0f };
      // float sum = 0;
      // for (float element : number) {
      // sum = sum + element;
      // }
      // System.out.println("The value of avarage is: " + sum );

      // Question 2
      // find if the number is in the array or not
      // float []number = {89.6f,45.7f,56.7f,89.5f,100.0f};
      // float num = 89.66f;
      // boolean inArray = false;
      // for(float element: number){
      // if (element==num) {
      // inArray= true;
      // break;
      // }
      // }
      // if (inArray) {
      // System.out.println("The number is present in the array");
      // }
      // else{
      // System.out.println("The number is not present in the array");
      // }

      // Question3
      // print the avarage of an array

      // float[] number = { 89.6f, 45.7f, 56.7f, 89.5f, 100.0f };
      // float sum = 0;
      // for (float element : number) {
      // sum = sum + element;
      // }
      // System.out.println("The value of avarage is: " + sum / number.length);

      // Question4
      // create a java program to add two matrices size 2*3

      // int[][] mat1 = { { 1, 2, 6 },
      // { 5, 7, 3 } };
      // int[][] mat2 = { { 2, 4, 3 },
      // { 7, 5, 1 } };

      // int[][] result = new int[2][3];
      // for (int i = 0; i < mat1.length; i++) {
      // for (int j = 0; j < mat1[i].length; j++) {
      // result[i][j] = mat1[i][j] + mat2[i][j];
      // System.out.print(result[i][j] + " ");
      // }
      // System.out.println();

      // }

      // Question5
      // print reverse of an array

      // int [] arr = {1,2,3,4,5,6};
      // int l= arr.length;
      // int n = Math.floorDiv(l, 2);
      // //swap
      // // arr[i] swap arr[l-i-1]
      // int temp;

      // for(int i=0;i<n;i++){
      // temp =arr[i];
      // arr[i]=arr [l-i-1];
      // arr [l-i-1] =temp;

      // }
      // for(int element:arr){
      // System.out.print(element + " ");

      // }

      // Question6
      // print the max value of an arrey
      // int [] arr = {1,2,35,4,500,6};
      // int max = Integer.MIN_VALUE;
      // for(int e : arr){
      // if(max < e){
      // max = e;
      // }
      // }
      // System.out.println("The max number of the arrey is : " + max);

      // Question7
      // print the min value of an arrey

      // int [] arr = {1,2,35,4,500,6,-200};
      // int min = Integer.MAX_VALUE;
      // for(int e : arr){
      // if(min > e){
      // min = e;
      // }
      // }
      // System.out.println("The minimum number of the arrey is : " + min);

      // Question8
      // print if the array is sorted or not

      // bollean isSorted = true;
      // int[] arr = { 1, 2, 35, 4, 500, 67, 200 };

      // for (int i = 0; i < arr.length - 1; i++) {
      // if (arr[i] > arr[i + 1]) {
      // isSorted = false;
      // break;
      // }
      // }
      // if (isSorted) {
      // System.out.println("The array is sorted");

      // } else {
      // System.out.println("The array not is sorted");
      // }

      // int arr[] = {8,7,1,9,5};
      // for(int i= 0; i< arr.length-1; i++){
      // for(int j = 0; j< arr.length-i-1; j++){
      // if ( arr[j] > arr[j+1]) {
      // //swap
      // int temp = arr[j];
      // arr[j] = arr[j+1];
      // arr[j+1]= temp;

      // }
      // }
      // }
      // printArray(arr);

      int arr[] = { 7, 8, 3, 1, 2 };

      for (int i = 0; i < arr.length-1; i++) {
         int small = i;
         for (int j = i + 1; j < arr.length; j++){
            if (arr[j] < small) {
               small = arr[j];
            }
         }
         int temp = arr[small];
         arr[small]= arr[i];
         arr[i]= arr[small];

      }
      printArray(arr);

   }
}