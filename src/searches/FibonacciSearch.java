package searches;

public class FibonacciSearch {
	public static int search(int arr[], int n, int x){
		int a = 1;
		int b = 0;
		int c = b + a;
		while (c < n) {
			b = a;
			a = c;
			c = b + a;
		}
		int offset = -1;
		while (c > 1) {
            int i;
            if (offset + b <= n - 1)
                i = offset + b;
            else
                i = n - 1;
			if (arr[i] < x) {
				c = a;
				a = b;
				b = c - a;
				offset = i;
			}
			else if (arr[i] > x) {
				c = b;
				a = a - b;
				b = c - a;
			}
			else
				return i;
		}
		if (a == 1 && arr[n-1] == x)
			return n-1;
		return -1;
	}
	public static void main(String[] args){
		int array[] = {12, 17, 34, 37, 47, 88, 91, 99};
		int key = 47;
	    int index = search(array, array.length, key);
        if (index == -1)  
            System.out.println("Element is not found!");  
        else  
            System.out.println("Element is found at index: "+index); 
	}
}
