package InputJava;

import java.util.Scanner;

public class allEven {
    public static void main(String[] args) {
        System.out.println("Enter the limit n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Even number till "+n+" are: ");
        for(int i=0;i<n;i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        

    }
    
}
