import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Student s=new Student(1,"anjana Cheerla",new Date(1996-01-02),95);
		Student s1=new Student(2,"madhuri gamidi",new Date(1997-01-01),82);
		Student s2=new Student(3,"navya bolla",new Date(1997-01-17),91);
		Student s3=new Student(4,"geethu pasupuleti",new Date(1997-01-11),86);
		int a=s.getId();
		System.out.println(a);
		StudentGroup s4=new StudentGroup(4);
		Student[] stu={s,s1,s2,s3};
		s4.setStudents(stu);
		Student[] stu1=s4.getStudents();
		for(int i=0;i<stu1.length;i++)
		{
			System.out.println(stu1[i]);
		}
	}

}
