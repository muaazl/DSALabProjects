/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class Cage {
    private int cageNo;
    private String type;
    public boolean reserved;

    public Cage(int cageNo, String type) {
        this.cageNo = cageNo;
        this.type = type;
    }

    public int getCageNo() {
        return cageNo;
    }

    public String getType() {
        return type;
    }

    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }
    
    
}
