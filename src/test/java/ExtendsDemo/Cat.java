package ExtendsDemo;

public class Cat extends Animal {
    void ablity(){
        System.out.println(this.name+" can catch mouse!");
    }

    public Cat() {
        super();
    }

    public Cat(String name, int age, double weight, double height) {
        super(name, age, weight, height);
    }

    @Override
    public String toString() {
        return "继承示例.Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
