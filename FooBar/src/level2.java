
public class level2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={4,9};
		int ans[]=solution(arr);
        for(int i:ans){
        	System.out.print(i+" ");
        }
	}
	 public static int[] solution(int[] pegs) {
	        // Your code here
	        int pegNum=pegs.length;
	        int returnAnsIfNOt[]={-1,-1};
	        
	        if(pegNum<2){
    			//System.out.println("here1");

	        	return returnAnsIfNOt;
	        }
	        
	        boolean isEvenLength=pegNum%2==0;
	        long sum=isEvenLength?(-pegs[0]+pegs[pegNum-1]):(-pegs[0]-pegs[pegNum-1]);
	       // System.out.println(sum);
	        int minusOne=-1;
	        if(pegNum>2){
	        	for(int i=1;i<pegNum-1;i++){
	        		sum+=2*(Math.pow(minusOne,i+1))*pegs[i];
	        	}
	        }
	        //System.out.println(sum);
	        long r0=2*sum;
	        Fraction copyR0;
	        //System.out.println(copyRo);
	        if(isEvenLength){
	        	copyR0=new Fraction((int)r0, 3);
	        }else{
	        	copyR0=new Fraction((int)r0, 1);
	        }
	        //System.out.println("after "+copyRo);
	        
	        if((double)((1.0*copyR0.getNumerator())/copyR0.getDenominator())<2){
    			//System.out.println("here2 "+copyRo);
 	           return returnAnsIfNOt;
	        }
	        
	        
	        	Fraction radius=copyR0;
	        	
	        	for(int i=0;i<pegNum-2;i++){
	        		Fraction pegsi1=new Fraction(pegs[i+1],1);
	        		Fraction pegsi=new Fraction(pegs[i],1);

	        		Fraction tempRadius=pegsi1.subtract(pegsi);
	        		Fraction anotherRadius=tempRadius.subtract(radius);
	        		if((double)((anotherRadius.getNumerator()*1.0)/anotherRadius.getDenominator())<1 || (double)((radius.getNumerator()*1.0)/radius.getDenominator())<1 ){
	        			//System.out.println("here3");

	        			return returnAnsIfNOt;
	        		}else{
	        			radius=anotherRadius;
	        		}
	        		
	        	}
	        	
	      if(copyR0.getNumerator()%copyR0.getDenominator()==0){
	    	  copyR0.setNumerator(copyR0.getNumerator()/copyR0.getDenominator());
	    	  copyR0.setDenominator(1);
	      }
	      
	      int ans[]={copyR0.getNumerator(),copyR0.getDenominator()};
	      return ans;        
	        
	        
	    }

}
class Fraction
{
   // member variables
   private int numerator, denominator;  // stores the fraction data
  
   public Fraction(int numerator,int denominator)
   {
      this.numerator=numerator;
      this.denominator=denominator;
   }

  
   public int getNumerator()
   {
      return numerator;
   }

   public void setNumerator(int num)
   {
      numerator=num;
   }
  
   public int getDenominator()
   {
      return denominator;
   }

  
   public void setDenominator(int den)
   {
      denominator=den;
   }   
   public Fraction add(Fraction b)
   {
      // check preconditions
      if ((denominator == 0) || (b.denominator == 0))
         throw new IllegalArgumentException("invalid denominator");
      // find lowest common denominator
      int common = lcd(denominator, b.denominator);
      // convert fractions to lcd
      Fraction commonA = new Fraction(1,1);
      Fraction commonB = new Fraction(1,1);
      commonA = convert(common);
      commonB = b.convert(common);
      // create new fraction to return as sum
      Fraction sum = new Fraction(1,1);
      // calculate sum
      sum.numerator = commonA.numerator + commonB.numerator;
      sum.denominator = common;
      // reduce the resulting fraction
      sum = sum.reduce();
      return sum;
   }  
   public Fraction subtract(Fraction b)
   {
      // check preconditions
      if ((denominator == 0) || (b.denominator == 0))
         throw new IllegalArgumentException("invalid denominator");
      // find lowest common denominator
      int common = lcd(denominator, b.denominator);
      // convert fractions to lcd
      Fraction commonA = new Fraction(1,1);
      Fraction commonB = new Fraction(1,1);
      commonA = convert(common);
      commonB = b.convert(common);
      // create new fraction to return as difference
      Fraction diff = new Fraction(1,1);
      // calculate difference
      diff.numerator = commonA.numerator - commonB.numerator;
      diff.denominator = common;
      // reduce the resulting fraction
      diff = diff.reduce();
      return diff;
   }   
   public Fraction multiply(Fraction b)
   {
      // check preconditions
      if ((denominator == 0) || (b.denominator == 0))
         throw new IllegalArgumentException("invalid denominator");
      // create new fraction to return as product
      Fraction product = new Fraction(1,1);
      // calculate product
      product.numerator = numerator * b.numerator;
      product.denominator = denominator * b.denominator;
      // reduce the resulting fraction
      product = product.reduce();
      return product;
   }
   public Fraction divide(Fraction b)
   {
      // check preconditions
      if ((denominator == 0) || (b.numerator == 0))
         throw new IllegalArgumentException("invalid denominator");
      // create new fraction to return as result
      Fraction result = new Fraction(1,1);
      // calculate result
      result.numerator = numerator * b.denominator;
      result.denominator = denominator * b.numerator;
      // reduce the resulting fraction
      result = result.reduce();
      return result;
   }

   
  
  
   private int lcd(int denom1, int denom2)
   {
      int factor = denom1;
      while ((denom1 % denom2) != 0)
         denom1 += factor;
      return denom1;
   }  
   private int gcd(int denom1, int denom2)
   {
      int factor = denom2;
      while (denom2 != 0) {
         factor = denom2;
         denom2 = denom1 % denom2;
         denom1 = factor;
      }
      return denom1;
   }

   
   private Fraction convert(int common)
   {
      Fraction result = new Fraction(1,1);
      int factor = common / denominator;
      result.numerator = numerator * factor;
      result.denominator = common;
      return result;
   }

   
   private Fraction reduce()
   {
      Fraction result = new Fraction(1,1);
      int common = 0;
      // get absolute values for numerator and denominator
      int num = Math.abs(numerator);
      int den = Math.abs(denominator);
      // figure out which is less, numerator or denominator
      if (num > den)
         common = gcd(num, den);
      else if (num < den)
         common = gcd(den, num);
      else  // if both are the same, don't need to call gcd
         common = num;

      // set result based on common factor derived from gcd
      result.numerator = numerator / common;
      result.denominator = denominator / common;
      return result;
   }   

}
