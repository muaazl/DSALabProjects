/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class LinkList {
    private Link first;
    
    public LinkList() {
        this.first = null;
    }
    
    public Link getFirst() {
        return first;
    }
    
    public boolean isEmpty() {
        return (first == null);
    }
    
    public void insertFirst(Link value) {
        value.next = first;
        first = value;
    }
    
    public void insertLast(Link value) {
        if (isEmpty()) {
            first = value;
        } else {
            Link temp = first;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = value;
        }
    }
    
    public void deleteFirst() {
        if (isEmpty()) {
            first = first.next;
        } else {
            System.out.println("List is empty!");
        }
    }
    
    public void insertAfter(Link value) {
        Link current = first;

        while (current != null) {
            if (current.getISBN() == value.getISBN()) {
                value.next = current.next;
                current.next = value;
                return;
            }
            current = current.next;
        }
    }
    
    public Link find(int isbn) {
        Link find = first;
        while (find != null) {
            if (find.getISBN() == isbn) {
                return find;
            }
            find = find.next;
        }
        return null;
    }
    
    public Link delete(int isbn) {
        Link current = first;
        Link previous = null;

        while (current != null) {
            if (current.getISBN() == isbn) {
                if (previous == null) {
                    first = current.next;
                } else {
                    previous.next = current.next;
                }
                return current;
            }
            previous = current;
            current = current.next;
        }
        return null;
    }
    
    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayBook();
            current = current.next;
        }
    }
}
