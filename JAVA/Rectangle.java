package Abstract_program;
interface Polygon{
	void getArea(int length,int bredth);
}


   class Rectangle implements Polygon {
	   public void getArea(int length,int bredth) {
		   System.out.println("the area of the rectangle is"+(length*bredth));
	   }

}
   class Main8{
	   public static void main(String[] args) {
		   Rectangle r1=new Rectangle();
		   r1.getArea(5,6);
	   }
   }
