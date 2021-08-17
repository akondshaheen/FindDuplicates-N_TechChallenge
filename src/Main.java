public class Main {
    public static void printRepeating(int arr[], int size) {

        System.out.println("Repeating elements are: ");

        for (int i = 0; i < size; i++) {
            int index = Math.abs(arr[i])-1;

            if (arr[index] < 0)
                System.out.print((index + 1) + " ");
            arr[index] = -arr[index];
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 1, 3, 6, 6, 2};
        int arr_size = arr.length;

        printRepeating(arr, arr_size);
    }
}
