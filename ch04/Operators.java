
public class Operators {

	public static void main(String[] args) {
		//Examples of compound assignment	
		int i = 5;
		i += 8;
		i -= 7;
		i *= 4;
		i /= 2;
		System.out.println(i);
		System.out.println("----------");
		
		//Examples of pre-increment and post-increment
		
		int a = 8;
		int b = a++;
		System.out.println("a: " + a + " b: " + b);
		b=++a;
		System.out.println("a: " + a + " b: " + b);
		System.out.println("----------");
		
		// Conditional operators and Short-Circuit evaluation examples
		
		boolean c = 5<4;
		boolean d = 8>3;
		 if(c & d)					//and operator
			 System.out.println("True!");
		 else
			 System.out.println("False");
		 
		if(d | c)					//or operator
			System.out.println("True!");
		else
			System.out.println("False");
		 
		if(d || c == true)					//or operator(short circuit)
			System.out.println("True!");
		else
			System.out.println("False");
		 
		 
	}
}
