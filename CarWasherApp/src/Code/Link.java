/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class Link {
    public int tokenNumber;
    public String customerName;
    public Link next;

    public Link(int tokenNumber, String customerName) {
        this.tokenNumber = tokenNumber;
        this.customerName = customerName;
        this.next = null;
    }
    
    
}
