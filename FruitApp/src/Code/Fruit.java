/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class Fruit {
    private String Name;
    private String Type;
    private String Color;
    private String ImagePath;

    public Fruit(String Name, String Type, String Color, String ImagePath) {
        this.Name = Name;
        this.Type = Type;
        this.Color = Color;
        this.ImagePath = ImagePath;
    }

    public Fruit(String Name, String Type, String Color) {
        this.Name = Name;
        this.Type = Type;
        this.Color = Color;
        this.ImagePath = "";
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }

    public String getColor() {
        return Color;
    }

    public String getImagePath() {
        return ImagePath;
    }
    
    
}
