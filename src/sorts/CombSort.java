package sorts;

public class CombSort {
    public static void sort(int arr[]){
        int n = arr.length;
        int gap = n;
        boolean flag = true;
        while (gap != 1 || flag == true){
            gap = (gap*10)/13;
            if(gap < 1)
                gap = 1;
            flag = false;
            for (int i = 0; i < n-gap; i++){
                if (arr[i] > arr[i+gap]){
                    int temp = arr[i];
                    arr[i] = arr[i+gap];
                    arr[i+gap] = temp;
                    flag = true;
                }
            }
        }
    }
    public static void main(String args[]){
        int array[] = {56, 85, 23, 57, 24, 12, 88, 91};
        sort(array);
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}