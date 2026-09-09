//we are trying to implement binary search tree from scratch
public class BinaryTree {
    Node root;// why am i writing this here?

    public void insert(int data) {
        insert_recursively(root, data);
    }

    public Node insert_recursively(Node root, int data) {
        if (root == null) {
            // now i dont know
        } else if (root.data > data) {
            insert_recursively(root.left, data);
        } else {
            insert_recursively(root.right, data);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(13);
        System.out.println(root.data);
    }

}
