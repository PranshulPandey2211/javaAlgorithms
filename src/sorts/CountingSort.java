package sorts;

public class CountingSort {
    public static int max(int arr[], int n) {
        int max = arr[0];
        for(int i = 1; i<n; i++) {
            if(arr[i] > max)
               max = arr[i];
        }
        return max;
    }
    public static void sort(int arr[], int n, int max){
        int count[] = new int [max+1];
        for (int i=0; i<=max; ++i)
            count[i] = 0;
        for (int i = 0; i < n; i++)
            count[arr[i]]++;
        for(int i = 1; i<=max; i++)
            count[i] += count[i-1];

        int output[] = new int [n+1];
        
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]]--;
        }
        for(int i = 0; i<n; i++)
            arr[i] = output[i];
    }
    public static void main(String args[]){
        int array[] = {23, 52, 73, 20, 12, 63};
        int max = max(array, array.length);
        sort(array, array.length, max);
        for(int i=0; i<array.length; i++)
            System.out.print(array[i]+" ");
    }  
}
