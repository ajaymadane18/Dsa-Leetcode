class Solution {
    public long countPairs(int[] arr, int k) {
          HashMap<Long, Long> map = new HashMap<>();
        long count = 0;

        for (int num : arr) {

            long g1 = gcd(num, k);

            for (long g2 : map.keySet()) {

                if ((g1 * g2) % k == 0) {
                    count += map.get(g2);
                }
            }

            map.put(g1, map.getOrDefault(g1, 0L) + 1);
        }

        return count;
    }

    public long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}