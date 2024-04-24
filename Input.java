package InputJava;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
            System.out.print("Enter ur name: ");
            Scanner sc = new Scanner(System.in) ;
            String name=sc.next();
            System.out.println(name);
            System.out.print("Enter your full name: ");
            String name1=sc.nextLine();
            System.out.println(name1);
        
    }
}
