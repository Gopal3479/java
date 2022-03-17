public class demoexception1
{
    public static void main(String[] args) {
        int i=5;
        try{
            if(i<10){
                throw new myexception("error");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class myexception extends Exception{
    public myexception(String msg){
        super(msg);
    }
}
