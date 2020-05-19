package arrayAndStrings;

public class ReverseWordsinString {
	
public String reverseWords(String s) {
        
        String[] strarray=s.split(" ");
		StringBuilder op=new StringBuilder();
		
		for(int i=0;i<strarray.length;i++) {
			StringBuilder sb = new StringBuilder(strarray[i]);
			
		 op =op.append(" ").append(sb.reverse());
		}
		return op.toString().trim();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
