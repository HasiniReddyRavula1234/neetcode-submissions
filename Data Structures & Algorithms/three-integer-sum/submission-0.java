

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int target = 0;
        List<List<Integer>> ans = new ArrayList<>();

        for (int a = 0; a < arr.length; a++) {
            if (a > 0 && arr[a] == arr[a - 1]) continue; // skip duplicates

            int b = a + 1, c = arr.length - 1;

            while (b < c) {
                int sum = arr[a] + arr[b] + arr[c];

                if (sum == target) {
                    ans.add(Arrays.asList(arr[a], arr[b], arr[c]));
                    b++;
                    c--;

                    // skip duplicates for b
                    while (b < c && arr[b] == arr[b - 1]) b++;
                    // skip duplicates for c
                    while (b < c && arr[c] == arr[c + 1]) c--;
                } 
                else if (sum < target) {
                    b++;
                } 
                else {
                    c--;
                }
            }
        }

        return ans;
    }
}