import java.util.Arrays;

public class Remove_Duplicates {

    public static void main(String[] args) {
        int[] intArray = {1, 1, 2};

        int len = removeDuplicates(intArray);

        System.out.println(len);
        System.out.println(Arrays.toString(intArray));
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int index = 0;

        for (int currentElement = 1; currentElement < nums.length; currentElement++) {
            if (nums[index] != nums[currentElement]) {
                index++;
                nums[index] = nums[currentElement];
            }
        }
        return index + 1;
    }

}
