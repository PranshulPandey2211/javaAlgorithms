package searches;

public class TernarySearch {
	static int search(int arr[], int low, int n, int key){
		if (low <= n) {
			int mid1 = low+(n-low)/3;
			int mid2 = n-(n-low)/3;
			if (arr[mid1] == key) 
				return mid1;
			else if (arr[mid2] == key) 
				return mid2;
			else if (key < arr[mid1])
				return search(arr, low, mid1 - 1, key);
			else if (key > arr[mid2]) 
				return search(arr, mid2 + 1, n, key);
			else 
				return search(arr, mid1 + 1, mid2 - 1, key);
		}
		return -1;
	}
    public static void main(String[] args){
		int index, key, l = 0;
		int array[] = {12, 34, 46, 49, 74, 88};
		key = 49;
		index = search(array, l, array.length, key);
        if (index == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+index);  
	}
}
