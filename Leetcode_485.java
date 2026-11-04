class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
            int n=arr.length;
             int i=0;
             int maxlen=0;
             int len=0;
             while(i<n){
                
                if(arr[i]==1){
                    len++;
                    
                }else{
                    maxlen=Math.max(maxlen,len);
                    len=0;
                }
                i++;
             }
           return Math.max(maxlen,len);
    }
}