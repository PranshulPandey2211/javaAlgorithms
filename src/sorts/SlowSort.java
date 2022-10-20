package sorts;

public class SlowSort {
    public static void sort(int arr[], int left, int right){
        if (right <= left)
            return;
        int mid = (left + right) / 2;
        sort(arr, left, mid);
        sort(arr, mid + 1, right);
        if (arr[right] < arr[mid]){
            int temp = arr[right];
            arr[right] = arr[mid];
            arr[mid] = temp;
        }
        sort(arr, left, right - 1);
    }
    public static void main(String[] args){
        int array[] = {78, 12, 72, 34, 45, 88, 31};
        sort(array, 0, array.length - 1);
        for(int i = 0; i < array.length; ++i)
            System.out.print(array[i] + " ");
    }
}