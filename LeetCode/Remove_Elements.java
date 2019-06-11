import java.util.Arrays;

public class Remove_Elements {

    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 2, 3, 0, 4, 2};

        int len = removeElement(intArray, 2);

        System.out.println(len);

        System.out.println(Arrays.toString(intArray));
    }

    private static int removeElement(int[] nums, int val) {
        int seek = 0;
        int lastIndexToRemoveElement = nums.length;
        while (seek < lastIndexToRemoveElement) {
            if (nums[seek] == val) {
                nums[seek] = nums[lastIndexToRemoveElement - 1];
                lastIndexToRemoveElement--;
            } else {
                seek++;
            }
        }
        return lastIndexToRemoveElement;
    }

}
