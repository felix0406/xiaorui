public class BinarySearch {
    public static int search(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length; // 右开区间，right索引从数组外开始
        while(left < right) { // right无意义，所以符号为 <
            int middle = (left + right) / 2 ;
            if (nums[middle] > target) {
                right = middle;  // 时刻记得right为开区间索引值，是不能被取到的
            } else if(nums[middle] < target) {
                left = middle + 1 ;
            } else {
                return middle;
            }
        }
        return -1;
    }

}
