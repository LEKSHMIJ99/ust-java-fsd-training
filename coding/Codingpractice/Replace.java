package Codingpractice;

public class Replace {
	public static void main(String[] args) {
		String str="geeks for geeeks";
		int index=6;
		char ch='F';
	System.out.println("orginal string:" + str);
	str=str.substring(0,index) + ch + str.substring(index + 1);
	System.out.println("modified string is:" + str);
	}

}
