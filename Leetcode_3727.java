class Solution {
    public long maxAlternatingSum(int[] arr) {
         for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
         }
         Arrays.sort(arr);
         long sum=0;
         for(int i=0;i<arr.length;i++){
            if(i<arr.length/2){
                sum-=arr[i];
            }else{
                sum+=arr[i];
            }
         }
         return sum;
          
    }
}