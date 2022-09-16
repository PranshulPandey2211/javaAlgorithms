package sorts;

public class BubbleSort {
    static void sort(int arr[]){
        for(int i= 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int array[] = {52, 36, 82, 19, 25, 88};
        sort(array);
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
    }
}
