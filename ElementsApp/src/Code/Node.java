/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class Node {
    private String acronym;
    private String meaning;
    public Node leftChild;
    public Node rightChild;
    
    public Node(String acronym, String meaning) {
        this.acronym = acronym;
        this.meaning = meaning;
        this.leftChild = null;
        this.rightChild = null;
    }
    
    public String getAcronym() {
        return acronym;
    }

    public String getMeaning() {
        return meaning;
    }
    
    public void setMeaning(String newV) {
        this.meaning = newV;
    }
}
