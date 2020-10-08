
public class BrailleCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String check="000001011110110010100010000000111110101001010100100100101000000000110000111010101010010111101110000000110100101010101101000000010110101001101100111100011100000000101010111001100010111010000000011110110010100010000000111000100000101011101111000000100110101010110110";
		
		if(solution("The quick brown fox jumps over the lazy dog").equals(check)){
			System.out.println("TRUE");
		}else{
			System.out.println("FALSE");
		}
		
	}
	 public static String solution(String s) {
	    	// Your code here
	    String brailleCode[]={"100000",
	"110000",
	"100100",
	"100110",
	"100010",
	"110100",
	"110110",
	"110010",
	"010100",
	"010110",
	"101000",
	"111000",
	"101100",
	"101110",
	"101010",
	"111100",
	"111110",
	"111010",
	"011100",
	"011110",
	"101001",
	"111001",
	"010111",
	"101101",
	"101111",
	"101011"
	};
	     StringBuilder sb=new StringBuilder();
	      char ch=' ';
		  int num=0;
	      for(int i=0;i<s.length();i++){
	          ch=s.charAt(i);
	          if(ch==' '){
	              sb.append("000000");
	          }else if(Character.isUpperCase(ch)){
	              sb.append("000001");
	              num=(int)ch-65;
	              sb.append(brailleCode[num]);
	          }else{
	              num=(int)ch-97;
	              sb.append(brailleCode[num]);
	          }
	      }
	    return sb.toString();	
	    

	

}

}
