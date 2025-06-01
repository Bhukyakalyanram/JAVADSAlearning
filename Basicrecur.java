
public class Basicrecur {

    public static void PrintName(int n, int i) {
        if (i > n) {
            return;
        }
        System.out.println("Kalyan");
        PrintName(n, i + 1);
    }

    public static void ascending(int n, int i) {
        if (i > n) {
            return;
        }
        System.out.println(i);
        ascending(n, i + 1);
    }

    public static void desccending(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        desccending(n - 1);

    }

    public static void main(String[] args) {
        // PrintName(5, 1);
        // ascending(5, 1);
        desccending(5);
    }
}
