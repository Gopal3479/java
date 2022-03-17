public class constructer {
    public static void main(String[] args) {
        abc obj=new abc(5);

    }
}

class abc{

    public abc(){
        System.out.println("no parameter ");
    }
    public abc(int i){
        System.out.println("single parameter "); //constructer overloading
    }
    public abc(int i,double j){
        System.out.println("2 parameters");
    }
}
