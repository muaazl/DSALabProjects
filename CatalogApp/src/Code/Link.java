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
    private int ISBN;
    private String title;
    private String coverPhoto;
    public Link next;

    public Link(int ISBN, String title, String coverPhoto) {
        this.ISBN = ISBN;
        this.title = title;
        this.coverPhoto = coverPhoto;
        this.next = null;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }
    
    public void displayBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Cover Photo: " + coverPhoto);
    }
}
