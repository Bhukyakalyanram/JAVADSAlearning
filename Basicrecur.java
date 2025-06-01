
public class Basicrecur {

    public static void PrintName(int n, int i) {
        if (i > n) {
            return;
        }
        System.out.println("Kalyan");
        PrintName(n, i + 1);
    }

    public static void main(String[] args) {
        PrintName(5, 1);
    }
}
