package Codingpractice;

public class Repeted {

	public static void main(String[] args) {
		int [] arr=new int [] {1,2,2,3,4,5,6,7,8,8};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) 
					System.out.println(arr[j]);
					
				}
				
				
			}
	}
}
		// TODO Auto-generated method stub

	

