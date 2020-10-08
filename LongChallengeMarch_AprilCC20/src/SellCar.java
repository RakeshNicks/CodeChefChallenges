import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class SellCar {
   static int modulo=1000000007;
	static public void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());


		while(t-->0){
			solve(br);	
		}

	}

	private static void solve(BufferedReader br) throws Exception{
		// TODO Auto-generated method stub
		int n=Integer.parseInt(br.readLine());
	    Integer arr[]=new Integer[n];
	    StringTokenizer st=new StringTokenizer(br.readLine());
	    for(int i=0;i<n;i++){
	    	arr[i]=Integer.parseInt(st.nextToken());
	    }
		//Arrays.parallelSort(arr);
       
	    Arrays.parallelSort(arr,Collections.reverseOrder());
	    BigInteger sum=BigInteger.valueOf(arr[0]);
	    //System.out.println("initial "+sum);
	    BigInteger biModulo=new BigInteger(String.valueOf(modulo));
	    for(int i=1;i<n;i++){
	     	
	    	if((arr[i]-i)>0){
	    		//System.out.println(arr[i]-i);
		    	sum=sum.add(BigInteger.valueOf(arr[i]-i));
		    	//System.out.println("added: "+BigInteger.valueOf(arr[i]-i)+ " sum"+sum);

	    	}
	    }
	     System.out.println(sum.mod(biModulo));
	}

}
