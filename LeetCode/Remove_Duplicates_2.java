import java.util.Arrays;

public class Remove_Duplicates_2 {

    public static void main(String[] args) {
        int[] intArray = {1, 2, 2, 2, 2, 3};

        int len = removeDuplicates(intArray);

        System.out.println(len);
        System.out.println(Arrays.toString(intArray));
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }

        int index = 0;

        for (int currentElement = 0; currentElement < nums.length - 2; currentElement++) {
            if (nums[currentElement] != nums[currentElement + 2]) {
                nums[index] = nums[currentElement];
                index++;
            }
        }

        nums[index++] = nums[nums.length - 2];
        nums[index++] = nums[nums.length - 1];

        return index;
    }

}
