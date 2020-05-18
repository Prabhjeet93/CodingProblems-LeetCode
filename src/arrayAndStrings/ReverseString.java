package arrayAndStrings;

public class ReverseString {
	
	public static String Reverse(String str) {
		
		char[] ch= str.toCharArray();
		String rev = "";
		
		for(int i=ch.length-1;i>=0;i--) {
			 rev = rev+ch[i];
			
		}
		//str=rev;
		return rev;
		
	}
public static String Reverse2(String str) {
		
		
		String rev = "";
		
		for(int i=str.length()-1;i>=0;i--) {
			 rev = rev+str.charAt(i);
			
		}
	return rev;
		
	}

public static void revers3(String str) {
	
	String[] arr = str.split(" ");
	//arr
	String rev="";
	for(String sto:arr) {
		StringBuilder strg=new StringBuilder(sto);
		//strg.append(sto);
		rev=rev+" "+strg.reverse();
	}
	
	System.out.println("after reverse : "+rev);
	
	//return str;
	
}
public static int CharCount(String str) {
		
		 str=str.replaceAll("\\s", "");
		 
		 return str.length();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*System.out.println(Reverse("Selenium"));
System.out.println(Reverse2("Selenium"));
System.out.println(CharCount("Java is a programming Language"));
System.out.println(CharCount("Java is a Language"));*/
		
		revers3("Java is a programming Language");
	}

}
