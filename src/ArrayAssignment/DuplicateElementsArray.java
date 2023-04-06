/*Find duplicate elements in an array({"abc","def",mno","xyz","pqr","xyz","def"})*/

package ArrayAssignment;

public class DuplicateElementsArray {

	public static void main(String[] args) {
		
		String str[] = {"abc","def","mno","xyz","pqr","xyz","def"};
		System.out.println("Duplicate elements of an array:");
		for(int i=0;i<str.length;i++) 
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i]==str[j])
				{
					System.out.println(str[i]);
				}
			}
		}
	}

}
