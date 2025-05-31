
import java.util.*;

public class inputoutput {

    public static void main(String[] args) {
        System.out.print("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        String s = sc.next();
        System.out.println(s);

        System.out.println("You are " + age + " years old.");

    }
}
