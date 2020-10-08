import java.io.*;
import java.util.*;

public class XORmint {
	
	//public static HashMap<Long,Boolean> map=new HashMap<>();
	
	
	
	public static int findParity(int x) 
	{ 
	    int y = x ^ (x >> 1); 
	    y = y ^ (y >> 2); 
	    y = y ^ (y >> 4); 
	    y = y ^ (y >> 8); 
	    y = y ^ (y >> 16); 
	  
	    // Rightmost bit of y holds the parity value 
	    // if (y&1) is 1 then parity is odd else even 
	    if ((y & 1)==1) 
	        return 1; 
	    return 0; 
	} 
		
	 public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
	        
			//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		
			Reader scan=new Reader();
			//PrintWriter out=new PrintWriter(System.out);
			BufferedWriter out=new BufferedWriter(new OutputStreamWriter(System.out));
		//	initialize();
			int t=scan.nextInt();
			while(t-->0){
				int n=scan.nextInt();
				int q=scan.nextInt();
				
				int arr[]=new int[n];
				
				for(int i=0;i<n;i++){
					arr[i]=scan.nextInt();
				}
				int evenNums=0,oddNums=0;
				for(int i=0;i<n;i++){
				    if(findParity(arr[i])==0){
				        evenNums++;
				    }
				}
				oddNums=n-evenNums;
				
				while(q-->0){
					int p=scan.nextInt();
					int pParity=findParity(p);
				    int ans;    
				     if(pParity==1){
				         ans=oddNums;
				     }else{
				         ans=evenNums;
				     }
					
					out.append(ans+" "+(n-ans)+"\n");
					
					
				}
				
			
			}
			out.flush();
			scan.close();
		    
			out.close();
		}	
		
		 static class Reader 
		    { 
		        final private int BUFFER_SIZE = 1 << 16; 
		        private DataInputStream din; 
		        private byte[] buffer; 
		        private int bufferPointer, bytesRead; 
		  
		        public Reader() 
		        { 
		            din = new DataInputStream(System.in); 
		            buffer = new byte[BUFFER_SIZE]; 
		            bufferPointer = bytesRead = 0; 
		        } 
		  
		        public Reader(String file_name) throws IOException 
		        { 
		            din = new DataInputStream(new FileInputStream(file_name)); 
		            buffer = new byte[BUFFER_SIZE]; 
		            bufferPointer = bytesRead = 0; 
		        } 
		  
		        public String readLine() throws IOException 
		        { 
		            byte[] buf = new byte[64]; // line length 
		            int cnt = 0, c; 
		            while ((c = read()) != -1) 
		            { 
		                if (c == '\n') 
		                    break; 
		                buf[cnt++] = (byte) c; 
		            } 
		            return new String(buf, 0, cnt); 
		        } 
		  
		        public int nextInt() throws IOException 
		        { 
		            int ret = 0; 
		            byte c = read(); 
		            while (c <= ' ') 
		                c = read(); 
		            boolean neg = (c == '-'); 
		            if (neg) 
		                c = read(); 
		            do
		            { 
		                ret = ret * 10 + c - '0'; 
		            }  while ((c = read()) >= '0' && c <= '9'); 
		  
		            if (neg) 
		                return -ret; 
		            return ret; 
		        } 	        
		  
		        private void fillBuffer() throws IOException 
		        { 
		            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
		            if (bytesRead == -1) 
		                buffer[0] = -1; 
		        } 
		  
		        private byte read() throws IOException 
		        { 
		            if (bufferPointer == bytesRead) 
		                fillBuffer(); 
		            return buffer[bufferPointer++]; 
		        } 
		  
		        public void close() throws IOException 
		        { 
		            if (din == null) 
		                return; 
		            din.close(); 
		        } 
		    }
		
		
		

	}