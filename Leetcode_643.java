class Solution {
    public double findMaxAverage(int[] arr, int k) {
           double maxAvg=Double.NEGATIVE_INFINITY;
          int i=0,j=k;
          while(j<=arr.length){
            int sum=0;
            for(int m=i;m<j;m++){
                 sum+=arr[m];
                
            }
            double avg=(double)sum/k;
                  if(avg>maxAvg){
                    maxAvg=avg;
                  }
                  i++;
                  j++;
          }
          return maxAvg;
    }
}