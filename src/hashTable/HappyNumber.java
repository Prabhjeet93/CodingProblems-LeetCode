package hashTable;

public class HappyNumber {
	
	public int isHappy1(int num) {
        
		 int rem = 0, sum = 0;  
		          
		       
		        while(num > 0){  
		            rem = num%10;  
		            sum = sum + (rem*rem);  
		            num = num/10;  
		        }  
		        return sum;  
		    }  
		      
		    public boolean isHappy(int n) {  
		       
		        int result = n;  
		          
		        while(result != 1 && result != 4){  
		            result = isHappy1(result);  
		        } 
		        if(result == 1) {
		            return true; 
		        } 
		        else if(result == 4) { 
		            return false;}
		        else return false;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
