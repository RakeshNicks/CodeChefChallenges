package kickStart;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class bucket {
	static PrintWriter out=new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int caseN=1;
		
		while(t-->0){
	       
			long ans=solve(br);
			
		    out.println("Case #"+(caseN++)+": "+ans);		    //caseN++;
			
		}
		out.flush();
		out.close();
		

	}
	private static long solve(BufferedReader br) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer(br.readLine());
		int n=Integer.parseInt(st.nextToken());
		long d=Long.parseLong(st.nextToken());
		
		
		st=new StringTokenizer(br.readLine());
		long arr[]=new long[n];
		for(int i=0;i<n;i++){
			arr[i]=Long.parseLong(st.nextToken());
		}
		
		
		
		long lowestDay=d;
		long counterDay=d;
		long ans=1;
		int i=0;
		
		if(n==1){
			long num=arr[0];
			while(true){
				if(lowestDay%num==0){
					return lowestDay;
				}
				lowestDay--;
			}
		}
		
		
		
		
		
		while(true){
			long num=arr[0];
			out.println(lowestDay);
			
							
				while(true){
					if(lowestDay%num==0){
				    	counterDay=lowestDay;
				    	break;
				    }else{
				    	lowestDay--;
				    }
				}		    
			
			boolean found=false;
			for(int j=1;j<n;j++){
				long tempNum=arr[j];
				
				boolean smallFound=false;
				while(true){
					if(counterDay%tempNum==0){
						if(j==n-1){
							found=true;
							break;
						}else{
							smallFound=true;
							break;
						}
					}else{
						if(counterDay>d){
							smallFound=false;
							break;
						}else{
							counterDay++;
						}
					}
				}	
				if(smallFound==false){
					break;
				}
			}
			
			if(found){
				ans=lowestDay;
				break;
			}else{
				lowestDay--;
			}
			
		}
		
		
		
		return ans;
	}

}
