package searches;

public class LowerBound {
	static int search(int array[], int key){
    	int lowerBound = 0;
		while (lowerBound < array.length) {
			if (key > array[lowerBound])
				lowerBound++;
			else
				return lowerBound;
		}
		return lowerBound;
	}
	public static void main(String[] args){
		int array[] = {12, 34, 45, 45, 56, 59, 59, 68, 88, 94};
		int key = 59;
        int index = search(array, key);
        System.out.println("Element is found at index: "+index);  
	}
}
