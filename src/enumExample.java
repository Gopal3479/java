enum Mobile{
    APPLE,GOOGLE,SAMSUNG;

}
public class enumExample {


    public static void main(String[] args) {
        System.out.println(Mobile.APPLE);
        Mobile m=Mobile.APPLE;
        switch (m){
            case APPLE:
                System.out.println("apple is good brand");
                break;
            case SAMSUNG:
                System.out.println("samsung is korean company");
                break;
            case GOOGLE:
                System.out.println("google is a big company");
                break;

        }


    }
}
