package searches;

public class BinarySearch{  
    public static int binarySearch(int arr[], int low, int high, int key){  
        if (low <= high){  
            int mid = low + (high - low)/2;  
            if (arr[mid] == key)
                return mid;  
            if (arr[mid] > key)
                return binarySearch(arr, low, mid-1, key);  
            else
            return binarySearch(arr, mid+1, high, key); 
        }  
        return -1;  
    }  
    public static void main(String[] args){  
        int array[] = {34, 45, 63, 72, 79, 82};  
        int key = 63;   
        int index = binarySearch(array, 0, array.length - 1, key);  
        if (index == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+index);  
    }  
}  