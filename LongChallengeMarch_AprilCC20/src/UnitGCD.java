import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnitGCD {
    static private PrintWriter out=new PrintWriter(System.out);
	static public void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());


		while(t-->0){
			solve(br);	
		}
       
		out.flush();
		out.close();
	}

	private static void solve(BufferedReader br) throws Exception {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(br.readLine());
		

		
		if(n==1){
			out.println(1);
			out.println(1);
		}else{
			out.println((int)n/2);
			print(n);
		}
	}

	private static void print(int n) {
		// TODO Auto-generated method stub
		int printNum=1;

		if(n%2==0){
			for(int i=0;i<n/2;i++){
				out.println(2+" "+(printNum)+" "+(printNum+1));
				printNum+=2;
			}
		}else{
			for(int i=0;i<n/2;i++){				
				if(i==0){
					out.println(3+" "+1+" "+2+" "+n);					
				}else{
					out.println(2+" "+(printNum)+" "+(printNum+1));
				}
				printNum+=2;
			}
		}
		
	}	

}
