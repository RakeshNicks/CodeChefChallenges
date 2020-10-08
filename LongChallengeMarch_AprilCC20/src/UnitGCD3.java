import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UnitGCD2 {

	static public void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out=new PrintWriter(System.out);

		int t=Integer.parseInt(br.readLine());


		while(t-->0){
			solve(br,out);	
		}

		out.flush();
		out.close();

	}

	private static void solve(BufferedReader br, PrintWriter out) throws Exception {
		// TODO Auto-generated method stub
		int n=Integer.parseInt(br.readLine());
		HashSet<Integer> set=new HashSet<>();
        ArrayList<ArrayList<Integer>> allList=new ArrayList<>();
		for(int i=1;i<=n;i++){
			if(set.contains(i)){
				continue;
			}
			ArrayList<Integer> tempList=new ArrayList<>();
			tempList.add(i);
			set.add(i);
			for(int j=i+1;j<=n;j++){
				if(set.contains(j)){
					continue;
				}
				boolean isCoPrime=true;
				for(int element: tempList){
					if(gcd(element,j)!=1){
						isCoPrime=false;
						break;
					}
				}
				if(isCoPrime){
					tempList.add(j);
					set.add(j);
				}

			}

			allList.add(tempList);
		}
		
		out.println(allList.size());

		for(ArrayList<Integer> printElem:allList){
			for(int print: printElem){
				out.print(print+" ");
			}
			out.println();
		}
	}
	static int gcd(int a,int b){
		if(a==0)
			return b;

		return gcd(b%a,a);		

	}	

}
