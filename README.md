班级：计G202  
学号：2020322089  
姓名：石琬竹

# Java-5
Java实验项目

# 阅读程序  

## 一、实验目的
1.掌握字符串String及其方法的使用

2.掌握文件的读取/写入方法

3.掌握异常处理结构


## 二、实验过程  
1.打开eclipse 创建Java项目 Poetry

2.在Java项目中 创建1个包

3.在包中分别创建Student类

4.在Student类中定义年级，姓名

5.在桌面上创建学生信息和古诗的文档，学生文档用来储存输入的学生信息，古诗文档写入需要更正的古诗

6.使用if else语句进行古诗的标点的添加

7.最后结果显示在学生信息文档中


## 三、核心方法  
1.方法一
```
public static String grade;
	public static String name;
	
	public Student() {
		this.grade=grade;
		this.name=name;
	}
```
2.方法二
```
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
```
3.方法三
```   
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
```
4.方法四
```
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
```

5.方法五
```
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
```


## 四、实验结果  
```
班级	姓名	
计G202	石琬竹	

汉皇重色思倾国，御宇多年求不得。
杨家有女初长成，养在深闺人未识。
天生丽质难自弃，一朝选在君王侧。
回眸一笑百媚生，六宫粉黛无颜色。
春寒赐浴华清池，温泉水滑洗凝脂。
侍儿扶起娇无力，始是新承恩泽时。
云鬓花颜金步摇，芙蓉帐暖度春宵。
春宵苦短日高起，从此君王不早朝。
承欢侍宴无闲暇，春从春游夜专夜。
后宫佳丽三千人，三千宠爱在一身。
金屋妆成娇侍夜，玉楼宴罢醉和春。
姊妹弟兄皆列士，可怜光采生门户。
遂令天下父母心，不重生男重生女。
骊宫高处入青云，仙乐风飘处处闻。
缓歌慢舞凝丝竹，尽日君王看不足。
渔阳鼙鼓动地来，惊破霓裳羽衣曲。
九重城阙烟尘生，千乘万骑西南行。
<未完，待续>
、、、

## 五、实验感想  
通过本次实验，我基本掌握了字符串String及其方法的使用，掌握文件的读取/写入方法，掌握异常处理结构，
在这过程中虽然遇到的一些问题，但是通过同学的帮助和自己的努力使我顺利的完成了这次试验，同时也发现了自己对一些知识掌握不够，要继续努力。
