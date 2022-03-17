public class prime {
    public static void main(String[] args){
        int num=3;
        boolean value=true;

        for(int i=2;i<num;i++) {
            if (num % i == 0) {
                value = false;
                break;
            }
        }
            if(value){
                System.out.println("prime number");

            }
            else{
                System.out.println("not a prime ");
            }

    }
}
