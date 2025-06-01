
public class Recursion {

    static int count = 0;

    public static void Print(int n) {
        if (count == n) {
            return;
        }
        System.out.println(count);
        count++;
        Print(n);
    }

    public static void main(String[] args) {

        Print(3);

    }
}
