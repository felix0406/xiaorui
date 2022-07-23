package exercise5;

public class StudentTest {
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.setName("张三");
        stu1.setAge(20);
        stu1.show();
        Student stu2 = new Student("李四",18);
        stu2.show();
    }
}
