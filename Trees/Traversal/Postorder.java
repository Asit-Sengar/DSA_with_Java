class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class Postorder {
    public static void inorder_traversal(Node root) {// recursive function for traversal in tree
        if (root == null) {
            return;
        }
        inorder_traversal(root.left);
        inorder_traversal(root.right);
        System.out.println(root.data);

    }

    public static void main(String[] Asit) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);
        inorder_traversal(root);
    }
}
