/*Square root calculation of 
   ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2))
   o/p should be rounded of to int;*/

package AssSet3;

public class Q20 {

	public static void main(String[] args) {
		
		int x1=2,x2=3,y1=4,y2=5;    //(int)((sqrt)(2+3)*(2+3))+(4+5)*(4+5)) 
									//=sqrt(25+81)= sqrt(106) = 10.2956 = 10
		
		int output=(int)(Math.sqrt(((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2)))); //sqrt is methos from math class
																		// which gives square root of given number is double
		System.out.println(output);
	}

}
