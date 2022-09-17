package sorts;

public class HeapSort {
	public static void sort(int arr[]){
		int n = arr.length;
		for (int i = n / 2 - 1; 0 <= i; i--)
			heapify(arr, n, i);
		for (int i = n - 1; 0 < i; i--){
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;
			heapify(arr, i, 0);
		}
	}
	public static void heapify(int arr[], int n, int i){
		int largest = i;
		int l = 2*i+1;
		int r = 2*i+2;
		if (l < n && arr[l] > arr[largest])
			largest = l;
		if (r < n && arr[r] > arr[largest])
			largest = r;
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, n, largest);
		}
	}	
    public static void main(String[] args){
		int array[] = {13, 89, 32, 63, 23, 36};
		sort(array);
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}

