package sorts;

public class QuickSort{
    public static void sort(int arr[], int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low - 1);
        for(int j = low; j <= high - 1; j++){
            if (arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int array[] = {61, 43, 98, 34, 72, 29};
        sort(array, 0, array.length - 1);
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
