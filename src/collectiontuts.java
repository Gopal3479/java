import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collectiontuts {


    public static void main(String[] args) {
        List<Student> studs=new ArrayList<>();
        studs.add(new Student(1,50));
        studs.add(new Student(2,43));
        studs.add(new Student(3,42));
        studs.add(new Student(4,34));
        studs.add(new Student(5,41));

//        Collections.sort(studs,(s1,s2)->{
//            return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;});
        Collections.sort(studs);
    for(Student s:studs){
        System.out.println(s);
    }
    }
     static class Student implements Comparable<Student>
     {
         int roolno;
         int marks;

         public Student(int roolno, int marks) {
             this.roolno = roolno;
             this.marks = marks;
         }

         @Override
         public String toString() {
             return "Student{" +
                     "roolno=" + roolno +
                     ", marks=" + marks +
                     '}';
         }


         @Override
         public int compareTo(Student s) {
             return this.marks>s.marks?-1:this.marks<s.marks?1:0;
         }
     }





}
