package arrayAndStrings;

public class ReverseWords {
	
	 public static String reverseWords(String s) {
	        
	        String[] str = s.split("\\s");
	       StringBuilder sb = new StringBuilder();
		for (int i = str.length - 1; i >= 0; --i) {
			if (!str[i].equals("")) {
				sb.append(str[i]).append(" ");
			}
		}
		return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
	    }
	
	public static String reverseWords2(String s) {
        
	        String[] str = s.split("\\s");
	        
	        String st = "";
	       for(int i=str.length-1;i>=0;i--) {
	            
	    	    st  = st+" "+str[i];
	            
	            
	        }
	        //System.out.println(sb);
	        //String st = Arrays.toString(str);
	      //  st = "["+st+"]";
	            
	  return st;
	    }
	
	public static void main(String[] args) {
System.out.println("Main : "+reverseWords("Hell world welcome"));
	}

}
