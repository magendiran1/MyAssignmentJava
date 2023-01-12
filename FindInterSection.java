package week1.day2;

public class FindInterSection {

	public static void main(String[] args) {
		
		int[] num1 = {1,2,3,4,5};
		int[] num2 = {6,7,8,9,5};
		
		for (int i = 0; i < num1.length; i++) {
			
			for (int j = 0; j < num2.length; j++) {
				
				if(num1[i] == num2[j]) {
					System.out.println("Both InterSection number is for Num1 is "+ num1[i]+" for Num2 is "+ num2[j]);
				}
			}
		}

	}

}
