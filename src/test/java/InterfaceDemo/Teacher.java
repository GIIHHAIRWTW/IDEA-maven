package InterfaceDemo;

public class Teacher extends Human implements Action{

    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println(this.age+"岁的"+this.name+"老师吃糖醋排骨");
    }

    @Override
    public void drink() {
        System.out.println(this.age+"岁的"+this.name+"老师喝羊奶");
    }

    @Override
    public void sleep() {
        System.out.println(this.age+"岁的"+this.name+"老师睡席梦思");
    }
}
