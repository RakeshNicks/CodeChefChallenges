package LongChallengeApril;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class Fence3stringAlgo {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		while(t-->0){
		    long fence=0;
		    
		    st=new StringTokenizer(br.readLine());
		    int n=Integer.parseInt(st.nextToken());
		    int m=Integer.parseInt(st.nextToken());
		    int k=Integer.parseInt(st.nextToken());

            HashMap<String,Boolean> map=new HashMap<>();
            
		    for(int l=0;l<k;l++){
		        //st=new StringTokenizer(br.readLine());
		        /*int i=Integer.parseInt(st.nextToken());
		        int j=Integer.parseInt(st.nextToken());*/
		        
		        String str=br.readLine();
		        		        
		        map.put(str,true);		        
		        }
		    //System.out.println(map);
		    
		    Set<String> keySet=map.keySet();
		    int i,j;
		    String tempStr;
		    for(String pairI:keySet){
		    	String str[]=pairI.split(" ");
		    	
		    	i=Integer.parseInt(str[0]);
		    	j=Integer.parseInt(str[1]);	   
		    	
		    	if(map.containsKey(i+" "+(j+1))==false){
                   fence++;
		    	}
		    		    	
                if(map.containsKey(i+" "+(j-1))==false){
                   fence++;
		    	}


		    	if(map.containsKey((i+1)+" "+j)==false){
                   fence++;
		    	}

		    	
		    	if(map.containsKey((i-1)+" "+j)==false){
                   fence++;
		    	}

		    	
		    }		    
		    System.out.println(fence);
		    
		}
	}
}
