package arrayAndStrings;

public class CommonPrefix {
	 public static String longestCommonPrefix(String[] strs) {
	        
	        
	       String prefix = strs[0]; 
	        int n = strs.length;
	  if(n==0) {
		  return "";
	  }
	  else {
	        for (int i = 1; i <= n - 1; i++) { 
	           prefix = commonPrefix(prefix, strs[i]); 
	         } 
	            System.out.println("Prefix in main : "+prefix);
	        return (prefix);
	    }
	 }
	    static String commonPrefix(String str1, String str2) { 
	        String result = ""; 
	        int n1 = str1.length();
	        int n2 = str2.length(); 
	        System.out.println();
	  
	        // Compare str1 and str2  
	        for (int i = 0, j = 0; i <= n1 - 1 && j <= n2 - 1; i++, j++) { 
	            if (str1.charAt(i) != str2.charAt(j)) { 
	                break; 
	            } 
	            
	            result += str1.charAt(i); 
	            System.out.println("Result : "+result);
	        } 
	  
	        return (result); 
	    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"flow", "mlmc", "flew"};
		String res=longestCommonPrefix(str);
		System.out.println(res);

	}

}
