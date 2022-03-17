public class clonning {
    public static void main(String[] args) {
        xyz obj=new xyz();
        obj.i=5;
        obj.j=8;
//        xyz obj1=obj;   //shallow copying
//        obj1.i=6;

        xyz obj1=new xyz();
        obj1.i=obj.i;
        obj1.j=obj.j;  //deep copying
        obj1.i=6;
        System.out.println(obj);
        System.out.println(obj1);


    }
}

class xyz{
    int i;
    int j;

    @Override
    public String toString() {
        return "xyz{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}