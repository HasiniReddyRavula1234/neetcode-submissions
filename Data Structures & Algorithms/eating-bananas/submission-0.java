class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1, high = 0;

        for(int num : piles){
            high = Math.max(high, num);
        }

        while(low <= high){

            int mid = (low + high) / 2;

            int totalsum = koko(piles, mid);

            if(totalsum <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return low;
    }

    public int koko(int[] arr, int k){

        int totalsum = 0;

        for(int num : arr){
            totalsum += Math.ceil((double) num / k);
        }

        return totalsum;
    }
}