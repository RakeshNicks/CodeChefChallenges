import java.math.BigInteger;

public class level3A_2powersPellet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(solution("4"));
        System.out.println(solution("15"));

	}
	/*def answer(n):
	    n=int(n)
	    res = 0

	    while(n!=1):
	        if(n%2==0):
	            n=n/2
	        elif((n==3) or ((n+1)&n) > ((n-1)&(n-2))):
	            n-=1
	        else:
	            n+=1
	        res+=1
	    return res*/
	public static int solution(String x) {
		int ans=0;
		BigInteger biGiven=new BigInteger(x);
		BigInteger bi2=BigInteger.valueOf(2);
        BigInteger bi1=BigInteger.valueOf(1);
        BigInteger bi0=BigInteger.ZERO;
        while(!biGiven.equals(bi1)){
            if(biGiven.mod(bi2).equals(bi0)){
            	biGiven=biGiven.divide(bi2);
            }else {
            	BigInteger biGiven1=biGiven.add(bi1);
            	BigInteger biGiven_2=biGiven.subtract(bi2);
            	BigInteger biGiven_1=biGiven.subtract(bi1);
            	if(biGiven1.and(biGiven).compareTo(biGiven_1.and(biGiven_2))==1){
            		biGiven=biGiven.subtract(bi1);
            	}else{
            		biGiven=biGiven.add(bi1);
            	}    	
            	
            	
            }
            ans++;
        }
		return ans;
		// Your code here
        
	}
	public static double log(double a,double base){

		double ans=(Math.log10(a)*1.0)/Math.log10(base);
		return ans;

	}

}
