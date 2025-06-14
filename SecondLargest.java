
public class SecondLargest {

    public static int SLargest(int[] nums) {
        int max = nums[0];
        int secondMax = Integer.MIN_VALUE;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] < max && nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6};
        System.out.println(SLargest(arr));

        // Write the code for the second smallest numbers //
    }
}
