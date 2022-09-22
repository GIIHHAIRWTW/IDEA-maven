package InterfaceDemo;

import org.junit.Test;

public class TestDemo {
    @Test
    public void test() {
        Teacher t1 = new Teacher("风清扬",25);
        Student s1 = new Student("云飞扬",20);
        t1.eat();t1.drink();t1.sleep();
        s1.eat();s1.drink();s1.sleep();
    }
}
