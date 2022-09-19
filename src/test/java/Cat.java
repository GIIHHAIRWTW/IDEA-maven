public class Cat extends Animal {
    void ablity(){
        System.out.println("I can catch mouse!");
    }

    public Cat() {
        super();
    }

    public Cat(String name, int age, double weight, double height) {
        super(name, age, weight, height);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
