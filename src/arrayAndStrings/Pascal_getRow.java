package arrayAndStrings;

import java.util.ArrayList;
import java.util.List;

public class Pascal_getRow {
	
public static List<Double> getRow(Integer rowIndex) {
        List<List<Double>> dl = new ArrayList<List<Double>>();
          List<Double> pl = new ArrayList<>();
        
        for(int i=1;i<=rowIndex+1;i++){
            List<Double> al = new ArrayList<>();
            Double C=(double) 1;
        for(int j=1;j<=i;j++){
           al.add(C);
            C=C*(i-j)/j;
            
        }
            //System.out.println(al);
 
            dl.add(al);
        }
        
       return dl.get(rowIndex); 
    }

	
public List<Integer> getRow2(int rowIndex) {
    List<Integer> row = new ArrayList<>();
    for (int i = 0; i <= rowIndex; i++) {
        row.add(0, 1);
        for (int j = 1; j < i; j++) {
            row.set(j, row.get(j) + row.get(j + 1));
        }
    }
    return row;
}
public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getRow(30));
		
		String s = "hell worl";
		
	}

}
