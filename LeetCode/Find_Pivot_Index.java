public class Find_Pivot_Index {

    public static void main(String[] args) {

        System.out.println(findPivotIndex(new int[]{-1, -1, -1, 0, 1, 1}));
        System.out.println(findPivotIndex(new int[]{1, 7, 3, 6, 5, 6}));

    }

    private static int findPivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }


}
