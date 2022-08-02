package exercise;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 1};
    }
    public boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i=0; i < nums.length;i++){
            if(set.contains(nums[i])){
                return true;

            }
            set.add(nums[i]);
        }
        System.out.println("false");
        return false;
    }


}
