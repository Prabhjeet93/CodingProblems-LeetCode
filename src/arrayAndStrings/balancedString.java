package arrayAndStrings;
import java.util.*;

public class balancedString {

	public int solution(String S) {
        //String tmp=null;
        
        for(int i=0;i<S.length();i++){
            for(int j=0;j<S.length()-i+1;j++){
                Set<Character> low= new HashSet<>();
                Set<Character> upper= new HashSet<>();
                
               String tmp=S.substring(j,j+i);
                char[] tmpchararr=tmp.toCharArray();
                for(char ch:tmpchararr){
                    if(Character.isLowerCase(ch)){
                        low.add(ch);
                    }
                    else{
                        upper.add(ch);
                    }
                    if(containsAllElements(low, upper) && containsAllElements(upper, low) ){
                        return tmp.length();
                    }
                }
            }
        }
        return -1;
    }
    
   public static boolean containsAllElements(Set<Character> first, Set<Character> last){
        Set<Character> low1= new HashSet<>();
        Set<Character> lower2= new HashSet<>();
        
        first.forEach((e)->{
            low1.add(Character.toLowerCase(e));
        });
        
        last.forEach((e)->{
            lower2.add(Character.toLowerCase(e));
        });
        
        return low1.containsAll(lower2);
    }
	}

/*Example test:   'azABaabza'
OK

Example test:   'TacoCat'
OK

Example test:   'AcZCbaBz'
WRONG ANSWER (got -1 expected 8)

Example test:   'abcdefghijklmnopqrstuvwxyz'
OK

Detected some errors.*/

