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
		int a[]=new int[4];
		String[] st=new String[4];
		for(int i=0;i<4;i++)
		{
			if(i==0)
			{
				a[i]=s.getId();
				st[i]=s.getFullName();
			}
			else if(i==1)
			{
				a[i]=s1.getId();
				st[i]=s1.getFullName();
			}
			else if(i==2)
			{
				a[i]=s2.getId();
				st[i]=s2.getFullName();
			}
			else
			{
				a[i]=s3.getId();
				st[i]=s3.getFullName();
			}
		}
		for(int i=0;i<4;i++)
		{
			System.out.println(a[i]+","+st[i]);
		}
		StudentGroup s4=new StudentGroup(4);
		Student[] stu={s,s1,s2,s3};
		s4.setStudents(stu);
		Student[] stu1=s4.getStudents();
		
	}

}
