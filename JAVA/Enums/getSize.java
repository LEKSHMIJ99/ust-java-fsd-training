package Enums;

enum Size6{
	SMALL,
	MEDIUM,
	LARGE,
	EXTRALARGE;
	


public String getSize() {
switch(this) {
case SMALL:
	return "SMALL";
	
case MEDIUM:
	return "medium";
case LARGE:
	return "large";
case EXTRALARGE:
	return "extra large";
	default:
		return null;
	
	
		
	}

}
public static void main(String[] args) {
	System.out.println("the size of the pizza is"+ Size.SMALL.getSize());
}
}
