/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class Stack {
    public int maxSize;
    public char stackArray[];
    public int top;
    
    public Stack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new char[maxSize];
        this.top = -1;
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxSize -1);
    }
    
    public void push(char value) {
        if (isFull()) {
            System.out.println("Stack Array is Full");
        } else {
            stackArray[++top] = value;
        }
    }
    
    public char pop() {
        return (isEmpty()) ? '*' : stackArray[top--];
    }
    
    public char peek() {
        return (isEmpty()) ? '*' : stackArray[top];
    }
}
