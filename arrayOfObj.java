import javax.management.remote.SubjectDelegationPermission;

class Subject {
    private String subId;
    private String subName;
    private int maxMarks;
    private double obtainMarks;

    public Subject(String id, String name, int maxMaks, double obtMarks) {
        this.subId = id;
        this.subName = name;
        this.maxMarks = maxMaks;
        this.obtainMarks = obtMarks;
    }

    public String getSubid() {
        return subId;
    }

    public String getsubName() {
        return subName;
    }

    public void setMaxMarks(int maxM) {
        maxMarks = maxM;
    }

    public void setObtain(double obtM) {
        obtainMarks = obtM;
    }

    public int getDisMaxM() {
        return maxMarks;
    }

    public double getObtM() {
        return obtainMarks;
    }

    public String disStatus() {
        if (getObtM() >= 33)
            return "pass";
        else
            return "fail";
    }

    public String toString() {
        return "\nsubId" + " " + subId + "\nsubname" + " " + subName + "\nmaxMarks" + " " + maxMarks + "\nobtainMarks"
                + " " + obtainMarks;
    }
}

public class arrayOfObj {
    public static void main(String[] args) {
        Subject[] sub = new Subject[3];
        sub[0] = new Subject("KNC-101", "DS", 100, 55);
        sub[1] = new Subject("KNC-401", "Algorithms", 100, 78);
        sub[2] = new Subject("KCS-402", "OS", 100, 90);

        for (Subject val : sub) {
            System.out.println(val + " ");
        }

        // System.out.println(sub[0].disStatus());

        sub[0].setObtain(55);
        System.out.println(sub[0].disStatus());
        // System.out.println(sub[0].getObtM());

    }
}
