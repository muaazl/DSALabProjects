/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code;

import java.util.Stack;

/**
 *
 * @author muaaz
 */
public class Tree {
    private Node root;
    public static String order;
    
    public Tree() {
        root = null;
    }
    
    public void insert(String ac, String m) {
        Node newNode = new Node(ac, m);
        if (root == null) {
            root = newNode;
        } else {
            Node current = root;
            while (true) {
                int compare = ac.compareToIgnoreCase(current.getAcronym());

                if (compare < 0) { // Go left
                    if (current.leftChild == null) {
                        current.leftChild = newNode;
                        break;
                    } else {
                        current = current.leftChild;
                    }
                } else if (compare > 0) { // Go right
                    if (current.rightChild == null) {
                        current.rightChild = newNode;
                        break;
                    } else {
                        current = current.rightChild;
                    }
                } else {
                    current.setMeaning(m);
                    break;
                }
            }
        }
    }
    
    public Node search(String key) {
        Node current = root;
        while (current != null) {
            int compare = key.compareToIgnoreCase(current.getAcronym());
            if (compare == 0) {
                return current;
            } else if (compare < 0) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        return null;
    }
    
    public boolean delete(String key) {
        Node current = root;
        Node parent = null;
        boolean isLeftChild = false;

        // Find the node to delete
        while (current != null && !current.getAcronym().equalsIgnoreCase(key)) {
            parent = current;
            int compare = key.compareToIgnoreCase(current.getAcronym());
            if (compare < 0) {
                current = current.leftChild;
                isLeftChild = true;
            } else {
                current = current.rightChild;
                isLeftChild = false;
            }
        }

        if (current == null) {
            return false;
        }

        if (current.leftChild == null && current.rightChild == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.leftChild = null;
            } else {
                parent.rightChild = null;
            }
        }

        else if (current.rightChild == null) {
            if (current == root) {
                root = current.leftChild;
            } else if (isLeftChild) {
                parent.leftChild = current.leftChild;
            } else {
                parent.rightChild = current.leftChild;
            }
        } else if (current.leftChild == null) {
            if (current == root) {
                root = current.rightChild;
            } else if (isLeftChild) {
                parent.leftChild = current.rightChild;
            } else {
                parent.rightChild = current.rightChild;
            }
        }

        else {
            Node successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.leftChild = successor;
            } else {
                parent.rightChild = successor;
            }
            successor.leftChild = current.leftChild;
        }

        return true;
    }
    
    public Node getSuccessor(Node d) {
        Node successorParent = d;
        Node successor = d.rightChild;
        while (successor.leftChild != null) {
            successorParent = successor;
            successor = successor.leftChild;
        }
        if (successor != d.rightChild) {
            successorParent.leftChild = successor.rightChild;
            successor.rightChild = d.rightChild;
        }
        return successor;
    }
    
    public String display(int op) {
        order = "";
        switch(op) {
            case 1:
                inOrder(root); break;
            case 2:
                preOrder(root); break;
            case 3:
                postOrder(root); break;
            default:
                break;
        }
        return order;
    }
    
    private void inOrder(Node lr) {
        Stack<Node> stack = new Stack<>();
        Node current = lr;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.leftChild;
            }

            current = stack.pop();
            order += current.getAcronym() + ": " + current.getMeaning() + "\n";
            current = current.rightChild;
        }
    }
    
    private void preOrder(Node lr) {
        if (lr == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(lr);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            order += current.getAcronym() + ": " + current.getMeaning() + "\n";

            if (current.rightChild != null) stack.push(current.rightChild);
            if (current.leftChild != null) stack.push(current.leftChild);
        }
    }
    
    private void postOrder(Node lr) {
         if (lr == null) return;
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(lr);
        while (!stack1.isEmpty()) {
            Node current = stack1.pop();
            stack2.push(current);

            if (current.leftChild != null) stack1.push(current.leftChild);
            if (current.rightChild != null) stack1.push(current.rightChild);
        }

        while (!stack2.isEmpty()) {
            Node current = stack2.pop();
            order += current.getAcronym() + ": " + current.getMeaning() + "\n";
        }
    }
}
