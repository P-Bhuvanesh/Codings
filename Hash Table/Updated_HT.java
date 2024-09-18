import java.util.Arrays;

class Main {
    private int size = 5; // Max size
    private String[] keys;
    private String[] values;
    
    public Main() {
        keys = new String[size];
        values = new String[size];
    }
    
    private int hashFunction(String key) {
        return key.hashCode() % size; // function for hashing
    }
    
    public void insert(String key, String value) {
        int index = hashFunction(key);
        System.out.println("Key :"+key+" is added to HT");
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                values[index] = value;
                return;
            }
            index = (index + 1) % size; // Linear probing
        }
        keys[index] = key;
        values[index] = value;
    }
    
    public String get(String key) {
        int index = hashFunction(key);
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                return values[index];
            }
            index = (index + 1) % size; // Linear Probing
        }
        return null;
    }
    
    public void delete(String key) {
        int index = hashFunction(key);
        while (keys[index] != null) {
            if (keys[index].equals(key)) {
                keys[index] = null;   // Set key to null
                values[index] = null; // Set value to null
                System.out.println("Key " + key + " deleted");
                return;
            }
            index = (index + 1) % size;
        }
        System.out.println("Key " + key + " not found");
    }
    
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
        hashTable.insert("name", "Bhuvanesh");
        hashTable.insert("age", "31");
        hashTable.insert("city", "TX");
        
        System.out.println("Value of key{name}: "+hashTable.get("name"));
        
        // Display the hash table
        hashTable.display();
        
        // Delete a key
        hashTable.delete("age");
        
        // Display the hash table again
        hashTable.display();
        
        // Try deleting a non-existent key
        hashTable.delete("age");
    }
}
