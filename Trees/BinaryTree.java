class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    Node root = new Node(13);

    public void insert(int data) {

    }

    public Node insert_recursively(Node root, int data) {
        if (root.data > data) {
            root.left = insert_recursively(root.left, data);
        } else {
            root.right = insert_recursively(root.right, data);
        }
        return root;
    }

}
