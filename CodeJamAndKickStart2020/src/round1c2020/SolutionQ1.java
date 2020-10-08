package round1c2020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class SolutionQ1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);
		int t=Integer.parseInt(br.readLine());
		int caseN=1;
		
		while(t-->0){	       
			int ans=solve(br);
		  
		    out.println("Case #"+(caseN++)+" "+ans);		    //caseN++;
			
		}
		out.flush();
		out.close();
		

	}

	private static int solve(BufferedReader br) throws Exception{
		// TODO Auto-generated method stub
		int n=Integer.parseInt(br.readLine());
		int ans=0;
		StringTokenizer st=new StringTokenizer(br.readLine());
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(st.nextToken());			
		}
		
		for(int i=1;i<n-1;i++){
			int num=arr[i];
			if(arr[i-1]<num && arr[i+1]<num){
				ans++;
			}
			
		}
		
		return ans;
	}

}