package InputJava;

import java.util.Scanner;

public class IntresMarks {
    public static void main(String[] args) {
        int ch;
        Scanner sc=new Scanner(System.in);
        do{
        
        System.out.print("Enter student's Marks: ");
        int marks=sc.nextInt();
        if (marks>=90){
            System.out.println("This is Good");
        }
        else if (89>=marks && marks>=60){
            System.out.println("This is also Good");
        }
        else if (59>=marks&& marks>=0){
            System.out.println("This is Good as well");
        }else{
            System.out.println("Invalid");
        }
        System.out.print("\"Enter 0 to stop and 1 to give input:\"");
        
        
        ch=sc.nextInt();
        }while (ch==1);
        }
    }
    
