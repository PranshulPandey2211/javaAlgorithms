package sorts;

public class InsertionSort {
    public static void sort(int arr[]){
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
    }
    public static void main(String args[]){
        int array[] = {23, 64, 26, 52, 12, 34, 93};
        sort(array);
        for (int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
    }
}
