package arrays;

public class NearestIntegerPalindrome {
	 public static int findClosestPalindrome(int x) {
		    if (x < 0) {
		        return -1;
		    }
		    //special case: 100 -> 99 palindrome is closest
		    if (x != 1 && isPower10(x)) {
		        return x - 1;
		    }
		    String value = x + "";
		    System.out.println("value : "+value);
		    int inputLength = value.length();
		    //first half
		    String first1 = value.substring(0, ((inputLength + 1) / 2));
		    System.out.println("first1 : "+first1);
		    int palindrome1 = Integer.parseInt(reflect(first1, inputLength / 2));
		    System.out.println("palindrome1 : "+palindrome1);

		    //if the "lower" palindrome is found, increase by 1 or if the "higher" palindrome is found, decrease by 1
		    int twiddleDirection = palindrome1 <= x ? 1 : -1;
		    System.out.println("twiddleDirection : "+twiddleDirection);
		    String first2 = (Integer.parseInt(first1)  + twiddleDirection) + "";
		    System.out.println("first2 : "+first2);
		    int palindrome2 = Integer.parseInt(reflect(first2, inputLength / 2));
		    System.out.println("palindrome2 : "+palindrome2);

		    //if palindrome2 has more of a distance than palindrome1, return palindrome1 (smallest)
		    return Math.abs(x - palindrome1) <= Math.abs(palindrome2 - x) ? palindrome1 : palindrome2;
		  }
		   public static String reflect(String left, int n) {
		        String reverse = new StringBuilder(left.substring(0, n)).reverse().toString();
		        String op = left + reverse;
		        System.out.println("op : "+op);
		        return op;
		    }
		    public static boolean isPower10(int x) {
		        while (x > 9 && x % 10 == 0)
		            x /= 10;
		        return x == 1;
		    }
		  public static void main(String[] args) {
		       /* System.out.println(findClosestPalindrome(0));
		        System.out.println(findClosestPalindrome(1));
		        System.out.println(findClosestPalindrome(6));
		        System.out.println(findClosestPalindrome(9));
		        System.out.println(findClosestPalindrome(10));
		        System.out.println(findClosestPalindrome(11));
		        System.out.println(findClosestPalindrome(12));
		        System.out.println(findClosestPalindrome(71));
		        System.out.println(findClosestPalindrome(74));
		        System.out.println(findClosestPalindrome(79));
		        System.out.println(findClosestPalindrome(99));
		        System.out.println(findClosestPalindrome(100));
		        System.out.println(findClosestPalindrome(101));
		        System.out.println(findClosestPalindrome(999));*/
		        System.out.println(findClosestPalindrome(1993));
		        /*System.out.println(findClosestPalindrome(1999));
		        System.out.println(findClosestPalindrome(9900));
		        System.out.println(findClosestPalindrome(999000));*/
		  }

}
