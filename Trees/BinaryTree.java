class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class BinaryTree {
    static Node root = new Node(13);

    public static void insert(int data) {
        insert_recursively(root, data);

    }

    public static Node insert_recursively(Node root, int data) {
        if (root == null) {
            root.data = data;
        }
        if (root.data > data) {
            root.left = insert_recursively(root.left, data);
        } else {
            root.right = insert_recursively(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        insert(8);
        insert(39);
    }

}
