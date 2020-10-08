package LongChallengeApril;

import java.io.*;
import java.util.*;

import javafx.util.Pair;

public class Fence2 {

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

            HashMap<Pair <Integer,Integer>,Boolean> map=new HashMap<>();
            Pair <Integer,Integer> pair;
		    for(int l=0;l<k;l++){
		        st=new StringTokenizer(br.readLine());
		        int i=Integer.parseInt(st.nextToken());
		        int j=Integer.parseInt(st.nextToken());
		        
		        pair=new Pair<>(i,j);
		        map.put(pair,true);		        
		        }
		    Set<Pair<Integer,Integer>> keySet=map.keySet();
		    int i,j;
		    Pair<Integer,Integer> tempPair;
		    for(Pair<Integer,Integer> pairI:keySet){
		    	i=pairI.getKey();
		    	j=pairI.getValue();		    	
		    	
		    	tempPair=new Pair<Integer, Integer>(i,j+1);
		    	if(map.containsKey(tempPair)==false){
                   fence++;
		    	}
		    	tempPair=new Pair<Integer, Integer>(i,j-1);
		    	if(map.containsKey(tempPair)==false){
                   fence++;
		    	}

		    	tempPair=new Pair<Integer, Integer>(i-1,j);
		    	if(map.containsKey(tempPair)==false){
                   fence++;
		    	}
		    	tempPair=new Pair<Integer, Integer>(i+1,j);
		    	if(map.containsKey(tempPair)==false){
                   fence++;
		    	}    	
		    	
		    }		    
		    //System.out.println(map);
		    System.out.println(fence);
		    
		}
	}
}
