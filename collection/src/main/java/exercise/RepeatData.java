package exercise;


import java.util.HashMap;
import java.util.HashSet;


public class RepeatData {

        public static void main(String[] args) {
            int nums[] = {1,2,3,4};
            System.out.println(new RepeatData().containsDuplicate1(nums));
        }
        public boolean containsDuplicate(int[] nums) {
            //这个用map啊

            HashMap<Integer, Integer> values= new HashMap<Integer, Integer>();
            for(int i = 0;i<nums.length;i++){
                if(values.containsKey(nums[i])){
                    return true;
                }else{
                    values.put(nums[i], 1);
                }
            }
            return false;
        }

        public boolean containsDuplicate1(int[] nums) {


            HashSet<Integer> set = new HashSet<Integer>();
            for(int i =0;i<nums.length;i++){
                if(set.contains(nums[i])){
                    return true;
                }else{
                    set.add(nums[i]);
                }

            }

            return false;
        }


    }
