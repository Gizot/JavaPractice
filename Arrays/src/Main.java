import java.util.ArrayList;

public class Main {

    /*
    static void printArray(int[] arr) {
        for(int i = 0; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    */


   /* static void printArray(double[] arr) {
        for(int i = 0; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }
    } */

    //bir array in ters değerlerini veren metot
    static int[] reverse(int[] list) {
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i<list.length; i++,j--) {
            reverse[i] = list[j];
        }
        return reverse;
    }
    static void printArray(int[] list) {
        for (int i =0 ; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
    public static void main(String[] args) {


       int[] numberList = {10,20,30,40,50,60,70,80,90,100};
       int [] newListe = reverse(numberList);
       printArray(newListe);

      // double[] doubleList = {1.1,2.2,3.3,4.4,5.5};
     //  printArray(doubleList);


     //  printArray(numberList);
        // int[] numberList = new int[10];
       /* numberList[0] = 10;
        numberList[1]= 20;
        numberList[2] = 30;
        numberList[3] = 40;
        numberList[4] = 50;
        numberList[5] = 60;
        numberList[6] = 70;
        numberList[7] = 80;
        numberList[8] = 90;
        numberList[9] = 100;

        */

        //for ile numberlist in alabileceği elemanları otomatik yazdırabiliriz.



       // System.out.println(numberList[0]);
     //   for(int i = 0; i< numberList.length; i++){
          //  System.out.println(numberList[i]);
        }
    }
