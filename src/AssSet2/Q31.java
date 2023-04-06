/*input1="Rajasthan";
input2=2;
input3=5;
output=hts;*/
/*reverse string and take 2 to 5 index lettres*/
package AssSet2;

public class Q31 {

	public static void main(String[] args) {
					  
		
		 String input1 = "Rajasthan";
		 int input2 = 2;
		 int input3 = 5;
		 
		 StringBuffer sb = new StringBuffer(input1);
		 StringBuffer output = sb.reverse();
		 
		 String result = (String) output.subSequence(input2, input3);
		 System.out.println(result);
	}

}
