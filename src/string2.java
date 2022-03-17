public class string2
{
    public static void main(String[] args) {
        Student s1=new Student(11,"gopal");
        System.out.println(s1);


    }
}
class Student extends Object
{
    int roolnum;
    String sname;

    public Student(int roolnum, String sname)
    {
        this.roolnum = roolnum;
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roolnum=" + roolnum +
                ", sname='" + sname + '\'' +
                '}';
    }
}
