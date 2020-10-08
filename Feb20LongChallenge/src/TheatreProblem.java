
import java.io.*;
import java.util.*;

public class TheatreProblem {
	public static int maxSum=0;
	public static int totalSum=0;
	public static int count=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int cases=Integer.parseInt(br.readLine());
		StringTokenizer st;


		while(cases-->0){
			maxSum=0;
			int n=Integer.parseInt(br.readLine());
			int arr[][]=new int[4][4];
			Integer singleArr[]=new Integer[16];
			while(n-->0){
				st= new StringTokenizer(br.readLine());
				String m=st.nextToken();
				String t=st.nextToken();

				int row,col;

				if(m.equals("A")){
					row=0;
				}else if(m.equals("B")){
					row=1;
				}else if(m.equals("C")){
					row=2;
				}else{
					row=3;
				}

				if(t.equals("12")){
					col=0;
				}else if(t.equals("3")){
					col=1;
				}else if(t.equals("6")){
					col=2;
				}else{
					col=3;
				}
				//System.out.print(" "+m+" "+t);
				arr[row][col]+=1;



			}
			/*int k=0;
			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					singleArr[k++]=arr[i][j];
				}
			}

			Arrays.sort(singleArr,Collections.reverseOrder());

			for(int i=0;i<16;i++){
				System.out.print(singleArr[i]+ " ");
			}
			System.out.println();*/


			for(int i=0;i<4;i++){
				for(int j=0;j<4;j++){
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();

			FindMax(arr);
			System.out.println(count);
			
		}

	}
	public static void FindMax(int arr[][]){



		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				HashSet<Integer> rowSet=new HashSet<>();
				HashSet<Integer> colSet=new HashSet<>();
				ArrayList<Integer> list=new ArrayList<>();
				list.add(arr[i][j]);			
				rowSet.add(i);
				colSet.add(j);
				FindMax2(arr,list,rowSet,colSet,maxSum);
				
				
			}

		}


	}
	private static void FindMax2(int[][] arr, ArrayList<Integer> list, HashSet<Integer> rowSet, HashSet<Integer> colSet, int maxSum) {
		// TODO Auto-generated method stub

		for(int i=0;i<4;i++){
			if(rowSet.contains(i))
			   continue;
			for(int j=0;j<4;j++){
				if(colSet.contains(j) ){
					continue;
				}

				list.add(arr[i][j]);			
				rowSet.add(i);
				colSet.add(j);
				FindMax3(arr,list,rowSet,colSet,maxSum);	
				rowSet.remove(i);
				colSet.remove(j);

			}			
		}

	}
	private static void FindMax3(int[][] arr, ArrayList<Integer> list, HashSet<Integer> rowSet, HashSet<Integer> colSet,
			int maxSum) {


		for(int i=0;i<4;i++){
			if(rowSet.contains(i))
				   continue;
			for(int j=0;j<4;j++){
				if(colSet.contains(j)){
					continue;
				}

				list.add(arr[i][j]);			
				rowSet.add(i);
				colSet.add(j);
				FindMax4(arr,list,rowSet,colSet,maxSum);	
                
				rowSet.remove(i);
				colSet.remove(j);

			}			
		}

	}
	private static void FindMax4(int[][] arr, ArrayList<Integer> list, HashSet<Integer> rowSet, HashSet<Integer> colSet,
			int maxSum) {
		int remCol=0;
		int remRow=0;
		for(int i=0;i<4;i++){
			if(rowSet.contains(i))
				   continue;
			for(int j=0;j<4;j++){
				if(colSet.contains(j)){
					continue;
				}

				list.add(arr[i][j]);			
				rowSet.add(i);
				colSet.add(j);
			    remCol=j;
			    remRow=i;
           
            //Collections.sort(list);
            if(list.size()>-1){
            	 count++;
            	 Collections.sort(list);
            	 for(Integer num: list){
     				System.out.print(num+" ");
     			}
            	 System.out.println();
            }
			
			
			
			//System.out.println(" in last :"+i+" "+j);
		}
	}
		rowSet.remove(remRow);
		rowSet.remove(remCol);
		
	}

}
