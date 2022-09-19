package searches;

public class ExponentialSearch{
    public static int search(int arr[], int n, int key){
		if (arr[0] == key)
			return 0;
		int i = 1;
		while (i < n && arr[i] <= key)
			i = i*2;
		return BinarySearch.binarySearch(arr, i/2, Math.min(i, n-1), key);
	}
	public static void main(String[] args){
		int array[] = {12, 24, 36, 74, 83, 88};
		int key = 74;
		int index = search(array, array.length, key);
        if (index == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+index); 
	}
}
