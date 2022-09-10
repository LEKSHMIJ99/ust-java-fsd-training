package Day5;

public class Test_9<T> {

	T obj;
	Test_9(T obj) {this.obj= obj;}
	public T getObject() {return this .obj;}
class Main_9{
	public void main(String[] args) {
		Test_9<Integer>iObj=new Test_9(15);
		System.out.println(iObj.getObject());
		Test_9<Integer> sObj = null;
		System.out.println(sObj.getObject());
		iObj=sObj;
	}
}
}



	

