package Basic;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  ac= {35,89,53,67,36}; 
for(int i=0; i<=ac.length; i++) {
	
	System.out.println(ac[i]);
}
Arrays.sort(ac);
System.out.println(
        "Elements of array sorted in ascending order : "
        + Arrays.toString(ac));
	}

}

