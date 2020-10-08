import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Divisors {

	
		static public void main(String[] args) throws Exception{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());


			while(t-->0){
				System.out.println(solve(br));	
			}

		}

		private static int solve(BufferedReader br) throws IOException {
			// TODO Auto-generated method stub
			StringTokenizer st=new StringTokenizer(br.readLine());
			
			
			
			int x=Integer.parseInt(st.nextToken());
		    int k=Integer.parseInt(st.nextToken());
		    
		    if(x<=k){
		    	return 0;
		    }else{
		    	if(k==1){
		    		return 1;
		    	}else{
		    		long divisors=primeFactors(x);
		    		
		    		if(divisors>=k){
		    			return 1;
		    		}else{
		    			return 0;
		    		}
		    		
		    	}
		    	
		    
		    
		    
		    }
		
		
		}
		
		public static long primeFactors(int n) 
		{ 
			// Print the number of 2s that divide n 
	        long count=0;
			while (n%2==0) 
			{ 
				//System.out.print(2 + " "); 
			count++;	
	          n /= 2; 
			} 

			// n must be odd at this point. So we can 
			// skip one element (Note i = i +2) 
			for (int i = 3; i <= Math.sqrt(n); i+= 2) 
			{ 
				// While i divides n, print i and divide n 
				while (n%i == 0) 
				{ 
					System.out.print(i + " "); 
					n /= i; 
				} 
			} 

			// This condition is to handle the case whien 
			// n is a prime number greater than 2 
			if (n > 2) 
				count++;//System.out.print(n); 
	      
	      return count;
		} 
		
	}


