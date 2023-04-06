/*Email Validation 
   String input1="test@gmail.com"
                1)@ & . should be present;
                2)@ & . should not be repeated;
                3)there should be five charcters between @ and .;
                4)there should be atleast 3 characters before @ ;
                5)the end of mail id should be .com;*/

package AssSet3;

import java.util.StringTokenizer;

public class Q19 {

	public static void main(String[] args) {
		String input="test@gmail.com";
		
		boolean c=emailValidation(input);
		if(c==true) {
			System.out.println("Valid email id");
		}else {
			System.out.println("InValid email id");
		}
	}
	public static boolean emailValidation(String input) {
		int count=0;
		boolean b=true;
		StringTokenizer stk=new StringTokenizer(input,"@");
		String s1=stk.nextToken();
		String s2=stk.nextToken();
		
		StringTokenizer stk1=new StringTokenizer(s2,".");
		String s3=stk1.nextToken();
		String s4=stk1.nextToken();
		
		if(input.contains("@")&& input.contains("."))
			count++;
		
		if(count==1)
			if(s1.length()>=3)
				if(s3.length()==5)
				if(s4.equals("com"))
					b=true;
		
		return b;
	}

}
