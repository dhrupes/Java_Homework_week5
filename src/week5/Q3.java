package week5;

public class Q3 {

    /*3. Write a Java program to reverse an array of integer values.*/


    public static void main(String[] args) {
        //Initialize array
        int [] arr ={10, 20, 30, 40, 50};
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }



}
