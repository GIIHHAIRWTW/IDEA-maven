package InterfaceDemo;

public class Student extends Human implements Action{

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.age+"岁的"+this.name+"学生吃馒头");
    }

    @Override
    public void drink() {
        System.out.println(this.age+"岁的"+this.name+"学生喝冰露");
    }

    @Override
    public void sleep() {
        System.out.println(this.age+"岁的"+this.name+"学生睡木板");
    }
}
