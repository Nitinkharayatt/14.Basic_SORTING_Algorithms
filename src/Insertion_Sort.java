import java.util.Arrays;
public class Insertion_Sort {

    public static void insertion(int num[]) {
        int n = num.length;

        for (int i=1; i<n; i++){
            int curr= num[i];
            int prev= i-1;
            // finding out correct position to insert
            while (prev >=0 && num[prev] > curr){
                num[prev+1]=num[prev];
                prev--;
            }
            /// insertion
            num[prev+1]=curr;
        }
    }
    public static void print(int num[]){
        for (int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    public static void main(String[] args) {
        int num[]={5,4,1,3,2};
        insertion(num);
        print(num);
    }
}
