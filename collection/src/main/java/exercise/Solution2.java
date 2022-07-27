package exercise;

import java.util.Arrays;

public class Solution2 {
    public boolean containsDuplicate(int[] num){
        Arrays.sort(num);
        for (int i=1;i <= num.length;i++){
            if (num[i] == num[i - 1]){
                return true;
            }
        }
        return false;

    }
}
