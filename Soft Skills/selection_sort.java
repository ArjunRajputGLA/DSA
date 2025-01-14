public class selection_sort{
    public static void main(String[] args){
        int arr[] = {4,5,3,2,1};
        for(int i = 0; i<arr.length; i++){ 
            int min = i;
            for(int j = i+1; j<arr.length; j++){  // index updation until the index for the smallest element is found for 1 iteration in the array
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}  