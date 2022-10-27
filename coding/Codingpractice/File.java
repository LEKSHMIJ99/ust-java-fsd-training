package Codingpractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File {
	public static void main(String args[]) throws IOException {
		String sourcefile,destinationfile,line,content="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the source file:");
		sourcefile=sc.nextLine();
		
		FileReader fr=new FileReader(sourcefile);
		BufferedReader br=new BufferedReader(fr);
       for(line=br.readLine(); line!=null; line=br.readLine())
    	   content=content+line+"n/";
       System.out.print("Enter the Name of Destination File: ");
       destinationfile = sc.nextLine();
       
       
          FileWriter fw = new FileWriter(destinationfile);
          try {
			fw.write(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          fw.close();
          System.out.println("\nFile copied successfully!");
   
       
          System.out.println("\nSomething went wrong!");
          String in = null;
		System.out.println("Exception: " +in);
       
  
    
       System.out.println("\nSomething went wrong!");
       String ioe = null;
	System.out.print("Exception: " +ioe);
    }
 }
       
	 


