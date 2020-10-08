package LongChallengeApril;

import java.util.*;
import java.io.*;

public class Fence {

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

            HashMap<Integer,HashSet<Integer>> map=new HashMap<>();
            
            

		    for(int l=0;l<k;l++){
		        st=new StringTokenizer(br.readLine());
		        int i=Integer.parseInt(st.nextToken());
		        int j=Integer.parseInt(st.nextToken());
		      
		        
		        if(map.containsKey(i)){
		            HashSet<Integer> set=new HashSet<>(map.get(i));
		            set.add(j);
		            map.put(i,set);
		        }else{
		            HashSet<Integer> set=new HashSet<>();
		            set.add(j);
		            map.put(i,set);
		        }       
		    }		    
		
		    HashSet<Integer> kSet=new HashSet<>(map.keySet());
		    Iterator<Integer> iterator=kSet.iterator();
		    HashSet<Integer> temp;
		    int i,j;
            while(iterator.hasNext()){
            	i=iterator.next();
            	HashSet<Integer> rowSet=new HashSet<>(map.get(i));
            	Iterator<Integer> jIterator= rowSet.iterator();
            	
            	while(jIterator.hasNext()){
            		j=jIterator.next();
            		
            		//horizontal
            		
            		if(rowSet.contains(j+1)==false){
	            		fence++;
	            	}
	            	if(rowSet.contains(j-1)==false){
	            		fence++;
	            	}
	            	
	            	//vertical
	            	
	            	if(kSet.contains(i-1)){
	            		temp=new HashSet<>(map.get(i-1));
	            		if(temp.contains(j)==false){
	            			fence++;
	            		}
	            		
	            	}else{
	            		fence++;
	            	}
	            	
	            	if(kSet.contains(i+1)){
	            		temp=new HashSet<>(map.get(i+1));
	            		if(temp.contains(j)==false){
	            			fence++;
	            		}	            		
	            	}else{
	            		fence++;
	            	}
	            	
            	}
            }
		    
		    //System.out.println(map);
		    System.out.println(fence);
		    
		}
	}
}
