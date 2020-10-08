package LongChallengeApril;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
public class MaxRemModulo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
		    int n=Integer.parseInt(br.readLine());
		    StringTokenizer st=new StringTokenizer(br.readLine());
		    String str=String.valueOf(st.nextToken());
		    char x=st.nextToken().charAt(0);
		    //System.out.println(n+" "+str+" "+x);
		    HashMap<Integer,Character> map=new HashMap<>();
		    for(int i=0;i<n;i++){
		        if(str.charAt(i)==x){
		            
		            map.put(i,x);
		            
		        }
		    }
		    long count=map.size();
		    
		    if(map.size()!=0){
		        for(int i=0;i<n;i++){
		            for(int j=i+1;j<n;j++){
		                for(int k=i;){
		                	
		            }
		        }
		    }
		        
		    }
		}
	}
}
