package Codingpractice;
import java.text.DateFormat;
import java.util.Locale;
 class Date {
	public static void main(String[] args){
		Date Date_time=new Date();
		Locale England_time=new Locale("en","ch");
		DateFormat de=DateFormat.getDateInstance(DateFormat.FULL,England_time);
		System.out.println("The england format is:" + de.format(Date_time));
		Locale Italy_time=new Locale("it","ch");
		DateFormat di=DateFormat.getDateInstance(DateFormat.FULL,Italy_time);
		System.out.println("the italy format is:" + di.format(Date_time));
	}

}
