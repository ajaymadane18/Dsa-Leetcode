class Solution {
    public int maxFrequencyElements(int[] arr) {
         HashMap<Integer,Integer> map= new HashMap<>();
		                 
		                  for(int ele:arr) {
		                	  map.put(ele, map.getOrDefault(ele,0)+1);
		                  }
		               System.out.println(map);
		               
		               
		               int maxfreq=Integer.MIN_VALUE;
		               int ans=0;
		               for(int num:map.keySet()) {
		            	   int freq=map.get(num);
		            	   if(freq>maxfreq) {
		            	    	 maxfreq=freq;
		            	    	 ans=freq;
		            	     }else if(freq==maxfreq) {
		            	    	 ans+=freq;
		            	     }
		               }
                       return ans;

    }
}