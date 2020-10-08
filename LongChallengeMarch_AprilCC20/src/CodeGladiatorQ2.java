import java.io.*;
import java.util.*;

public class CodeGladiatorQ2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      Reader scan=new Reader();
      int t=scan.nextInt();
      while(t-->0){
    	  int n=scan.nextInt();
    	  ArrayList<Long> arr=new ArrayList<>();
    	  long brr[]=new long[n];
    	  
    	  for(int j=0;j<n;j++){
    		  arr.add(scan.nextLong());
    	  }
    	  for(int j=0;j<n;j++){
    		  brr[j]=scan.nextLong();
    	  }
    	  
    	 Collections.sort(arr);
    	  
    	  int ans=0;
    	  
    	  for(int i=0;i<n;i++){
    		  int index=next(arr,brr[i]);
    		  if(index==-1){
    			  continue;
    		  }
    		  
    		 arr.remove(index);
    		 ans++;  		  
    		  
    		  
    		  
    	  }
    	  
    	  
    	 System.out.println(ans); 
    	  
      }
	}
	
	

	private static int next(ArrayList<Long> arr, long target)  
    {  
        int start = 0, end = arr.size() - 1;  
    
        int ans = -1;  
        while (start <= end) {  
            int mid = (start + end) / 2;  
    
            // Move to right side if target is  
            // greater.  
            if (arr.get(mid) <= target) {  
                start = mid + 1;  
            }else {  
                ans = mid;  
                end = mid - 1;  
            }  // Move left side.  
        }  
        return ans;  
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
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
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
