public class binary_search {
    public static void main(String[] args) {
        int arr[] = { 89, 45, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12 ,23, 55};
        int key = 1;
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("Element found at index: " + mid);
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        } 
    }
} 