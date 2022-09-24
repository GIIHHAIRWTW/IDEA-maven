package TESTDEMO;

import org.junit.Test;

import java.util.HashMap;
import java.util.Set;


public class TestDemo {
    @Test
    public void test001() {
        int[] arr = new int[10];
        arr[9] = 666;
        for (int i : arr) {
            System.out.print(i + " ");
        }

    }

    @Test
    public void test002() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "风清扬");
        hm.put(2, "林青霞");
        hm.put(3, "张曼玉");
        hm.put(4, "明日香");
        System.out.println(hm);
        Set<Integer> keySet = hm.keySet();
        for (int key : keySet) {
            String value = hm.get(key);
            System.out.println(key+","+value);
        }
    }

    @Test
    public void test003() {
        class Student {
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }

        Student s1 = new Student();
        s1.setId(1);
        s1.setName("风清扬");
        System.out.println(s1);
    }
}
