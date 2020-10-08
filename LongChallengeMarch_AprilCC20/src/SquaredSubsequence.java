import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class SquaredSubsequence {

	static private PrintWriter out=new PrintWriter(System.out);
	static public void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		long t=Integer.parseInt(br.readLine());


		while(t-->0){
			solve(br);	
		}

		out.flush();
		out.close();
	}
	private static void solve(BufferedReader br) throws Exception{
		// TODO Auto-generated method stub

		long n=Integer.parseInt(br.readLine());
		long arr[]=new long[(int) n];
		long ans=0;
		

		StringTokenizer st=new StringTokenizer(br.readLine());
		for(long i=0;i<n;i++){
			int num=Integer.parseInt(st.nextToken());
			
			if(num%2==0){
				if(num%4==0)
				arr[(int) i]=4;
				else
				arr[(int) i]=2;	
			}else{
				arr[(int) i]=0;
			}
			
			
			
			//out.prlong(arr[i]+" ");
		}
         //out.prlongln();
		
		ans=findSubarraySum(arr, n,0);
		//out.prlongln("1st0 "+ans);
		ans+=findCnt(arr, n, 3);
		//out.prlongln("2nd4 "+ans);

		
		out.println(ans);

	}
	
	
	 static long findSubarraySum(long arr[], long n,long sum)  
	    {  
	        // HashMap to store number of subarrays  
	        // starting from index zero having   
	        // particular value of sum.  
	        HashMap <Long, Long> prevSum = new HashMap<>();  
	        
	        long res = 0;  
	        
	        // Sum of elements so far.  
	        long currsum = 0;  
	        
	        for (long i = 0; i < n; i++) {  
	        
	            // Add current element to sum so far.  
	            currsum += arr[(int) i];  
	        
	            // If currsum is equal to desired sum,  
	            // then a new subarray is found. So  
	            // increase count of subarrays.  
	            if (currsum ==sum)   
	                res++;          
	        
	            // currsum exceeds given sum by currsum   
	            //  - sum. Find number of subarrays having   
	            // this sum and exclude those subarrays  
	            // from currsum by increasing count by   
	            // same amount.  
	            if (prevSum.containsKey(currsum - sum))   
	                res += prevSum.get(currsum - sum);  
	                
	        
	            // Add currsum value to count of   
	            // different values of sum.  
	            Long count = prevSum.get(currsum); 
	            if (count == null) 
	                prevSum.put(currsum, (long) 1); 
	            else
	                prevSum.put(currsum, count+1);  
	        }  
	        
	        return res;  
	    }
	 static long findCnt(long arr[], long n, long k) 
	 { 
	     // Variable to store final answer 
	     long ans = 0; 
	   
	     // Loop to find prefix-sum 
	     for (long i = 1; i < n; i++) 
	     { 
	         arr[(int) i] += arr[(int) (i - 1)]; 
	         if (arr[(int) i] > k || arr[(int) i] < -1 * k) 
	             ans++; 
	     } 
	   
	     if (arr[0] > k || arr[0] < -1 * k) 
	         ans++; 
	   
	     // Sorting prefix-sum array 
	     Arrays.sort(arr); 
	   
	     // Loop to find upper_bound 
	     // for each element 
	     for (long i = 0; i < n; i++) 
	         ans += n - upper_bound(arr, 0, n, arr[(int) i] + k); 
	   
	     // Returning final answer 
	     return ans; 
	 } 
	   
	 static long upper_bound(long[] a, long low,  
	                     long high, long element) 
	 { 
	     while(low < high) 
	     { 
	         long middle = low + (high - low)/2; 
	         if(a[(int) middle] > element) 
	             high = middle; 
	         else
	             low = middle + 1; 
	     } 
	     return low; 
	 }
}
