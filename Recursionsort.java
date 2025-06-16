
public class Recursionsort {

    public static boolean isSorted(int[] arr, int n) {
        if (n == arr.length - 1) {
            return true;
        }
        return (arr[n] < arr[n + 1]) && isSorted(arr, n + 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 5};
        System.out.println(isSorted(arr, 0));
    }
}
