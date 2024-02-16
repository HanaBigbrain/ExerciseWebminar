package Exercise;
public class DeleteFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int elementToDelete = 3; // Element to delete

        // Find the index of the element to delete
        int indexToDelete = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementToDelete) {
                indexToDelete = i;
                break;
            }
        }

        // If the element exists, perform deletion
        if (indexToDelete != -1) {
            // Shift elements to the left
            for (int i = indexToDelete; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            // Resize the array
            int[] newArray = new int[array.length - 1];
            System.arraycopy(array, 0, newArray, 0, array.length - 1);
            // Print the new array
            System.out.print("New Array: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
