package exercise5;

public class Student {
    private String name;
    private int age;
    public Student(){
    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("学生姓名为：" + this.name + "年龄为：" +this.age);
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}
