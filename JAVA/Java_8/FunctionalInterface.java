package Java_8;
interface sayable5{
	void say();}
	

public  class FunctionalInterface implements sayable5{
	public void say(String msg) {
		System.out.println(msg);
		
	}
	public static void main(String[] args) {
		FunctionalInterface file=new FunctionalInterface();
		file.say("hello there");
	}
	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}

}
