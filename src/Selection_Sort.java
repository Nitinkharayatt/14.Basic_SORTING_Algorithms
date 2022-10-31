public class Selection_Sort {

    public static void selection( int arr[]){
        int n=arr.length;

        for (int i=0;i<=n-2;i++){  // 0 to 3 [ 0,1,2,3 ]
            int min=i;
            for (int j=i+1;j<=n-1;j++){   // 1 to 4 [ 1,2,3,4 ]
                if (arr[min]>arr[j]){
                    min=j;
                }
            }
            //swap
            int temp=arr[min];
            arr[min]=arr [i];
            arr[i]=temp;
        }
    }

    public static void print(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selection(arr);
        print(arr);

    }

}