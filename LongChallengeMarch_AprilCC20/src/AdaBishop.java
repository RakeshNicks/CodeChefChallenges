import java.util.*;
import java.io.*;

public class AdaBishop {
	public static int map[][]={{7,1},
			{8,2},
			{7,3},
			{8,4},
			{5,1},
			{4,2},
			{3,1},
			{8,6},
			{7,7},
			{8,8},
			{1,1},
			{2,2},
			{1,3},
			{6,8},
			{5,7},
			{4,8},
			{1,5},
			{2,6},
			{1,7},
			{2,8}	
			};

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int diagonal[][]={{1,7},
				{2,6},
				{3,5},
				{4,4},
				{5,3},
				{6,2},
				{7,1},				
				
		};
		
		
		int t=Integer.parseInt(br.readLine());
		StringTokenizer st;
		while(t-->0){
			st=new StringTokenizer(br.readLine());
			int r0=Integer.parseInt(st.nextToken());
			int c0=Integer.parseInt(st.nextToken());		
		    
			
			if(r0==1 && c0==1){
				System.out.println(21);
				System.out.println(4+" "+4);
				print();				
			}else if(r0==7 && c0==1){
				System.out.println(20);
				print();
			}else{
				
				int minDistance=Integer.MAX_VALUE,currentDistance,r=1,c=7;
				for(int i=0;i<7;i++){
					currentDistance=(int) Math.pow((diagonal[i][0]-r0),2)+(int) Math.pow((diagonal[i][1]-c0),2);
					if(currentDistance<minDistance){
						minDistance=currentDistance;
						r=diagonal[i][0];
						c=diagonal[i][1];
					}
				}
				System.out.println(21);
				System.out.println(r+" "+c);
				print();
				
			}
			
			
			
		}

	}
	public static void print(){
		for(int i=0;i<20;i++){
			System.out.println(map[i][0]+" "+map[i][1]);
		}
	}

}
