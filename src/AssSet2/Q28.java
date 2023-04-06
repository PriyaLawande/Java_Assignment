/*String encrption. replace the odd-index character with next character  
(if it is 'z' replace with 'a'..if 'a' with 'b' as such), 
leave the even index as such. return the encrypted string.*/
/*use ascii values*/
package AssSet2;

public class Q28 {

	public static void main(String[] args) {

		String s = "priyz";
		System.out.println(StringEncryption(s));
	}

	public static String StringEncryption(String s) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c % 2 != 0) {
				c = (char) (c + 1);
				sb.append(c);
			} else
				sb.append(c);
		}
		return sb.toString();
	}
}