package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exception_4 {
	public static void main(String[] args) {
		String line;
		try(BufferedReader br=new BufferedReader(new  FileReader("test.txt"))){
			while((line=br.readLine())!=null) {
				System.out.println("line=>"+line);
				
			}
		
	}catch (IOException e){
			System.out.println("IOException in try block=>"+  e.getMessage());
		}
	}
}

