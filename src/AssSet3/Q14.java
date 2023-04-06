/*for the given string display the middle 2 value, case satisfies only if string is of even length 
ip - java
op - av*/

package AssSet3;

public class Q14 {

	public static void main(String[] args) {
		
		String ip="java";
		String sub=null;
		if(ip.length() %2==0)
			sub=ip.substring((ip.length()/2)-1,(ip.length()/2)+1);
		System.out.println(sub);
	}

}
