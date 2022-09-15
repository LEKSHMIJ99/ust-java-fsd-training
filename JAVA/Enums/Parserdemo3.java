package Enums;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Parserdemo3 {


	public static void main(String[] args) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = "14/10/2020";
		LocalDate localDate = LocalDate.parse(date, formatter);
		System.out.println("Parsed local date: "+localDate);
		System.out.println("Formatted local date: "+formatter.format(localDate));

	}

}
