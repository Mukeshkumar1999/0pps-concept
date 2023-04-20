// package Encapsulation;

class Person {
    private String name;
    private String phoneNo;
    private int age;
    private String color;

    Person(String name, String phoneNo, int age, String color) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.age = age;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void setphone(String phone) {
        this.phoneNo = phone;

    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setColor(String color) {
        this.color = color;

    }

    public void getName() {
        System.out.println("Person Name" + this.name);
    }

    public void getPhoneNo() {
        System.out.println("Person phoneNo" + this.phoneNo);
    }

    public void getAge() {
        System.out.println("Person Age" + this.age);
    }

    public void getColor() {
        System.out.println("Person Name" + this.color);
    }
}

public class privt {
    public static void main(String[] args) {
        Person p1 = new Person("Ganeshay", "7408842136", 25, "white");
        p1.setName("Rama");
        p1.getName();
        p1.getAge();
        p1.getPhoneNo();
        p1.getColor();
    }

}
