package com.adepuu.exercises.session11;

public class Stack {
    /**
     * Write a Java stack program that can scale dynamically
     * <p>
     * As a developer, I want to implement a Java stack program that can scale dynamically using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
     * Notes:
     * The program doesn't require a menu system; focus should be on data structure implementation.
     * <p>
     * Acceptance Criteria:
     * - Functionality: The program must be able to perform basic stack operations (push, pop, peek) on a linked list.
     * - Dynamic Scaling: The stack should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
     * - Performance: The program should maintain constant time complexity for push and pop operations, ensuring efficient data management.
     * - Memory Efficiency: The stack should use memory efficiently, allocating and deallocating memory dynamically as needed.
     * - Error Handling: The program should handle edge cases gracefully, such as attempting to pop an element from an empty stack, and provide clear error messages.
     */
    public static void main(String[] args) {
        StackLL<Integer> stackstackan = new StackLL<>();

        stackstackan.push(15);
        stackstackan.push(10);
        stackstackan.push(12);
        int popped = stackstackan.pop();

        stackstackan.printList();
        System.out.println(popped);
        System.out.println(stackstackan.peek());

    }

}

class Node<T> {
    T data;
    Node<T> next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
}

class StackLL<T>{
    private Node<T> head;
    private Node<T> tail;

    StackLL(){
        this.head = null;
        this.tail = null;
    }

    void insertAtBeginning (T data){
        Node<T> newNode = new Node<>(data);

        newNode.next = head;
        head = newNode;
    }

    void push(T data) {
        Node<T> newNode = new Node<>(data); // Create a new node
        newNode.next = head; // Set the next of the new node to the current head
        head = newNode; // Set the new node as the head
        if (tail == null) {
            tail = newNode; // If the list was empty, make the new node the tail
        }
    }

    T peek(){
        Node<T> current = head;
        return current.data;
    }

    void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    T pop(){
        if (head == null){
            return null;
        }

        T poppedValue = head.data;

        if (head.next == null){
            tail = null;
            head = null;
        } else {
            head = head.next;
        }
        return poppedValue;
    }

}
