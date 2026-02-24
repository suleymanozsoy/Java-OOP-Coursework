public class HelloTest{
	
	public static void main(String[] args){
		Hello reference = new Hello();

		String answer = reference.sayHello("Ali");
		System.out.println(answer);
		String answer1 = reference.sayHello("");
		System.out.println(answer1);

	}


}