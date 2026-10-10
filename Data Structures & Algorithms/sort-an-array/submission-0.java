class Solution {
    public int[] sortArray(int[] nums) {
        if (nums.length > 1) {
            mergesort(nums, 0, nums.length - 1);
        }
        return nums;
    }

    private void mergesort(int[] nums, int left, int right){
        if(left>=right){
            return;
        }

        int mid =  left+(right-left)/2;

        mergesort(nums, left, mid);
        mergesort(nums, mid+1, right);

        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid,int right){
        int[] tmp = new int[right-left+1];

        int i=left;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=right){
            if(nums[i] <= nums[j]){
                tmp[k++]=nums[i++];
            }
            else{
                tmp[k++]=nums[j++];
            }
        }

        while(i<=mid){
            tmp[k++]=nums[i++];
        }

        while(j<=right){
            tmp[k++]=nums[j++];
        }

        for(int x=0; x<tmp.length; x++){
            nums[left+x] = tmp[x];
        }
    }

}