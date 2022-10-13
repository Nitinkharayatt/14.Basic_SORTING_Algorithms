 import java.util.*;

 public class Bubble_Sort {
     public static void bubblesort(int num[]) {
         int n=num.length;

         for (int i = 0; i <=n-2 ; i++) {  // 0 to 3 [ 0,1,2,3 ]
            for (int j = 0; j <= n-2-i ; j++) {
                if (num[j] > num[j + 1]) {
                    // Swap
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    }
    public static void print( int num[]){
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }

    public static void main(String[] args) {
        int num[] = {5, 4, 1, 3, 2};

        bubblesort(num);
        print(num);

    }
}



     ////  ANOTHER APPROACH ::

//    public static void bubblesort(int num[]) {
//
//        for (int turn = 0; turn < num.length - 1; turn++) {
//            for (int j = 0; j < num.length - 1 - turn; j++) {
//                if (num[j] < num[j + 1]) {
//                    // Swap
//                    int temp = num[j];
//                    num[j] = num[j + 1];
//                    num[j + 1] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i] + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        int num[] = {5, 4, 1, 3, 2};
//        bubblesort(num);
//    }
// }
