/*22. Enter your name and return a string "print the title first and then comma and 
		then first letter of initial name.*/
package AssSet2;

import java.util.StringTokenizer;

public class Q22 {

	public static void main(String[] args) {
		
		String name="Priya Lawande";
		StringTokenizer st= new StringTokenizer(name," ");
		
		String FirstName=st.nextToken();
		String LastName=st.nextToken();
		
		StringBuffer sb=new StringBuffer(FirstName);
		StringBuffer newName=sb.append(',').append(LastName.charAt(0));
		System.out.println(newName);
				
	}

}
