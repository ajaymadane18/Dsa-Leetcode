class Solution {
    public void moveZeroes(int[] arr) {
        int n= arr.length;
       int left =0;
       for(int right=0;right<n;right++){
        if(arr[right]!=0){
           int temp=arr[right];
           arr[right]=arr[left];
           arr[left]=temp;
           left++;
        }
       }
        
    }
}
