import java.math.BigInteger;

public class level3B_Bombs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(solution("2", "1"));
       System.out.println(solution("98", "56"));
       System.out.println(solution("11", "29"));
       System.out.println(solution("4", "7"));



	}
	 /*while(true) {
         if(m.compareTo(BigInteger.ONE) == -1 || f.compareTo(BigInteger.ONE) == -1)
             return "impossible";
         else if(m.compareTo(BigInteger.ONE) == 0 && f.compareTo(BigInteger.ONE) == 0)
             return String.valueOf(cycles);
         else {
             if(m.compareTo(f) == 1) {
                 m = m.subtract(f);
             } else {
                 f = f.subtract(m);
             }
             cycles++;
         }*/
	private static BigInteger biTotal;
	 public static String solution(String x, String y) {
	        // Your code here
		 BigInteger biM=new BigInteger(x);
		 BigInteger biF=new BigInteger(y);
		 BigInteger bi1=BigInteger.ONE;
		 BigInteger biAns=BigInteger.ZERO;
		 String ansImp="impossible";
		 BigInteger bi2=new BigInteger("2");
		 BigInteger bi0=BigInteger.ZERO;
		 /*while(true){
			 //(biM.mod(bi2).compareTo(bi0)==0 && (biF.mod(bi2).compareTo(bi0)==0)) || 
			 if((biM.compareTo(bi1)==-1 || biF.compareTo(bi1)==-1)){
				 return ansImp;
			 }else if(biM.compareTo(bi1)==0 && biF.compareTo(bi1)==0){
				 return biAns.toString();
			 }else{
				 if(biM.compareTo(biF)==1){
					 biM=biM.subtract(biF);
				 }else{
					 biF=biF.subtract(biM);
				 }
			 }
			 biAns=biAns.add(bi1);
			 
		 }*/
		 biTotal=bi0;
		 
		 if((biM.mod(bi2).compareTo(bi0)==0 && (biF.mod(bi2).compareTo(bi0)==0))
				 || (biM.compareTo(bi1)==-1 || biF.compareTo(bi1)==-1)){
			 return ansImp;
		 }else{
			 biAns=biGCD(biM,biF);
			 biTotal.subtract(bi1);
			 return biTotal.toString();
		 }

	    }
	private static BigInteger biGCD(BigInteger biM, BigInteger biF) {
		// TODO Auto-generated method stub
		biTotal=biTotal.add(BigInteger.ONE);
		if(biF.compareTo(BigInteger.ZERO)==0){
			return biM;
		}
		
		return biGCD(biF,biM.mod(biF));
	}

}
