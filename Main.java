import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		StudentGroup s4=new StudentGroup(4);
		Student[] stu=new Student[4];
		s4.setStudents(stu);
		Student[] stu1=s4.getStudents();
		for(int i=0;i<stu1.length;i++)
		{
			System.out.println(stu1[i]);
		}
	}

}
