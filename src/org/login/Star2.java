package org.login;

public class Star2 {
	public static void main(String[] args) {
		int n=5;
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		for (int i = 1,p=1; i <=n;p++, i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(p+" ");
			}
			
		System.out.println();
		
	}
		
	for(int i=1,p=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(p++ +" ");
		}
		System.out.println();
	}
	for(int i=1;i<=n;i++) {
		for(int j=1,p=1;j<=i;j++) {
			System.out.print(p++ +" ");
		}
		System.out.println();
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 

		
	}
	for(int i=1;i<=n;i++) {
		
	int p=1;
		for(int j=1;j<=i;j++) {
			System.out.print(p++ +" ");
		}
		System.out.println();
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 

		 
	
	}
	
	for (int i = 1; i <=n; i++) {         
//		1 
//		1 2 
//		1 2 3 
//		1 2 3 4 
//		1 2 3 4 5 

		
		
		for (int j = 1,p=1; j <=i;p++, j++) {
			System.out.print(p+" ");
		}
		System.out.println();
	}
	
	
//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5 
//	1 
//	2 2 
//	3 3 3 
//	4 4 4 4 
//	5 5 5 5 5 
//	1 
//	2 3 
//	4 5 6 
//	7 8 9 10 
//	11 12 13 14 15 

	
	
	}

}
