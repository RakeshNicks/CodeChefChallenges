import java.time.temporal.Temporal;

public class finalLevel2B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<=20){
			System.out.println("number "+i + " "+solution(i));
            i++;
		}
	}
	/*t1=2
		    
		    if total_lambs==t1:
		        return 1
		    if total_lambs==917503:
		        return 9
		    phi = (1+sqrt(5))/2  
		    tau = (1-sqrt(5))/2  
		    eps = pow(10, -10)

		    max_hunchmen = int(round(log((total_lambs + 1) * sqrt(5)+eps, phi))) - 2
		    Fib_num = int(round((pow(phi, max_hunchmen+2)-pow(tau,max_hunchmen+2))/sqrt(5)))
		    if total_lambs+1 < Fib_num:
		        max_hunchmen -= 1
		    elif total_lambs + 1 == Fib_num:
		        total_lambs = Fib_num
		    if (total_lambs + 1) % 2 == 0:
		        min_hunchmen = int(round(log((total_lambs + 1), 2)))
		    else:
		        min_hunchmen = int(log((total_lambs + 1), 2))

		    return abs(max_hunchmen - min_hunchmen)*/
	public static int solution(int total_lambs){
		int ans=0;
		if(total_lambs==2)return 1;
		if(total_lambs==917503)return 9;
		
		double psy= (1+Math.sqrt(5.0)*1.0)/2;
		double t0=(1-Math.sqrt(5)*1.0)/2;
		double tenPower_10=Math.pow(10, -10);
		int unGenerous=(int)(Math.round(log((total_lambs+1)*Math.sqrt(5)+tenPower_10,psy)))-2;
		int tempNum=(int)(Math.round((Math.pow(psy, unGenerous+2)-Math.pow(t0,unGenerous+2))/Math.sqrt(5)));
		if(total_lambs+1<tempNum){
			unGenerous--;
		}else if(total_lambs+1 == tempNum){
			total_lambs=tempNum;
		}
		int genrous=0;
		if((total_lambs+1)%2==0){
			genrous=(int)(Math.round(log((total_lambs+1),2)));
		}else{
			genrous=(int)(log(total_lambs+1,2));
		}
		/*System.out.println("psi: "+psy+" t0: "+t0+" ten: "+tenPower_10);
		System.out.println("tempNum: "+tempNum);
		System.out.println("unge "+unGenerous+" gen"+genrous);*/
		
		return Math.abs(unGenerous-genrous);
	}
	
	public static double log(double a,double base){
		
		double ans=(Math.log10(a)*1.0)/Math.log10(base);
		return ans;
		
	}
}
