import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Scanner;

public  class Student {
	public static String grade;
	public static String name;
	
	public Student() {
		this.grade=grade;
		this.name=name;
	}

	public static String getGrade() {
		return grade;
	}

	public static void setGrade(String grade) {
		Student.grade = grade;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Student.name = name;
	}

	public static void main(String args[]) throws IOException{ 
		ArrayList<Student> students = new ArrayList<Student>();
		Student stu=new Student();
		Scanner sc=new Scanner(System.in);
		
		System.out.printf("班级：");
		stu.grade=sc.next();
		
		System.out.printf("姓名：");
		stu.name=sc.next();
		
		Student s = new Student();
        s.setGrade(grade);
        s.setName(name);
        students.add(s);
        
        File destPath = new File("C:\\Users\\DeLL\\Desktop\\学生信息.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(destPath));
        bw.write("班级\t");
        bw.write("姓名\t");
        
        bw.newLine();
        bw.flush();
		
        for (Student s1 : students) {
            String grade = s1.getGrade();
            String name = s1.getName();           
            
            bw.write(grade + "\t");
            bw.write(name + "\t");
            bw.newLine();
            bw.flush();
        }
        bw.close();
        
        ArrayList<poem> poem = new ArrayList<poem>();
		String fileName ="C:\\Users\\DeLL\\Desktop\\古诗.txt";
        FileReader fileReader = new FileReader(fileName);

        BufferedReader bufferedReader = new BufferedReader(fileReader);       
        
        String line =bufferedReader.readLine();
        
        StringBuffer sb = new StringBuffer();
		sb.append(line);
		int i;
		int j = 0;
		for (i = 7; i <= sb.length(); i += 8) {
			if (i == 7) {
				sb.insert(i, "，");
			} else if ((i - j) % 7 == 0 && (i - j) % 14 != 0) {
				sb.insert(i, "，");
			} else if ((i - j) % 14 == 0) {
				sb.insert(i, "。");
			}
			j = j + 1;
		}
		
		//System.out.println(sb);
		
		FileOutputStream student = new FileOutputStream("C:\\Users\\DeLL\\Desktop\\学生信息.txt");
		OutputStreamWriter os = new OutputStreamWriter(student,"UTF-8");
		BufferedWriter bw1 = new BufferedWriter(os);
		bw1.write("班级\t");
		bw1.write("姓名\t");
		bw1.newLine();
		bw1.flush();

		for (Student st : students) {
	
			String grade = st.getGrade();
			String name = st.getName();

			bw1.write(grade + "\t");
			bw1.write(name + "\t");
			bw1.newLine();
			bw1.flush();
		}
		bw1.newLine();
		bw1.append(sb.toString());
	
		bw1.close();

	}
	
		
		
	}
	
	


