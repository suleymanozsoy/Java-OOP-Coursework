public class Hello{
	String world = "guys";

	public String sayHello(String toWhom){
	String sentence;
	if(toWhom!=""){
		sentence = "Hey " + toWhom + ":)";
	}else{
		sentence = "Hey " + world + ":)";
	}

	return sentence;
	}
}