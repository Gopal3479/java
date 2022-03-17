public class array2 {
    public static void main(String[] args) {

        int n[][] = {{1, 2, 3, 4}, {3, 2, 1, 3}, {7, 4, 5, 3}};
//        for(int i=0;i<3;i++){
//            for(int j=0;j<4;j++){
//                System.out.print(n[i][j]+" ");
//            }
//            System.out.println("");
//        }

        for(int x[]:n){
            for(int j:x){
                System.out.print(j+" ");  //enhanced for loop
            }
            System.out.println("");

        }
    }

}

//for jagged array
//int i[][]=new int[3][];
//int i[1]=new int[2];     //for jagged array we need to special each row
//int i[2]=new int[4];
//int i[3]=new int[3];



