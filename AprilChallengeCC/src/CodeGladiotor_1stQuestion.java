package LongChallengeApril;

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CodeGladiotor_1stQuestion {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            boolean bool=true;
            int n=Integer.parseInt(br.readLine());
            int villian[]=new int[n];
            int player[]=new int[n];
            StringTokenizer st=new StringTokenizer(br.readLine());
             StringTokenizer st1=new StringTokenizer(br.readLine());

            for(int i=0;i<n;i++){
                villian[i]=Integer.parseInt(st.nextToken());
                player[i]=Integer.parseInt(st1.nextToken());
            }
            Arrays.sort(villian);
            Arrays.sort(player);

            for(int i=0;i<n;i++){
                  if(villian[i]>player[i]){
                        bool = false;
                        break;
                  }
            }
            
           if(bool){
                System.out.println("WIN");
           }else{
               System.out.println("LOSE");
           }
        }

   }
}
