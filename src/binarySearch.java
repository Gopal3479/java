public class binarySearch {
    int binarySearch(int arr[],int l,int r,int x) {
        if (r >= 1) {
            int mid = (l + (r - 1)) / 2;


            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] > x) {
                return binarySearch(arr, l, r - 1, x);
            }
            return binarySearch(arr, l, r + 1, x);
        }
        return -1;
    }

    public static void main(String[] args){
        binarySearch bs=new binarySearch();
        int arr[]={2,4,5,6,8,9,21,23};
        int r= arr.length;
        int x=9;
        int result=bs.binarySearch(arr,0,r,9);
        if(result==-1){
            System.out.println("values is not found");
        }
        else{
            System.out.println("value is found at location "+result);
        }
    }
}

