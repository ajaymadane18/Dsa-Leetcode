class Solution {
    public long maximumSubarraySum(int[] arr, int k) {

        int i = 0, j = 0;
        long sum = 0, maxsum = 0;

        HashSet<Integer> set = new HashSet<>();

        while(j < arr.length) {
            while(set.contains(arr[j])) {
                set.remove(arr[i]);
                sum -= arr[i];
                i++;
            }

            set.add(arr[j]);
            sum += arr[j];
            if(j - i + 1 == k) {
                maxsum = Math.max(maxsum, sum);

                set.remove(arr[i]);
                sum -= arr[i];
                i++;
            }

            j++;
        }

        return maxsum;
    }
}
