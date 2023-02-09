package studio3;

public class Sieve {

	public static void main(String[] args) {
		int n= 39;
		boolean[] arr= new boolean[n];
			for(int i=0; i< n; i++) {
				arr[i]= true;
			}
				for(int i = 4; i<n;i=i+2) {
					arr[i]= false;
					
				}
				for(int i = 6; i<n;i=i+3) {
					arr[i]= false;
				}
				for(int i = 10; i<n;i=i+5) {
					arr[i]=false;
				}
			for(int i=0; i< n; i++) {
				System.out.println("index"+ i + ":"+ arr[i]);
				
			}
	} 
	

}