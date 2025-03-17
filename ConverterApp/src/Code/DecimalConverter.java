/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class DecimalConverter {
    public String input;
    
    public String convertToHexa(String input) {
        int input1 = Integer.parseInt(input);
        return Integer.toHexString(input1).toUpperCase();
    }
    
    public String convertToBinary(String input) {
        int input1 = Integer.parseInt(input);
        return Integer.toBinaryString(input1);
    }
}
