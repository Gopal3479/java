public class inheritance {
    public static void main(String[] args){

        A obj=new A();

        obj.num1=3;
        obj.num2=5;
        obj.add();
        System.out.println(obj.result);
        B obj2=new B();
        obj2.sub();
        System.out.println(obj2.result);



    }

  static class A{
        int num1,num2,result;
        public void add(){
            result=num1+num2;
        }
}
  static class B extends  A{
        public void sub(){
            result=num2-num1;
    }
}

}
