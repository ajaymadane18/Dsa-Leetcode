class Solution {
    public int[] twoSum(int[] nums, int target) {
           int arr[]=new int[2];
           HashSet<Integer> hs= new HashSet<>();
              for(int ele:nums){
                int rem=target-ele;
        if(hs.contains(rem)){
                  arr[0]=ele;
                  arr[1]=rem;
        }
             hs.add(ele);
              }
              return arr;
    }
}
