import java.util.ArrayList;

public class ReverseArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);

        reverseAndPrint(arrayList);
    }

    // Function to reverse and print an ArrayList
    public static void reverseAndPrint(ArrayList<Integer> list) {
        int size = list.size();

        // Iterate through the ArrayList in reverse order
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println(); // Add a newline for better formatting
    }
}
