
public class arraysort {

    public static boolean isSorted(int nums[]) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 5, 6};

        System.out.println(isSorted(arr));
    }
}
