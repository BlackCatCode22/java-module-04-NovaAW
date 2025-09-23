import java.util.ArrayList;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        String[] friendsArray = {"John", "Chris", "Eric", "Luke"};


        System.out.println("Array size: " + friendsArray.length);


        System.out.println("Element at index 2 in array: " + friendsArray[2]);


        friendsArray[1] = "Michael";
        System.out.println("After setting element at index 1: " + friendsArray[1]);


        ArrayList<String> friendsArrayList = new ArrayList<>();
        friendsArrayList.add("Anna");
        friendsArrayList.add("Ben");
        friendsArrayList.add("Cathy");


        System.out.println("ArrayList size: " + friendsArrayList.size());


        System.out.println("Element at index 2 in ArrayList: " + friendsArrayList.get(2));


        friendsArrayList.set(0, "Diana");
        System.out.println("After setting element at index 0: " + friendsArrayList.get(0));
    }
}