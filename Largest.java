
public class Largest {

    public static int largest(int lar[]) {
        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < lar.length; i++) {
            if (lar[i] > Max) {
                Max = lar[i];
            }
        }
        return Max;
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(largest(arr));
    }
}
