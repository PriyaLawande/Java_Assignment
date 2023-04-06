/*String[] input1=["Vikas","Lokesh",Ashok] 
   expected output String: "Vikas,Lokesh,Ashok"*/

package AssSet3;

public class Q18 {

	public static void main(String[] args) {
		
		String input[] = { "Vikas", "Lokesh", "Ashok" };

		StringBuffer sb = new StringBuffer();

		sb.append(input[0]).append(',').append(input[1]).append(',').append(input[2]);
		
		System.out.println(sb.toString());

	}

}
