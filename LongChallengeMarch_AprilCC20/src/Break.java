import java.io.*;
import java.util.*;

public class Break {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Reader scan=new Reader();
		int t=scan.nextInt();
		int s=scan.nextInt();
		
		while(t-->0){
			int n=scan.nextInt();
			int chef[]=new int[n];
			int frnd[]=new int[n];
			
			for(int i=0;i<n;i++){
				chef[i]=scan.nextInt();
			}
			for(int i=0;i<n;i++){
				frnd[i]=scan.nextInt();
			}
			
			
			Arrays.parallelSort(chef);
			Arrays.parallelSort(frnd);
			
			HashSet<Integer> map=new HashSet<>();
			
			Boolean ans=true;
			
			for(int i=0;i<n;i++){
				
				if(i==0){
					if(frnd[i]<=chef[i]){
						ans=false;
						break;
					}
					map.add(frnd[i]);
					map.add(chef[i]);
					
				}else{
					
					
					if(frnd[i]<=chef[i]){
						ans=false;
						break;
					}else{
						if(map.contains(chef[i])==false){
							ans=false;
							break;
						}					
						map.add(frnd[i]);
						map.add(chef[i]);
											
					}
				}
				
				
				
				
				
				
			}
			
			if(ans){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
			
			
			
		}
		
		
		
		

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