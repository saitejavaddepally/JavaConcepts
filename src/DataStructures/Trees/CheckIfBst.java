package DataStructures.Trees;


public class CheckIfBst extends Node {

    CheckIfBst(char data) {
        super(data);
    }

    boolean isSubTreeLesser(Node root, char value) {
        if (root == null) return true;
        return root.data <= value && isSubTreeLesser(root.left, value) && isSubTreeLesser(root.right, value);
    }

    boolean isSubTreeGreater(Node right, char data) {
        return true;
    }

    boolean isBinarySearchTree(Node root) {
        if (isSubTreeLesser(root.left, root.data) && isSubTreeGreater(root.right, root.data) && isBinarySearchTree(root.left) && isBinarySearchTree(root.right)) {
            return true;
        }
        return false;
    }


}
