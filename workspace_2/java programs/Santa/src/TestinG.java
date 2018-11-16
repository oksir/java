
public class TestinG {

	public static void main(String[] args) {
		System.out.println("Hai mama");
		
		String str1="How are You ?";
		String str2="Where are you?";
		String str3="Let's go for coffee?";
		String str4="Feel free .... buddys..!!";
		String str8="where Are you?";
		String str5,str6;
		int s5=str1.compareTo(str2);
		System.out.println(s5);
		
		System.out.println(str1.charAt(2));
		System.out.println(str2.codePointAt(2));
		System.out.println(str1.concat(str3));
		System.out.println(str1.contentEquals(str3));
		System.out.println(str1.endsWith("is"));
		System.out.println(str1.trim());
		System.out.println(str1.toLowerCase());
		System.out.println(str4.toUpperCase());
		System.out.println(str2.isEmpty());
		System.out.println(str2.replaceFirst("", ""));
		System.out.println(str1.indexOf("You"));
		System.out.println(str1.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str8));
		System.out.println(str1.lastIndexOf(3));
		System.out.println(str1.length());
		System.out.println(str4.matches("free"));
		System.out.println(str1.getBytes());
		System.out.println(str1.CASE_INSENSITIVE_ORDER);
	}

}


