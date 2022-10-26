package sorts;

public class CycleSort {
    static void sort(int arr[], int n){
        int item, pos, temp;
        for (int i = 0; i <= n-2; i++) {
            item = arr[i];
            pos = i;
            for (int j = i+1; j < n; j++){
                if (arr[j] < item)
                    pos++;
            }
            if (pos == i)
                continue;
            while (item == arr[pos]){
                pos += 1;
            }
            if (pos != i){
                temp = item;
                item = arr[pos];
                arr[pos] = temp;
            }
            while (pos != i){
                pos = i;
                for (int j = i+1; j < n; j++){
                    if (arr[j] < item)
                        pos += 1;
                }
                while (item == arr[pos]){
                    pos += 1;
                }
                if (item != arr[pos]){
                    temp = item;
                    item = arr[pos];
                    arr[pos] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        int array[] = {88, 35, 73, 12, 63, 37, 27};
        sort(array, array.length);
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i]+" ");
    }
}