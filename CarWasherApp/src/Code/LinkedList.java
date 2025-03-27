/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class LinkedList {
    private Link first;
    
    public LinkedList() {
        this.first = null;
    }
    
    public boolean isEmpty() {
        return (first == null);
    }
    
    public void insertLast(int f, String s) {
        if (isEmpty()) {
            first = new Link(f, s);
        } else {
            Link temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Link(f, s);
        }
    }
    
    public Link deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return null;
        } else {
            Link temp = first;
            first = first.next;
            return temp;
        }
    }
    
    public Link getFirst() {
        return first;
    }
}
