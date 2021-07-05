
package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;

 class Node{
    char data;
    Node left = null; 
    Node right = null;

    Node(char data){
        this.data = data;
    }
}

public class BinarySearchTree {

    Node insert(Node root, char data){
        if (root == null){
            root = new Node(data);
        }
        else if (data <= root.data){
            root.left = insert(root.left, data);
        }
        else {
            root.right = insert(root.right, data);
        }
        return root;
    }

//    breadth first
    void levelOrder(Node root){
        if(root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node current = queue.peek();
            System.out.print(current.data + " ");
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
            queue.remove();
        }
    }

//    Delete a node from binary search tree
//    case 1 : no child
//    case 2 : one child
//    case 3 : two children
//        ->> two cases
//              find min in right
//              find max in left

    Node findMin(Node root){
        while (root.left != null) root = root.left;
        return root;
    }

    Node deleteNode(Node root, char data){
        if (root == null) return null;
        else if (data < root.data) root.left = deleteNode(root.left, data);
        else if (data > root.data) root.right = deleteNode(root.right, data);
        else{
//            case 1:
            if (root.left == null && root.right == null){
                root = null;
            }
//            case 2:
            else if(root.left == null){
                root = root.right;
            }
            else if(root.right == null){
                root = root.left;
            }
            else{
                Node temp = findMin(root.right);
                root.data = temp.data;
                root.right = deleteNode(root.right, temp.data);
            }
        }
        return root;
    }

//

    void preOrder(Node root){
        if (root == null) return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    void inOrder(Node root){
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    void postOrder(Node root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }



    public static void main(String[] args) {
        Node root = null;
        BinarySearchTree traversal = new BinarySearchTree();
        root = traversal.insert(null, 'F');
        root = traversal.insert(root, 'B');
        root = traversal.insert(root, 'G');
        root = traversal.insert(root, 'A');
        root = traversal.insert(root, 'C');
        root = traversal.insert(root, 'E');
        traversal.preOrder(root);
        System.out.println();
        traversal.inOrder(root);
        System.out.println();
        traversal.postOrder(root);
        System.out.println();
        traversal.levelOrder(root);
        traversal.deleteNode(root,'B');
        System.out.println();
        traversal.preOrder(root);
    }
}