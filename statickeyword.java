package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schoolName="josjo";

        Student s2=new Student();
        System.out.println(s2.schoolName); //print josjo

        Student s3=new Student();
        s3.schoolName="jhm";
        System.out.println(s3.schoolName); //print jhm
    }
}
class Student {
    static int returnPercentage(int math, int phy, int chem) {
        return (math+phy+chem)/3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name=name;
    }
    String getName() {
        return this.name;
    }
}
