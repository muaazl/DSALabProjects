/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

/**
 *
 * @author muaaz
 */
public class Heap {
    Member heapArray[];
    public int maxSize;
    public int heapSize;
    
    public Heap(int maxSize) {
        this.maxSize = maxSize;
        this.heapArray = new Member[maxSize];
        this.heapSize = 0;
    }
    
    public boolean insert(Member m) {
        if (heapSize == maxSize) {
            return false;
        }
        heapArray[heapSize] = m;
        trickleUp(heapSize);
        heapSize++;
        return true;
    }
    
    public Member getRoot() {
        if (heapSize == 0) {
            return null;
        }
        return heapArray[0];
    }
    
    public void trickleUp(int index) {
        if (index == 0) {
            return;
        }
        int parentIndex = (index - 1) / 2;
        Member bottom = heapArray[index];

        while (index > 0 && heapArray[parentIndex].getNumber() > bottom.getNumber()) {
            heapArray[index] = heapArray[parentIndex];
            index = parentIndex;
            parentIndex = (parentIndex - 1) / 2;
        }
        heapArray[index] = bottom;
    }
    
    public Member remove() {
        if (heapSize == 0) {
            return null;
        }
        Member root = heapArray[0];
        heapSize--;
        if (heapSize > 0) {
            heapArray[0] = heapArray[heapSize];
            trickleDown(0);
        }
        return root;
    }
    
    public void trickleDown(int index) {
        Member top = heapArray[index];
        int smallerChildIndex;

        while (index < heapSize / 2) {
            int leftChildIndex = 2 * index + 1;
            int rightChildIndex = leftChildIndex + 1;

            if (rightChildIndex < heapSize &&
                heapArray[rightChildIndex].getNumber() < heapArray[leftChildIndex].getNumber()) {
                smallerChildIndex = rightChildIndex;
            } else {
                smallerChildIndex = leftChildIndex;
            }

            if (top.getNumber() <= heapArray[smallerChildIndex].getNumber()) {
                break;
            }

            heapArray[index] = heapArray[smallerChildIndex];
            index = smallerChildIndex;
        }
        heapArray[index] = top;
    }
    
    public boolean containsID(int memberId) {
    for (int i = 0; i < heapSize; i++) {
        if (heapArray[i] != null && heapArray[i].getNumber() == memberId) {
            return true;
        }
    }
    return false;
    }
}
