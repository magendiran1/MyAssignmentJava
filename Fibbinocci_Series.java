package week1.day1;

public class Fibbinocci_Series {

	public static void main(String[] args) {

		// Printing Fibbinocci_series 11
		int total =11;
		int i = 0;
		int j = 1;
		int t=0;
		
		
		System.out.println(0);
		for (int j2 = 1; j2 <= total; j2++) {
			
			t=i+j;
			System.out.println(t);
			i=j;
			j=t;
			
				
				
		}

	}

}
