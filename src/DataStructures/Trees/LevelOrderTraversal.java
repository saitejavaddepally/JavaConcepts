
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

public class LevelOrderTraversal{

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
        LevelOrderTraversal traversal = new LevelOrderTraversal();
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

    }
}