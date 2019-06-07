import java.util.Arrays;

public class Two_Sum_Input_Array_Is_Sorted {

    public static void main(String[] args) {
        System.out.print(Arrays.toString(twoSum(new int[]{2, 3, 4}, 6)));

    }

    private static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return new int[]{++left, ++right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
