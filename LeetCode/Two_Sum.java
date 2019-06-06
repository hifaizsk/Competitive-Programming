import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    public static void main(String[] args) {
        System.out.print(Arrays.toString(twoSum(new int[]{-1, -2, -3, -4, -5}, -8)));

    }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{(map.get(target - nums[i])), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}
