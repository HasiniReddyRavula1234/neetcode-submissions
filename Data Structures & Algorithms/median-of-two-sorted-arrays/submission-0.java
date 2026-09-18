class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] nums = new int[n];
        int count = 0;
        for(int i = 0;i < nums1.length;i++){
            nums[count++] = nums1[i];
            
        }
        for(int i = 0;i < nums2.length;i++){
            nums[count++] = nums2[i];
        }
        Arrays.sort(nums);
        if(n % 2 != 0)
        return (double)(nums[n / 2]);
        else 
        return (nums[n/2]+nums[n/2-1]) / 2.0;

    }
}