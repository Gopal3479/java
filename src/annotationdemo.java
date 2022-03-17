// marker annotation-which doesn't have any values
//single value annotation -it contains single value
//multi value annotation


import java.lang.annotation.*;


@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface  SmartPhone{
    String OS() default "linux";
    int Version() default 0;
}



@SmartPhone(OS="android",Version = 7 ) //now the values are override
class nokiaSeries
{
 String model;
 int size;

    public nokiaSeries(String model, int size) {
        this.model = model;
        this.size = size;
    }
}

public class annotationdemo {
    public static void main(String[] args) {
        nokiaSeries obj=new nokiaSeries("fire",5);
        System.out.println(obj.model);
        Class c =obj.getClass();
        Annotation an=c.getAnnotation(SmartPhone.class);
        SmartPhone s=(SmartPhone)an;
        System.out.println(s.OS());
        System.out.println(s.Version());



    }
}
