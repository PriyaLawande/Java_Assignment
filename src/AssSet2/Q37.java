/*input:
    Search string s1="GeniusRajkumarDev";
    String s2="Raj";
    String s3="Dev";
   output:
        Return 1 if s2 comes before s3 in search string else return 2*/
package AssSet2;

public class Q37 {

	public static void main(String[] args) {

		String search = "GeniusRajkumarDev";
		String s2 = "Raj", s3 = "Dev";

		int n1 = search.indexOf(s2);
		int n2 = search.indexOf(s3);
		if (n1 < n2) {
			System.out.println("1");
		} else {
			System.out.println("2");
		}
	}

}
