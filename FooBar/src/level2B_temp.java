
public class level2B_temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<=20){
			System.out.println(i+" "+solution1(i));
			i++;
		}
		//System.out.println(solution1(917503));
	}
	public static int solution1(int total_lambs) {
        //Your code here
        if(total_lambs<=2 || total_lambs>1000000000 )
         return 0;
        
        long sum=1;
	        int unGenerous=1,first=0,current=1,temp=0;
	        while(true){
	        	 temp=current;
		            current=first+current;
		            first=temp;
	            sum+=current;
	            if(sum>total_lambs){
	               // unGenerous++;
	                break;
	            }
	           
	            unGenerous++;
	        }
	        int generous=(int) (Math.log10(total_lambs)/Math.log10(2));
      
            return unGenerous-generous;
        
    }

}
