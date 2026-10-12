class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] z = new int[nums1.length+nums2.length];

        int i=0,j=0,k=0;

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                z[k++]=nums1[i++];
            }
            else{
                z[k++]=nums2[j++];
            }
        }
        while(i<m){
            z[k++]=nums1[i++];
        }
        while(j<n){
            z[k++]=nums2[j++];
        }

         for (int x = 0; x < m + n; x++) {
            nums1[x] = z[x];
        }
    }
}