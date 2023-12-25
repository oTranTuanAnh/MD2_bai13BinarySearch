public class Main {

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int result = BinarySearch.binarySearch(arr, 79);
        int result1 = BinarySearch.binarySearch(arr, 15);
        int result2 = BinarySearch.binarySearch(arr, 50);
        int result3 = BinarySearch.binarySearch(arr, 2);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
