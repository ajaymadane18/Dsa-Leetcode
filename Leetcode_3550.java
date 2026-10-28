class Solution {
    public int smallestIndex(int[] arr) {
           int n= arr.length;
           
           for(int i=0;i<n;i++){
            int sum=0;
              int num=arr[i];
              if(num<=9){
                sum+=num;
              }else{
              while(num>0){
                int digit=num%10;
                sum+=digit;
                num/=10;
                
              }
              }
              if(sum==i){
                return i;
              }
           }
           return -1;
    }
}