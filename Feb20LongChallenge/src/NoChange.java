import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NoChange {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(br.readLine());
		StringTokenizer st;


		while(cases-->0){
			st=new StringTokenizer(br.readLine());
			int n=Integer.parseInt(st.nextToken());
			int p=Integer.parseInt(st.nextToken());
			
			st=new StringTokenizer(br.readLine());
			
			
			int arr[]=new int[n];
			int ans[]=new int[n];
			long sum=0;
			for(int i=0;i<n;i++){
				arr[i]=Integer.parseInt(st.nextToken());
				sum+=arr[i];
				ans[i]=1;
			}
			
			int counterHit=0;
			long minOverpay=Integer.MAX_VALUE;
			if(sum>p){
				for(int i=0;i<n;i++){
				   sum-=arr[i];
				   ans[i]-=1;
				   if(sum>p){
					   continue;
				   }else if(sum==p){
					   counterHit++;
					   if(counterHit==n){
						   System.out.println("NO");
						   break;
					   }
					   ans[i]+=1;
					   sum+=arr[i];
				   }else{
					   ans[i]+=1;
					   sum+=arr[i];
					   System.out.print("YES ");
					   for(int l=0;l<n;l++){
						   System.out.print(ans[l]+" ");
					   }
					   System.out.println();
					   break;
				   }
				}
			}else if(sum==p){
				if(n==1){
					System.out.println("NO");
				}else{
					ans[0]-=1;
					ans[1]+=1;
					System.out.print("YES ");
					   for(int l=0;l<n;l++){
						   System.out.print(ans[l]+" ");
					   }
					   System.out.println();
					   break;
				}
			}else{				
				int i=0;
				while(true){					
					sum+=arr[i];
					ans[i]+=1;
					if(sum==p){
						if(n==1){
							System.out.println("NO");
							break;
						}						
						sum-=arr[i];
						ans[i]-=1;
						i++;
					}else if(sum<p){
						continue;
					}else{
						System.out.print("YES ");
						   for(int l=0;l<n;l++){
							   System.out.print(ans[l]+" ");
						   }
						   System.out.println();
						   break;
					}
				}
				
				
				
			}
			
			
		}
		}

	}


