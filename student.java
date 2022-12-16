class Student1 {
    int roll;
    String name;
    String branch;
    double Marks1;
    double Marks2;
    double Marks3;

    public String strname() {
        return name;
    }

    public String disBranch() {
        return branch;
    }

    public double totalMarks() {
        return Marks1 + Marks2 + Marks3;
    }

    public String status() {
        if (totalMarks() > 33) {
            return "pass";
        } else {
            return " fail";
        }
    }

}

public class student {
    public static void main(String[] args) {
        Student1 s1 = new Student1();

        s1.name = "ganeshay";
        s1.roll = 01;
        s1.branch = "cs";
        s1.Marks1 = 10;
        s1.Marks2 = 7;
        s1.Marks3 = 8;

        System.out.println(s1.strname());
        System.out.println(s1.disBranch());
        System.out.println(s1.totalMarks());
        System.out.println(s1.status());
    }

}
