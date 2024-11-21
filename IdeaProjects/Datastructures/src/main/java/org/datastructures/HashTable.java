package org.datastructures;

import java.util.LinkedList;

import java.util.LinkedList;

// Node class to store key-value pairs in the linked list
class Node<K, V> {
    K key; // Key of the node
    V value; // Value of the node
    Node<K, V> next; // Pointer to the next node in the list (used for chaining)

    // Constructor to initialize a new node with key and value
    Node(K key, V value) {
        this.key = key;
        this.value = value;
        this.next = null; // Initially, no next node
    }
}

// HashTable class implementing chaining with rehashing
public class HashTable<K, V> {
    private LinkedList<Node<K, V>>[] buckets; // Array of linked lists (buckets)
    private int capacity; // Number of buckets in the hash table
    private int size; // Number of key-value pairs in the hash table
    private static final int INITIAL_CAPACITY = 5; // Initial capacity of the hash table
    private static final double LOAD_FACTOR_THRESHOLD = 0.75; // Load factor threshold for triggering rehashing

    // Constructor to initialize the hash table with default capacity
    @SuppressWarnings("unchecked")
    public HashTable() {
        this.capacity = INITIAL_CAPACITY; // Set initial capacity
        this.buckets = new LinkedList[capacity]; // Create array of linked lists
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>(); // Initialize each bucket as an empty linked list
        }
        this.size = 0; // Initialize size to 0
    }

    // Hash function to compute the index for a given key
    private int hash(K key) {
        // Compute index using hash code and modulo capacity
        // Use Math.abs to ensure index is non-negative
        return Math.abs(key.hashCode() % capacity);
    }

    // Method to insert or update key-value pairs in the hash table
    public void put(K key, V value) {
        // Check if rehashing is needed based on load factor
        if ((double) size / capacity > LOAD_FACTOR_THRESHOLD) {
            rehash(); // Trigger rehashing to resize and redistribute entries
        }

        int index = hash(key); // Compute the bucket index for the key
        LinkedList<Node<K, V>> bucket = buckets[index]; // Get the linked list at the computed index

        // Traverse the linked list to find if the key already exists
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                node.value = value; // Update the value if key already exists
                return; // Exit the method after updating
            }
        }
        // Add a new node to the linked list if key does not exist
        bucket.add(new Node<>(key, value));
        size++; // Increment the size of the hash table
    }

    // Method to retrieve the value associated with a given key
    public V get(K key) {
        int index = hash(key); // Compute the bucket index for the key
        LinkedList<Node<K, V>> bucket = buckets[index]; // Get the linked list at the computed index

        // Traverse the linked list to find the node with the given key
        for (Node<K, V> node : bucket) {
            if (node.key.equals(key)) {
                return node.value; // Return the value if key is found
            }
        }
        return null; // Return null if key is not found
    }

    // Method to trigger rehashing when the load factor exceeds the threshold
    private void rehash() {
        LinkedList<Node<K, V>>[] oldBuckets = buckets; // Save reference to the old bucket array
        capacity *= 2; // Double the capacity of the hash table
        buckets = new LinkedList[capacity]; // Create a new array of linked lists for the new capacity
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>(); // Initialize each new bucket as an empty linked list
        }
        size = 0; // Reset size to 0 for re-insertion

        // Reinsert all old entries into the new bucket array
        for (LinkedList<Node<K, V>> bucket : oldBuckets) {
            for (Node<K, V> node : bucket) {
                put(node.key, node.value); // Reinsert each key-value pair into the new buckets
            }
        }
    }

    // Main method to test the hash table implementation
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();

        // Insert key-value pairs into the hash table
        hashTable.put("Alice", 30);
        hashTable.put("Bob", 25);
        hashTable.put("Charlie", 40);

        // Update the value for an existing key
        hashTable.put("Alice", 35);

        // Retrieve and print values associated with keys
        System.out.println("Alice: " + hashTable.get("Alice")); // Should print 35
        System.out.println("Bob: " + hashTable.get("Bob")); // Should print 25
        System.out.println("Charlie: " + hashTable.get("Charlie")); // Should print 40

        // Add more elements to trigger rehashing
        for (int i = 0; i < 20; i++) {
            hashTable.put("Key" + i, i);
        }

        // Retrieve and print some values to check rehashing
        System.out.println("Key5: " + hashTable.get("Key5")); // Should print 5
    }
}
