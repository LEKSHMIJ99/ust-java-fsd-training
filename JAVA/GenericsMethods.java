package Day5;

import java.lang.reflect.GenericArrayType;

public class GenericsMethods {
	public static<T>boolean isEqual(GenericArrayType g1,GenericsClass<T> g2){
		return  g1.get().equals( g2.get());
	}
	public static void main(String[] args(){
		GenericsClass GenericArrayTypeg1 = new GenericsClass<>();
		GenericsClass g2;
		g2.set("panka");
		GenericsClass GenericArrayTypeg2 = new GenericsClass<>();
		g2.set("panka");
		GenericArrayType g1;
		boolean isEqual= GenericsMethods.<String>isEqual(g1,g2);
		isEqual= GenericsMethods.isEqual(g1, g2);
	}
	

}
