import module java.base;

public class Maps {
    void main() {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("John", 12345);
        empIds.put("Carl", 54321);
        empIds.put("Jerry", 8675309);

        {
            IO.println(empIds);

            IO.println(empIds);
            empIds.get("Carl");

            System.out.println();(empIds.containsKey("George"));

            IO.println(empIds.containsKey(8675309));

            empIds.put("John", 98765);
            IO.println(empIds);


        }
        {
        }
    }
}