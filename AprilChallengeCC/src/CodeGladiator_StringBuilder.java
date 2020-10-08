package LongChallengeApril;

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CodeGladiator_StringBuilder {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while(t-->0){
            StringBuilder sbOdd=new StringBuilder();
            StringBuilder sbEven=new StringBuilder();
            int n=Integer.parseInt(br.readLine());
            long maxOdd=0,maxEven=0;
            StringTokenizer st=new StringTokenizer(br.readLine());
            for(int i=1;i<n+1;i++){
                int num=Integer.parseInt(st.nextToken());
                if(i%2!=0){
                     if(num>0){
                         maxOdd+=num;
                         sbOdd.insert(0,String.valueOf(num));
                     }
                }else{
                    if(num>0){
                        maxEven+=num;
                        sbEven.insert(0,String.valueOf(num));
                    }
                }
            }
            //System.out.println(sbEven.charAt(0)+" "+sbOdd.charAt(0));
            if(maxEven==maxOdd){
            	int minLength=Math.min(sbOdd.length(),sbEven.length());
            	
            	for(int k=0;k<minLength;k++){
            		
                if(sbEven.charAt(k)==sbOdd.charAt(k)){
                	continue;
                }
                if(sbEven.charAt(k)>sbOdd.charAt(k)){
                  System.out.println(sbEven);
                  break;
                }else{
                    System.out.println(sbOdd);
                    break;

                }
            	}
                
                
            }else{
                 if(maxEven>maxOdd){
                System.out.println(sbEven);
            }else{
                System.out.println(sbOdd);

            }

            }

        }

   }
}
