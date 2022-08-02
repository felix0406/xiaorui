public class SortInArray {

        public int[] sortArray(int[] nums) {
            int len = nums.length;
            for (int i = 1; i < len; i++) {
                // 先暂存这个元素，然后之前元素逐个后移，留出空位
                if (nums[i]<nums[i-1]) {
                    int temp = nums[i];
                    int j = i - 1;
                    while (j >= 0 && nums[j] > temp) {
                        nums[j + 1] = nums[j];
                        j--;
                    }
                    nums[j + 1] = temp;
                }
            }
            return nums;
        }



}
