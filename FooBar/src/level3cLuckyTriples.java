
public class level3cLuckyTriples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,2,3,4,5,6};
		System.out.println(solution(arr));

	}
	public static int solution(int[] l) {
        // Your code here
		int ans=0;
		int length=l.length;
		
		int totalDividings[]=new int[length]; 
		
		for( int i = 1; i < l.length-1; ++i)
	    {
	        for( int j = 0; j < i; ++j)
	        {
	            if( l[i] % l[j] == 0)
	                ++totalDividings[i];
	        }
	    }
		
		for( int i = 2; i < l.length; i++)
	    {
	        for( int j = 1; j < i; ++j)
	        {
	            if( l[i] % l[j] == 0)
	                ans += totalDividings[j];
	        }
	    }
		
		return ans;
    }
}
