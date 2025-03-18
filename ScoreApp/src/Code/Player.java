/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class Player {
    private String name;
    public double pointsScored;
    public int numberOfGames;

    public Player(String name, double pointsScored, int numberOfGames) {
        this.name = name;
        this.pointsScored = pointsScored;
        this.numberOfGames = numberOfGames;
    }

    public String getName() {
        return name;
    }

    public double getPointsScored() {
        return pointsScored;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }
    
}
