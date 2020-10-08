
public class level2_temp2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        int i=0;
		while(i<=20){
			System.out.println(i + " "+answer(i));
            i++;
		}
	}
	public static int answer(int total_lambs) 
    {
        int sum=1,a=1,b=1,temp,generous=0,stingy=1;
        while(true)
        {            
            sum+=b;
            if(sum>total_lambs)
                break;
            temp=b;
            b=a+b;
            a=temp;
            stingy++;
        }
        sum=0;
        a=1;
        while(true)
        {            
            sum+=a;
            if(sum>total_lambs)
                break;
            a=a*2;
            generous++;
        }
        sum-=a;
        if((total_lambs-sum)>=((a/2)+(a/4)))
            generous++;
        //System.out.println(stingy+" "+generous);
        return (stingy-generous);

        // Your code goes here.

    }

}
