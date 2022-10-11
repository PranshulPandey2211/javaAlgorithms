package sorts;

public class OddEvenSort {
	public static void sort(int arr[], int n){
		boolean flag = false;
		while (!flag) {
			flag = true;
			int temp = 0;
			for (int i = 1; i < n - 1; i += 2) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag = false;
				}
			}
			for (int i = 0; i < n - 1; i += 2) {
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
					flag = false;
				}
			}
		}
	}
	public static void main(String[] args){
		int array[] = {41, 34, 12, 58, 75, 81, 35, 63};
		sort(array, array.length);
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}
