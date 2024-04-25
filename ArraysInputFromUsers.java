package InputJava;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysInputFromUsers {
    public static void main(String[] args) {
    
    
    Scanner sc=new Scanner(System.in);
    int[] names=new int[4];
    System.out.print("Enter 4 Elements: ");
    for (int i = 0; i < 4 ; i++){
        names[i]=sc.nextInt();

    }
    System.out.println(Arrays.toString(names));
}
}