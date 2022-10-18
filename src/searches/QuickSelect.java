package searches;

public class QuickSelect {
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
	public static int kthSmallest(int arr[], int low, int high, int k){
		int partition = partition(arr, low, high);
		if (partition == k - 1)
			return arr[partition];
		else if (partition < k - 1)
			return kthSmallest(arr, partition + 1, high, k);
		else
			return kthSmallest(arr, low, partition - 1, k);
	}
	public static void main(String[] args){
		int[] array = new int[] {12, 32, 34 , 14, 85, 56, 25, 88, 19};
		int k = 3;
        System.out.print(kthSmallest(array, 0, array.length - 1, k) + " is the k-th smallest element");
	}
}