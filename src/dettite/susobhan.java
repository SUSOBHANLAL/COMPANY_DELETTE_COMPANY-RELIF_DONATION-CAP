package dettite;

public class susobhan {
	public static void main(String [] args) {
		
		
		int arr[] = {7,3,6,4,8,9};
		
		int n = arr.length;
		int total =0;
		for(int i=0;i<n;i++) {
			 total += arr[i];
		}
		
		for(int k=0;k<n ;k++) {
			int sum = total-arr[k];
			System.out.print("the output will be"+sum);
			System.out.println();	
		}
	}

}
