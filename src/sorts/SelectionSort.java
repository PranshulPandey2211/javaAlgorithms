package sorts;

public class SelectionSort{
	public static void sort(int arr[]){
		for (int i = 0; i < arr.length - 1; i++){
			int min = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[min])
					min = j;
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
	public static void main(String[] args){
		int array[] = {25, 88, 42, 64, 12, 34};
		sort(array);
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}
