class Solution {
    public void nextPermutation(int[] nums) {
        int l = nums.length, index = -1;
        for (int i = l - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                index = i - 1;
                break;
            }
        }
        if (index == -1)
            reverse(nums, 0, l - 1);
        else {
            for (int i = l - 1; i > index; i--) {
                if (nums[i] > nums[index]) {
                    swap(nums,i,index);
                    reverse(nums, index + 1, l - 1);
                    break;
                }
            }
        }
    }

    void reverse(int nums[], int start, int end) {
        while (start < end) {
            swap(nums,start,end);
            start++;
            end--;
        }
    }
    void swap(int nums[],int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}