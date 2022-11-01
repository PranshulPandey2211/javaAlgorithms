package sorts;

public class ShellSort {
	public static int sort(int arr[], int n){
		for (int gap = n/2; gap > 0; gap /= 2){
			for (int i = gap; i < n; i++){
				int temp = arr[i];
				int j=i;
                while(j >= gap && arr[j - gap] > temp){
					arr[j] = arr[j - gap];
                    j -= gap;
                }
				arr[j] = temp;
			}
		}
		return 0;
	}
	public static void main(String args[]){
		int array[] = {65, 35, 23, 57, 88, 12};
        sort(array, array.length);
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
}