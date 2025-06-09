
public class hashing {

    public static int count(int arr[], int num) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int[] hash = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }
        return hash[num];
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 4, 5, 6};

        System.out.println(count(arr, 2));
    }
}
