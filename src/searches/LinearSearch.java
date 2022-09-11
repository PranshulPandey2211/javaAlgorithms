package searches;

public class LinearSearch {
    public static int search(int arr[], int key){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[] = {13, 54, 72, 38, 83, 9, 35};
        int key = 38;
        int index = search(arr, key);
        System.out.println(key+" found at index: "+ index);
    }
}
