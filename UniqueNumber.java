package week1.day2;

import java.util.Arrays;

public class UniqueNumber {

	public static void main(String[] args) {
		
		int[] num = {2,2,1,5,4,5,4};
		
	
		for (int i = 0; i < num.length; i++) {
			
			int count =0;
			
			for (int j = 0; j < num.length; j++) {
				
				if(num[i]== num[j]) {
					count++;
				}
				
			}
			
			if(count == 1) {
				System.out.println(num[i]);
			}
		}
		
		

		

	}

}
