
import java.util.Scanner;

public class ifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Marks = sc.nextInt();
        if (Marks >= 90) {
            System.out.println("Grade A");
        } else if (Marks >= 70) {
            System.out.println("Grade B");
        } else if (Marks >= 50) {
            System.out.println("Grade C");
        } else if (Marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }
    }
}
