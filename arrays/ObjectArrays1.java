package arrays;

public class ObjectArrays1 {
    public static void sumArray(){
        int arr[]={12,23,433,44,54,63};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of array is="+sum);
    }
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        System.out.println(arr[2][2]);
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
    }
    sumArray();
}

}
