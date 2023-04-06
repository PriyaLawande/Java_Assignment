/*23. Write a Program that accepts a string and removes the duplicate characters.*/
package AssSet2;

public class Q23 {

	public static void main(String[] args) {
		
		String str1 = "management";
		char[] ch = str1.toCharArray();
		String result="";
		
		for(char value:ch) {
			if(result.indexOf(value)==-1) {
				result=result+value;
			}
		}
		 System.out.println(result);
	}

}
