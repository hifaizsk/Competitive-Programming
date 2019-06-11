public class Search_Insert_Position {

    public static void main(String[] args) {
        int[] intArray = {1, 3, 5, 6};

        System.out.println(searchInsert(intArray, 2));
    }

    private static int searchInsert(int[] nums, int target) {

        int currentElement = 0;
        while (nums[currentElement] < target) {
            currentElement++;
            if (currentElement == nums.length) {
                break;
            }
        }
        return currentElement;
    }

}
