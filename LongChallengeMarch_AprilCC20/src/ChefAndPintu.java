import java.util.*;
import java.io.*;

public class ChefAndPintu {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		StringTokenizer st,st1;
		while(t-->0){
			st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int m=Integer.parseInt(st.nextToken());
			
			
			st=new StringTokenizer(br.readLine());
			st1=new StringTokenizer(br.readLine());
			
			HashMap<Integer,Integer> map=new HashMap<>();
			
			while(n-->0){
				int a=Integer.parseInt(st.nextToken());
				int b=Integer.parseInt(st1.nextToken());
				int val=0;
				if(map.containsKey(a)){
					val=map.get(a)+b;
				
				}else{
					val=b;
				}
				
				map.put(a, val);
			}
			
			Set<Integer> set=map.keySet();
			int min=Integer.MAX_VALUE;
			for(int a: set){				
				int val=map.get(a);
				if(val<min){
					min=val;
				}
			}
			
			System.out.println(min);
			
		}

	}

}
