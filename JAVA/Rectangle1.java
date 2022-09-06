package Abstract_program;
interface Polygon1{
	void getArea();
	default void getSides() {
		System.out.println("i can get sides of a polygon");
	}
}

 class Rectangle1 implements Polygon {
	 public void getArea() {
		 int length=6;
		 int bredth=5;int area=length*bredth;
		 System.out.println("the area of rectangle is" + area);
		 
	 }
	 public void getSides() {
		 System.out.println("i have 4 sides");
	 }
	@Override
	public void getArea(int length, int bredth) {
		// TODO Auto-generated method stub
		
	}

}
 class Square implements Polygon{
	 public void getArea() {
		 int length=6;
		 int area=length*length;
		 System.out.println("the area of square is" + area);
	 }

	@Override
	public void getArea(int length, int bredth) {
		// TODO Auto-generated method stub
		
	}
 }
 class Main3{
	 public static void main(String[] args) {
		 Rectangle1 r1 =new Rectangle1();
		 r1.getArea();
		 r1.getSides();
		 
		 
	 }
 }
	 

