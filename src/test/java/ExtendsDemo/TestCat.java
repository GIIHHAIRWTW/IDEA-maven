package ExtendsDemo;

import org.junit.Test;

public class TestCat {
    @Test
    public void testcat() {
        Cat c1 = new Cat("Tom",3,6.0,25.0);
        Cat c2 = new Cat();
        c2.setName("加菲");
        c2.setAge(5);
        c2.setWeight(10.0);
        c2.setHeight(22.0);
        System.out.println(c1+"\n"+c2);
        c1.ablity();
        c2.ablity();
    }
}
