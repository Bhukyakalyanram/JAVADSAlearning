
public class Printsubarray {

    public static void subarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static int Maxsumaofsubarray(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int currentsum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentsum = currentsum + arr[i];
            if (currentsum < 0) {
                currentsum = 0;
            }
            maxsum = Math.max(currentsum, maxsum);

        }
        return maxsum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        // subarray(arr);
        System.out.println(Maxsumaofsubarray(arr));
    }
}
