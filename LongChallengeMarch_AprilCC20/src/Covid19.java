import java.util.*;
import java.io.*;



public class Covid19 {
	static public void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());


		while(t-->0){
			solve(br);	
		}

	}

	private static void solve(BufferedReader br) throws IOException {
		// TODO Auto-generated method stub

		int n=Integer.parseInt(br.readLine());

		int arr[]=new int[n];
		StringTokenizer st=new StringTokenizer(br.readLine());
		boolean isFollowed=true;
		for(int i=0;i<n;i++){
			arr[i]=Integer.parseInt(st.nextToken());
		}
	
		
		int lastIndex=-500;
		for(int i=0;i<n;i++){
			
			if(arr[i]==1){
				if(Math.abs(lastIndex-i)<6){
					isFollowed=false;
					//System.out.println(i+" "+Math.abs(lastIndex-i));
					break;
				}else{
					lastIndex=i;
				}
			}
			
			
		}
     
		
		System.out.println(isFollowed==true?"YES":"NO");


	}

}
