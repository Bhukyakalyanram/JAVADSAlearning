
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

    public static void sum(int n, int sum) {
        if (n == 0) {
            System.out.println(sum);
            return;
        }
        sum(n - 1, sum + n);
    }

    public static int sum2(int n, int sum) {
        if (n == 0) {
            return 0;
        }
        sum = sum + n;
        return n + sum2(n - 1, sum);
    }

    public static int fact(int n, int fact) {
        if (n == 1) {
            return 1;
        }
        fact = n * fact(n - 1, fact);
        return fact;
    }

    public static void main(String[] args) {
        // PrintName(5, 1);
        // ascending(5, 1);
        // desccending(5);
        // System.out.println(sum2(5, 0));
        System.out.println(fact(5, 0));
    }
}
