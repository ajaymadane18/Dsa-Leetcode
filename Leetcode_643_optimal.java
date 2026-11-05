class Solution {
    public double findMaxAverage(int[] arr, int k) {
           double maxAvg=Double.NEGATIVE_INFINITY;
          int n=arr.length;
           double sum=0;
      
             for(int i=0;i<k;i++){
                sum+=arr[i];
             }
             maxAvg=sum/k;
             for(int i=k;i<n;i++){
                sum+=arr[i];
                sum-=arr[i-k];
                double avg=(double)sum/k;
                if(avg>maxAvg)maxAvg=avg;
             }
            return maxAvg;
    }
}