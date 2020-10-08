import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringTokenizer;

public class Answers {

	static public void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());


		while(t-->0){
			solve(br);	
		}

	}

	private static void solve(BufferedReader br) throws IOException {
		// TODO Auto-generated method stub
		StringTokenizer st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int M=Integer.parseInt(st.nextToken());
		int K=Integer.parseInt(st.nextToken());
		
		int answerArray[][]=new int[N][K];
		
		for(int i=0;i<N;i++){
			st=new StringTokenizer(br.readLine());
			for(int j=0;j<K;j++){
				answerArray[i][j]=Integer.parseInt(st.nextToken());
			    }			
		}
		
		/*Random random=new Random();
		for(int i=0;i<N;i++){
			int printNum=1;
			while(true){
				int generatedNum=random.nextInt(M+1);
				if(generatedNum!=0){
					printNum=generatedNum;
					break;
				}
			}
			System.out.print(printNum+" ");
		}*/
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<N;i++){
			int arr[]=new int[10];
			int sum=0;
			for(int j=0;j<K;j++){
				arr[answerArray[i][j]]++;
				}
			
			int maxCount=Integer.MIN_VALUE;
			int index=1;
			for(int k=1;k<=M;k++){
				
				int ele=arr[k];
				//System.out.print(ele+" ");

				if(ele>maxCount){
					maxCount=ele;
					index=k;
				}
			}
			//System.out.println();
			int avg=index;	
			list.add(avg);
		}
		
		for(int ans:list){
			System.out.print(ans+" ");
		}
		System.out.println();
		
		
	}

}
