package LongChallengeApril;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KLP {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		
		int n=str.length();
		long subPal=0;
		for(int i=0;i<n;i++){
		    for(int j=i+1;j<n;j++){
		       String s1= str.substring(i,j);
		        
		        for(int u=j;u<n;u++){
		             for(int v=u+1;v<n+1;v++){
		            	 
		            String s2=str.substring(u,v);
		             
		            String conCat=s1+s2;
		            StringBuilder sb=new StringBuilder(conCat);
			        sb=sb.reverse();  
			        //System.out.println(sb+" "+conCat);
			        if(sb.toString().equals(conCat)){
			            subPal++;
			        }
		        }
		        }
		        
		       
		        
		    }
		}
		System.out.println(subPal);
		
		
	}
}
