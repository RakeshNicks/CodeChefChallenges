package LongChallengeApril;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MakingAMeal {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		FastReader scan=new FastReader();
		int t=scan.nextInt();
		String str="",finalStr="";
	
		
		while(t-->0){
			//char minChar='z';
			
		    int n=scan.nextInt();
		    finalStr="";
		    HashMap<Character,Integer> map=new HashMap<>();
		   
		    while(n-->0){
		        str=scan.nextLine();
		        finalStr+=str;
		        }
		        
		   int l=finalStr.length();
		   int val=0;
		   
		   for(int i=0;i<l;i++){
		       char ch=finalStr.charAt(i);
		       if(ch=='c' || ch=='o' || ch=='d' || ch=='e' || ch=='h' || ch=='f' ){
		           if(map.containsKey(ch)){
		               val=map.get(ch);
		               val++;
		               map.put(ch,val);
		                        
		           }else{
		               map.put(ch,1);
		           }
		       }
		   }
		   
		  

		   if(map.size()!=0){		  
		   
			   char key;
			   int value;
			   Set<Map.Entry<Character, Integer>> entries=map.entrySet();
			   for(Map.Entry<Character, Integer> entry: entries){
				   key=entry.getKey();
				   value=entry.getValue();
				   if(key=='c' || key=='e'){
					   map.put(key,(int) value/2);
				   }
			   }
			   ArrayList<Integer> list=new ArrayList<>(map.values());
			   Collections.sort(list);
			   System.out.println(list.get(0));
		   }else{
			   System.out.println(0);
		   }
		   

		}
	}
	
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
       
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 
}