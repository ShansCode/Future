package org.datastructures;


import java.util.NoSuchElementException;

public class Heap {
    private int[] heap;     // Array to store heap elements
    private int size;       // Current number of elements in the heap
    private int maxSize;    // Maximum capacity of the heap

    // Constructor to initialize the heap with a given size
    public Heap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new int[maxSize + 1]; // +1 for 1-based indexing
        this.heap[0] = Integer.MAX_VALUE; // Sentinel value to simplify comparisons
    }

    // Get index of the left child of the node at index i
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // Get index of the right child of the node at index i
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // Get index of the parent of the node at index i
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Check if the node at index i is a leaf node
    private boolean isLeaf(int i) {
        return i >= (size / 2) && i <= size;
    }

    // Swap elements at indices i and j
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Insert a new value into the heap
    public void insert(int value) {
        if (size >= maxSize) throw new IllegalStateException("Heap is full");
        heap[++size] = value; // Place new value at the end of the heap
        int i = size;

        // Bubble up to restore heap property
        while (i > 0 && heap[i] > heap[parent(i)]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Delete the root of the heap
    public int delete() {
        if (size == 0) throw new NoSuchElementException("Heap is empty");

        int root = heap[1]; // The root value to return
        heap[1] = heap[size--]; // Replace root with the last element
        heapify(1); // Restore heap property

        return root;
    }

    // Heapify the subtree rooted at index i
    private void heapify(int i) {
        if (isLeaf(i)) return; // No need to heapify if the node is a leaf

        int leftChild = leftChild(i);
        int rightChild = rightChild(i);

        int largest = i;

        // Check if the left child is larger than the current node
        if (leftChild <= size && heap[leftChild] > heap[largest]) {
            largest = leftChild;
        }

        // Check if the right child is larger than the current largest
        if (rightChild <= size && heap[rightChild] > heap[largest]) {
            largest = rightChild;
        }

        // If the largest is not the current node, swap and heapify the affected subtree
        if (largest != i) {
            swap(i, largest);
            heapify(largest); // Recursively heapify the subtree
        }
    }

    // Main method to demonstrate the heap operations
    public static void main(String[] args) {
        // Create a heap with a maximum size of 15
        Heap heap = new Heap(15);

        // Insert some values into the heap
        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        heap.insert(15);

        // Print the heap array
        System.out.println("Heap array after inserts: ");
        for (int i = 1; i <= heap.size; i++) {
            System.out.print(heap.heap[i] + " ");
        }
        System.out.println();

        // Delete the root of the heap
        System.out.println("Deleted root: " + heap.delete());

        // Print the heap array after deletion
        System.out.println("Heap array after deletion: ");
        for (int i = 0; i <= heap.size; i++) {
            System.out.print(heap.heap[i] + " ");
        }
        System.out.println();
    }
}
