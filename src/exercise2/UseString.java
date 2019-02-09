package exercise2;

public class UseString {



	public static void main(String[] args) {

		String sentence1 = "How we gonna use the String methods!";
		String sentence2 = " Are we going to use JAVA API";
		
		System.out.println(sentence1.toUpperCase()); 
		
		System.out.println(sentence2.toLowerCase()); 
		
		int len = sentence1.length();
		System.out.println("The number of characters in the String sentence is : "+len); 
		
		System.out.println(sentence1.charAt(9)); 
		
		System.out.println(sentence1.indexOf("H"));  
		
		System.out.println(sentence1.concat(sentence2)); 
		
		System.out.println(sentence1.contains("s")); 
		
		System.out.println(sentence2.equals("Dream")); 
		
		System.out.println(sentence2.equalsIgnoreCase("WE ARE GOING to use JAVA API")); 
		
		String [] array = sentence1.split(" ");
		for(String word:array) {
			System.out.println(word);
			
		}
		System.out.println(sentence1.substring(13));
		
		System.out.println(sentence1.replace("o", "z"));
		
		System.out.println(sentence1.compareTo(sentence2));
		if (sentence1.compareTo(sentence2) <0) {
			System.out.println("sentence1 comes 1 !");
		}else if (sentence1.compareTo(sentence2) >0) {
			System.out.println("sentence 2 comes first!");
		}else {
			System.out.println("the sentences are equl!");
		}
			
		String s1 = "world";
		String s2 = "WorldWebWide";
		
		if (s1.startsWith("world")) {
			System.out.println("The s1 starts with World");
		}
		if (s2.endsWith("Wide")) {
			System.out.println("the s2 ends with wide");
		}
	}

}
