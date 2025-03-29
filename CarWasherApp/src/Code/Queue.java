/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class Queue {
    private LinkedList linkedQueue;
    
    public Queue() {
        linkedQueue = new LinkedList();
    }
    
    public boolean isEmpty() {
        return (linkedQueue.isEmpty());
    }
    
    public void enqueue(int f, String s) {
        linkedQueue.insertLast(f,s);
    }
    
    public Link dequeue() {
        if (linkedQueue.isEmpty()) {
            return null;
        } else {
            return linkedQueue.deleteFirst();
        }
    }
    
    public Link peek() {
        return linkedQueue.getFirst();
    }
}
