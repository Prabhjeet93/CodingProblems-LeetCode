package arrayAndStrings;

public class ReverseString_Two_Pointer {
	
public void reverseString(char[] s) {
        
        int i=0;
        int j=s.length-1;
        
        while(i<j){
            char tmp = s[i];
            s[i]=s[j];
            s[j]=tmp;
            i++;
            j--;
        }
        
        for(char c:s){
        System.out.println(c);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
