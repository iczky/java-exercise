package com.adepuu.exercises.session11;

public class Queue {
    /**
     * Write a Java queue program that can scale dynamically
     * <p>
     * As a developer, I want to implement a Java queue program that can scale dynamically using a linked list, so that I can efficiently manage data storage and retrieval in my applications.
     * <p>
     * Notes:
     * The program doesn't require a menu system; focus should be on data structure implementation.
     * <p>
     * Acceptance Criteria:
     * - Functionality: The program must be able to perform basic queue operations (enqueue, dequeue, peek) on a linked list.
     * - Dynamic Scaling: The queue should automatically scale in size as elements are added or removed, without any manual resizing required by the user.
     * - Performance: The program should maintain constant time complexity for enqueue and dequeue operations, ensuring efficient data management.
     * - Memory Efficiency: The queue should use memory efficiently, allocating and deallocating memory dynamically as needed.
     * - Error Handling: The program should handle edge cases gracefully, such as attempting to dequeue an element from an empty queue, and provide clear error messages.
     */
    public static void main(String[] args) {
        StackQueue<Integer> QQ = new StackQueue<>();

        QQ.enqueue(50);
        QQ.enqueue(2);
        QQ.enqueue(10);
        QQ.printList();

//        System.out.println(QQ.dequeue());
        System.out.println(QQ.peek());
    }
}

class StackQueue<T>{
    private Node<T> head;
    private Node<T> tail;

    StackQueue(){
        this.head = null;
        this.tail = null;
    }

    void enqueue(T data) {
        Node<T> newNode = new Node<>(data); // Create a new node
        newNode.next = head; // Set the next of the new node to the current head
        head = newNode; // Set the new node as the head
        if (tail == null) {
            tail = newNode; // If the list was empty, make the new node the tail
        }
    }

    void printList() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    T peek(){
        Node<T> current = tail;
        return current.data;
    }

    T dequeue(){
        if (head == null){
            return null;
        }

        T dequeValue = head.data;

        if (head.next == null){
            tail = null;
            head = null;
        } else {
            Node<T> current = head;

            while(current.next.next != null){
                current = current.next;
            }

            dequeValue = current.next.data;
            current.next = null;
            tail = current;
        }
        return dequeValue;
    }

}
