public class Largest_Num_Atleast_Twice {

    public static void main(String[] args) {

        System.out.println(dominantIndex(new int[]{1, 2, 3, 4}));
        System.out.println(dominantIndex(new int[]{0, 0, 0, 1}));
        System.out.println(dominantIndex(new int[]{3, 6, 1, 0}));

    }

    private static int dominantIndex(int[] nums) {
        int largestIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[largestIndex] < nums[i]) {
                largestIndex = i;
            }
        }

        for (int num : nums) {
            if (2 * num > nums[largestIndex] && num != nums[largestIndex]) {
                return -1;
            }
        }

        return largestIndex;
    }


}
