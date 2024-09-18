class HashTable:
    def __init__(self, size=5):
        self.size = size
        self.table = [[] for _ in range(size)]  # List of lists for chaining
    
    def _hash_function(self, key):
        """ Simple hash function: key mod table size """
        return hash(key) % self.size
    
    def insert(self, key, value):
        """ Inserts a key-value pair into the hash table """
        index = self._hash_function(key)
        # Check if the key already exists, if yes, update the value
        print(f"Added key:{key} to the HashTable")
        for pair in self.table[index]:
            if pair[0] == key:
                pair[1] = value
                return
        # Otherwise, append the new key-value pair used chaining i.e separate chaining -> linked list method to avoid collision.
        self.table[index].append([key, value])
    
    def get(self, key):
        """ Retrieves the value associated with the key """
        index = self._hash_function(key)
        for pair in self.table[index]:
            if pair[0] == key:
                return pair[1]
        return None  # Return None if the key is not found
    
    def display(self):
        """ Displays the hash table contents """
        for i, bucket in enumerate(self.table):
            print(f"Index {i}: {bucket}")

hash_table = HashTable()

hash_table.insert("Name", "Bhuvam")
hash_table.insert("Age", 20)
hash_table.insert("Degree", "B.Tech")
hash_table.insert("Specialization", "IT")
hash_table.insert("City", "CBE")

# Retrieve values
print("Specialization:", hash_table.get("Specialization")) 
print("City:", hash_table.get("city")) # keys are case-sensitive "City" differs from "city".

# Display hash table
hash_table.display()
