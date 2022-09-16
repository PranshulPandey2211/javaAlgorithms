package searches;

public class JumpSearch{
	public static int search(int arr[], int key){
		int n = arr.length;
		int block = (int)Math.floor(Math.sqrt(n));
		int prev = 0;
		while (arr[Math.min(block, n)-1] < key){
			prev = block;
			block += (int)Math.floor(Math.sqrt(n));
			if (prev >= n)
				return -1;
		}
		while (arr[prev] < key){
			prev++;
			if (prev == Math.min(block, n))
				return -1;
		}
		if (arr[prev] == key)
			return prev;
		return -1;
	}
	public static void main(String[] args){
        int array[] = {12, 15, 23 , 34, 38, 45, 56, 67, 69, 78, 80, 85, 89, 90, 99};  
        int key = 78;   
        int index = search(array, key);  
        if (index == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+index);  
	}
}
