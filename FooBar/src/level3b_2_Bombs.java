import java.math.BigInteger;

public class level3b_2_Bombs {

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

	public static String solution(String x, String y) {
		// Your code here
		BigInteger biM=new BigInteger(x);
		BigInteger biF=new BigInteger(y);
		BigInteger bi1=BigInteger.ONE;
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
		
		BigInteger biAns=BigInteger.ZERO;

		BigInteger biTempF;
		BigInteger biTempM;
		BigInteger biMbyF;
		while(!(biM.compareTo(bi1)==0 && biF.compareTo(bi1)==0)){
			
		 
			
		   if(biF.compareTo(bi1)==-1 || biM.compareTo(bi1)==-1){
				return ansImp;
			}
            //System.out.println(biF+" "+bi1);
			if(biF.compareTo(bi1)==0){
				//System.out.println(" hit IF ");
				biAns=biAns.add(biM);
				biAns=biAns.subtract(bi1);
				return (biAns).toString();
			}else{
				biMbyF=biM.divide(biF);
				biAns=biAns.add(biMbyF);
				biTempF=new  BigInteger(biF.toString());
				biTempM=new  BigInteger(biM.toString());

				biM=biTempF;
				biF=biTempM.mod(biTempF);
			}

		}
		return biAns.toString(); 

	}
	
}
