import java.lang.System;
public class encapsulationdemo
{

    public static void main(String[] args)
    {
        std e1=new std();
        e1.setStdId(3);
        e1.setStdName("gopal");
        std e2=new std();
        e2.setStdId(2);
        e2.setStdName("john");
        System.out.println(e1.getStdName());



    }




    static class std {
        private int stdId;
        private String stdName;


        public int getStdId() {
            return stdId;
        }

        public void setStdId(int stdId) {
            this.stdId = stdId;
        }

        public String getStdName() {
            return stdName;
        }

        public void setStdName(String stdName) {
            this.stdName = stdName;
        }
    }

}
