package Collectors;

import java.util.function.Predicate;


public class Predicatexample {
	public static void main(String[] args) {
		Predicate<Integer>checkOddEven=x->x%2==0;
		System.out.println("number 14 is even:"+ checkOddEven.test(14));
	}

}
