package Sba;


import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<String>listName=new ArrayList<String>();
  Scanner sc=new Scanner(System.in);
while(sc.hasNext()) {
	String i=sc.next();
	listName.add(i);
}
System.out.println(listName);
listName.add("leo");
listName.add("suaraz");
listName.add("ineata");
listName.add("xavi");
listName.add("buffon");
listName.add("stegen");
listName.add("perdi");
listName.add("ramos");
listName.add("chilleni");
listName.add("puyol");
listName.add("zalton");
listName.add("gerizie");
listName.add("busiqustes");
listName.add("rshford");
listName.add("rooney");
listName.add("walker");
listName.add("stone");
listName.add("martinez");
listName.add("alexis");
listName.add("kessie");
ArrayList<Integer>listid=new ArrayList<Integer>();
int n=20;
int j=11;
for(int i=0; i<n;i++) {
	listid.add(j);
	j++;
}
ArrayList<String>listDepartment=new ArrayList<String>();
listDepartment.add("product");
listDepartment.add("delivery");
listDepartment.add("suppourt");
listDepartment.add("security");
listDepartment.add("product");
listDepartment.add("delivery");
listDepartment.add("suppourt");
listDepartment.add("security");
listDepartment.add("product");
listDepartment.add("delivery");
listDepartment.add("suppourt");
listDepartment.add("security");

listDepartment.add("product");
listDepartment.add("delivery");
listDepartment.add("suppourt");
listDepartment.add("security");
listDepartment.add("product");
listDepartment.add("delivery");
listDepartment.add("suppourt");
listDepartment.add("security");

System.out.println("names:"+ listName);
System.out.println("id:"+ listid);
System.out.println("department:"+ listDepartment);





























}
	
	}


