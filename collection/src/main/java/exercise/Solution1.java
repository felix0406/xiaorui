package exercise;

public class Solution1 {
    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int[] ints = twoSum(nums,6);
        System.out.println(ints[0]);
        System.out.println(ints[1]);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = -1;
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == a && j != i) {
                    arr[0] = j;
                    break;
                }
            }
            if (arr[0] != -1) {
                arr[1] = i;
                break;
            }
        }
        return arr;
    }

}
