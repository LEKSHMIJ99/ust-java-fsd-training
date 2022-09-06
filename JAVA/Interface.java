package Abstract_program;
interface Language1{
	void getName(String name);
}

class Interface implements Language1{
	public void getName(String name) {
		System.out.println("programming language:"+ name);
	}
	

}
class Main0{
	public static void main(String[] args) {
		Interface language=new Interface();
		language.getName("java");
	}
}
