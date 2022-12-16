import java.util.*;

class student {
    private int rollNo;
    private String name;
    private String branch;
    private double marks1;
    private double marks2;
    private double marks3;

    // we can access all of the private data we can make inside the class create
    // getter and
    // setter
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public double getMarks() {
        return marks1 + marks2 + marks3;
    }

    public void setRollNo(int r) {
        rollNo = r;
    }

    public void setName(String n) {
        name = n;
    }

    public void setbranch(String b) {
        branch = b;
    }

    public void setmarks1(Double m1) {
        marks1 = m1;
    }

    public void setmarks2(Double m2) {
        marks2 = m2;
    }

    public void setmarks3(Double m3) {
        marks3 = m3;
    }

    public String getbranch() {
        return branch;
    }

    public String getStatus() {
        if (getMarks() > 35)
            return "pass";
        else
            return "fail";
    }
}

public class hiding {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        student s2 = new student();

        // hard-coding....

        // s2.setRollNo(01);
        // s2.setName("Ganeshay");
        // s2.setbranch("cs");
        // s2.setmarks1(3.5);
        // s2.setmarks2(4.8);
        // s2.setmarks3(8.9);

        // take the user input output....

        System.out.println("enter rollno");
        s2.setRollNo(scn.nextInt());
        System.out.println("enter name");
        s2.setName(scn.next());
        System.out.println("enter branch");
        s2.setbranch(scn.next());
        System.out.println("enter m1");
        s2.setmarks1(scn.nextDouble());
        System.out.println("enter m2");
        s2.setmarks2(scn.nextDouble());
        System.out.println("enter m3");
        s2.setmarks3(scn.nextDouble());

        System.out.println(s2.getRollNo());
        System.out.println(s2.getName());
        System.out.println(s2.getMarks());
        System.out.println(s2.getbranch());
        System.out.println(s2.getStatus());
    }
}
