package arrayAndStrings;

public class StringContainsSize {
	
	 public static int strStr(String haystack, String needle) {
		  int p=-1;
		   if(haystack==null || needle==null)    
	        return 0;
	 
	    if(needle.length() == 0)
	        return 0;
	        
		       else if(haystack.contains(needle)){
		        int j=0;
		             //  int q=0; 
	               int n = needle.length();
		              for(int i=0;i<haystack.length();i++){
		            	 String temp=haystack.substring(i,i+n);
	                      if(temp.equals(needle)){
	                          p=i;
	                          break;
	                      }
		       }
	               System.out.println(p);
		              
		        }
		        
				return p;
		        
		    }
		        
		    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(strStr("hello","ll"));
	}

}
