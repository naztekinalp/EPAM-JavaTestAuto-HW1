package HW2;

public class TwoSum {

    public static void main(String[] args) {
        twoSum(new int[]{2, 7, 11, 15},9);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
