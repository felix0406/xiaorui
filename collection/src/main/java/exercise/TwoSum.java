package exercise;

//public class Solution1 {
//    public static void main(String[] args) {
//        int[] nums = new int[]{3,3};
//        int[] ints = twoSum(nums,6);
//        System.out.println(ints[0]);
//        System.out.println(ints[1]);
//    }
//    public static int[] twoSum(int[] nums, int target) {
//        int[] arr = new int[2];
//        arr[0] = -1;
//        for (int i = 0; i < nums.length; i++) {
//            int a = target - nums[i];
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[j] == a && j != i) {
//                    arr[0] = j;
//                    break;
//                }
//            }
//            if (arr[0] != -1) {
//                arr[1] = i;
//                break;
//            }
//        }
//        return arr;
//    }
//
//}
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
        int[] result2 = twoSum2(nums, target);
        System.out.println(result2[0] + " " + result2[1]);
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    private static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        return new int[]{};
    }
    @Override
    public void solution (){
        System.out.println("TwoSum.solution()");
    }

}