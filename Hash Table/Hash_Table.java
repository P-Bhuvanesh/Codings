import java.util.Arrays;

class Main {
    private int size = 10;
    private String[] keys;
    private String[] values;
    
    public Main() {
        keys = new String[size];
        values = new String[size];
    }
    
    // Hash function
    private int hashFunction(String key) {
        return key.hashCode() % size;
    }
    
    // Insert key-value pair into the hash table
    public void insert(String key, String value) { // key = "name", value = "Alice"
        int index = hashFunction(key);// index = 0
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                values[index] = value;  // Update value if key exists
                return;
            }
            index = (index + 1) % size;  // Linear probing
        }
        keys[index] = key;
        values[index] = value;
    }
    
    // Get the value associated with the key
    public String get(String key) {
        int index = hashFunction(key);
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                return values[index];
            }
            index = (index + 1) % size;  // Linear probing
        }
        return null;  // Key not found
    }
    
    // Display hash table contents
    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < size; i++) {
            if (keys[i] != null) {
                System.out.println("Index " + i + ": Key = " + keys[i] + ", Value = " + values[i]);
            } else {
                System.out.println("Index " + i + ": Empty");
            }
        }
    }
    
    public static void main(String[] args) {
        Main hashTable = new Main();
        
        // Insert key-value pairs
        hashTable.insert("name", "Alice");
        hashTable.insert("name", "Bharath");
        hashTable.insert("age", "30");
        hashTable.insert("city", "New York");
        
        // Retrieve values
        System.out.println("Name: " + hashTable.get("name"));  // Output: Bharath
        System.out.println("Age: " + hashTable.get("age"));    // Output: 30
        System.out.println("City: " + hashTable.get("city"));  // Output: New York
        
        // Display the hash table
        hashTable.display();
    }
}
