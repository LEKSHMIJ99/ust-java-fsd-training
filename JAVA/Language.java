package Abstract_program;
abstract class Language {
	public void display() {
		System.out.println("this is java programming");
		
	}

}
class Main4 extends Language{
	public static void main(String[] args) {
		Main4 obj=new Main4();
		obj.display();
		
		
		
	}
}
