import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        List<Integer> ans= new ArrayList<>();
        int n=arr.length;
           Arrays.sort(arr);
           for(int i=0;i<n;i++){
            if(arr[i]==target){
                ans.add(i);
            }
           }
           return ans;

    }
}