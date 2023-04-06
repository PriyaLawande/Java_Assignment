/*input1="abc2012345"  
  input2="abc2112660"
 input 3=4
here "abc**" refers to customer id.
12345 refers to last month eb reading and 12660 refers to this month eb reading
find the difference between two readings and multiply it by input3
ie., output=(12660-12345)*4*/
package AssSet3;

public class Q1 {

	public static void main(String[] args) {

		String s1 = "abc2012345";		// 12345
		String s2 = "abc2112660";       // 12660
		int i = 4;						// 4
										// (12660-12345)= (315)*4= 1260
		int a = Integer.parseInt(s1.substring(5, s1.length()));
		int b = Integer.parseInt(s2.substring(5, s2.length()));
		int c = Math.abs((b - a) * i);
		System.out.println(c);
	}

}
