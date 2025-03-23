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
    private int maxSize;
    private Pass queueArray[];
    private int front;
    private int rear;
    private int nItems;
    
    public Queue(int maxSize) {
        queueArray = new Pass[maxSize];
        this.maxSize = maxSize;
        front = 0;
        rear = -1;
        nItems = 0;
    }
    
    public boolean isEmpty() {
        return (nItems == 0);
    }
    
    public boolean isFull() {
        return (rear == maxSize -1);
    }
    
    public void insert(Pass value) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            queueArray[++rear] = value;
            nItems++;
        }
    }
    
    public Pass remove() {
        if (isEmpty()) {
            return null;
        } else {
            nItems--;
            return queueArray[front++];
        }
    }
    
    public Pass peek() {
        if (isEmpty()) {
            return null;
        } else {
            return queueArray[front];
        }
    }
}
