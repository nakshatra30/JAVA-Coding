import java.util.*;

public class StringArrayList {

    public static void main(String[] args) {

        // Declare an ArrayList of String
        ArrayList<String> list = new ArrayList<>();

        // add() -> Adds an element to the end of the ArrayList
        list.add("is");
        list.add("a");

        System.out.println("Add: " + list.add("very"));

        // addFirst() -> Adds an element to the beginning of the ArrayList
        list.addFirst("He");

        // addLast() -> Adds an element to the end of the ArrayList
        list.addLast("Good");
        list.addLast("boy");

        // set() -> Replaces an element at the specified index
        list.set(4, "Bad");

        // add(index, element) -> Inserts an element at the specified index
        list.add(2, "also");

        // Print the ArrayList
        System.out.println("Org List: " + list);

        // Find the number of elements in the ArrayList
        System.out.println("Size: " + list.size());

        // get(index) -> Retrieves an element from the specified index
        System.out.println("Second element: " + list.get(1));

        // Retrieve all elements using a for loop
        System.out.println("Using for loop to retrieve the list:");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        // Retrieve all elements using a for-each loop
        System.out.println("\nUsing for-each loop to retrieve the list:");

        for (String s : list) {
            System.out.println(s + " ");
        }

        // remove() -> Removes an element using its value
        list.remove("boy");

        // remove() -> Removes an element using its index
        list.remove(4);

        System.out.println(list);

        // Declare an ArrayList of Integer
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(3);
        nums.add(6);

        // Sort the elements in the ArrayList
        Collections.sort(nums);

        System.out.println(nums);
    }
}