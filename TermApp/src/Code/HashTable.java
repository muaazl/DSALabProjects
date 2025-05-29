/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class HashTable {
    private ShortHandKey[] keyList;
    private int size;
    private int numItems;

    public HashTable(int size) {
        this.keyList = new ShortHandKey[size];
        this.size = size;
        this.numItems = 0;
    }
    
    public int hashFunction(String key) {
        int hashVal = 0;
        for (int i = 0; i < key.length(); i++) {
            hashVal += key.charAt(i);
        }
        return hashVal % size;
    }
    
    public boolean insert(ShortHandKey item) {
        if (numItems >= size * (2/3)) {
            System.out.println("Hash table is getting full");
        }
        
        if (numItems >= size) {
            return false;
        }
        
        String key = item.getKey();
        int hashVal = hashFunction(key);
        int originalHashVal = hashVal;
        
        while (keyList[hashVal] != null) {
            if (keyList[hashVal].getKey().equals(key)) {
                return false;
            }
            hashVal = (hashVal + 1) % size;
            if (hashVal == originalHashVal) {
                return false;
            }
        }
        
        keyList[hashVal] = item;
        numItems++;
        return true;
    }
    
    public ShortHandKey find(String key) {
        int hashVal = hashFunction(key);
        int originalHashVal = hashVal;
        
        while (keyList[hashVal] != null) {
            if (keyList[hashVal].getKey().equals(key)) {
                return keyList[hashVal];
            }
            hashVal = (hashVal + 1) % size;
            if (hashVal == originalHashVal) {
                return null;
            }
        }
        return null;
    }
    
    public Code.ShortHandKey delete(String key) {
        int hashIndex = hashFunction(key);
        int originalIndex = hashIndex;

        while (keyList[hashIndex] != null) {
            if (keyList[hashIndex].getKey().equals(key)) {
                Code.ShortHandKey itemToDelete = keyList[hashIndex];
                return itemToDelete; // Return the deleted item
            }
            hashIndex = (hashIndex + 1) % size; // Move to the next spot
            if (hashIndex == originalIndex) {
                return null; // Cycled through the table, item not found
            }
        }
        return null; // Found a truly empty (null) spot, so item to delete is not in the table
    }
    
    public int getNumItems() {
        return numItems;
    }
    
    public int getSize() {
        return size;
    }
}
