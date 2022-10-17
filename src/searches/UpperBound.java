package searches;

public class UpperBound {
	static int search(int arr[], int key){
		int upperBound = 0;
		while (upperBound < arr.length) {
			if (arr[upperBound] <= key)
				upperBound++;
			else{
				return upperBound;
			}	
		}
        return -1;
	}
	public static void main(String[] args){
		int array[] = {12, 34, 35, 35, 65, 67, 67, 67, 86, 88, 92, 96};
		int key = 67;
        int index = search(array, key);
        System.out.println("Element is found at index: "+index);  
	}
}