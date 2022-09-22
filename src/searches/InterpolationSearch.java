package searches;

public class InterpolationSearch {
	public static int search(int arr[], int low, int high, int x){
		int pos;
		if (low <= high && x >= arr[low] && x <= arr[high]) {
			pos = low+ (((high - low) / (arr[high] - arr[low]))* (x - arr[low]));
			if (arr[pos] == x)
				return pos;
			if (arr[pos] < x)
				return search(arr, pos + 1, high, x);
			if (arr[pos] > x)
				return search(arr, low, pos - 1, x);
		}
		return -1;
	}
	public static void main(String[] args){
        int array[] = {12, 19, 25, 28, 35, 39, 45, 49, 51, 55, 63, 63, 70, 88, 90};  
        int key = 49;   
        int index = search(array, 0, array.length-1, key);  
        if (index == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+index); 
    }
}
