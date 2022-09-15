package searches;

public class LinearSearch{
    public static int search(int arr[], int key){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int array[] = {13, 54, 72, 38, 83, 9, 35};
        int key = 38;
        int index = search(array, key);
        if (index == -1)  
            System.out.println("Element is not found");  
        else  
            System.out.println("Element is found at index: "+index);  
    }
}
