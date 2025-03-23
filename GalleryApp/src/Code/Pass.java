/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class Pass {
    public int passNumber;
    public String name;

    public Pass(int passNumber, String name) {
        this.passNumber = passNumber;
        this.name = name;
    }
    
    public String getPassCode() {
        return name.substring(0,2)+passNumber;
    }
}
