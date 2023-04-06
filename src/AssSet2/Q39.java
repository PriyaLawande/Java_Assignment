/*intput="xyzwabcd"   
    intput2=2;
    input3=4;*/

package AssSet2;

public class Q39 {

	public static void main(String[] args) {
								   //{0	1 2 3 4 5 6 7
		String input = "xyzwabcd"; // d c b a w z y x    

		int input2 = 2;				//2+4=6 
		int input3 = 4;

		StringBuffer sb = new StringBuffer(input);
		sb.reverse();

		String result = sb.substring(input2, input2 + input3);
		System.out.println(result);
	}

}
