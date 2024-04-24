package InputJava;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        while (true){
        System.out.print("num1: ");
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();

        System.out.print("num2: ");
        //Scanner sc1=new Scanner(System.in);
        int num2=sc.nextInt();

        System.out.print("Enter your choice(+,-,*,/,%): ");
        String ch=sc.next();
        int i=0;
        switch(ch){
            case "+": System.out.println("Result: "+(num1+num2));
             break;
            case "-": System.out.println("Result: "+(num1-num2));
             break;
            case "*":System.out.println("Result: "+(num1*num2));
             break;
            case "/":System.out.println("Result: "+((float)num1/num2));
             break;
            case "%": System.out.println("Result: "+(num1%num2));
             break;
            default:
            System.out.println("Invalid operation");
            i=1;
        }
        if (i==1){
            break;
        }
    }}
}
