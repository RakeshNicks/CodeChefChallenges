
public class level2B {

	public static void main(String[] args) {
		int num=1000;
		for(int i=0;i<=num;i++){
			int ans1=solution1(i);
			int ans2=solution2(i);
			if(ans1!=ans2){
				System.out.println(i+" "+ans1+" "+ans2);
			}
		}
	}

    public static int solution2(int total_lambs) {
        //Your code here
        /*if(total_lambs==1)
         return 0;*/
    	 if(total_lambs<=1 || total_lambs>1000000000){
             return 0;
         }else if(total_lambs==2){
             return 1;
         }else if(total_lambs==3){
             return 0;
         }
        
        return (ungenerous(total_lambs)-genrous(total_lambs));
    }
	private static int genrous(int total_lambs) {
		// TODO Auto-generated method stub
		int ans=1;
		long first=0,current=1,sum=0;
		total_lambs-=1;
		while(total_lambs>0){
			//System.out.println("insideGENEROUS");
			if(total_lambs<2*current){
				sum=current+first;
				if(total_lambs>=sum){
					ans+=1;
				}
				break;		
			}
			ans+=1;			
			first=current;
			current=2*current;
			total_lambs-=current;		
			
		}
		
		
		return ans;
	}
	
	private static int ungenerous(int total_lambs) {
		// TODO Auto-generated method stub
		int ans=1;
		long first=0;
		long current=1;
		total_lambs-=1;
		long sum=0;
		while(total_lambs>0){
			sum=first+current;
			if(total_lambs<sum){
				break;
			}
			ans+=1;
			first=current;
			current=sum;
			total_lambs-=current;
		}	
		
		return ans;
	}
	
	public static int solution1(int total_lambs) {
        //Your code here
        if(total_lambs<=1 || total_lambs>1000000000 )
         return 0;
        
        long sum=1;
	        int unGenerous=1,first=0,current=1,temp=0;
	        while(true){
	        	 temp=current;
		            current=first+current;
		            first=temp;
	            sum+=current;
	            if(sum>total_lambs){
	               //unGenerous++;
	                break;
	            }
	           
	            unGenerous++;
	        }
	        int generous=(int) (Math.log10(total_lambs)/Math.log10(2));
      
            return unGenerous-generous;
        
    }
}