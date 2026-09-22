package Traversal;

import org.w3c.dom.Node;

public class Inorder {
    public void inorder_traversal(Node)
    {//recursive function for traversal in tree
        if(Node ==  null)
        {
            return;
        }
        inorder_traversal(Node.left);
        print(Node.data);
        inorder_traversal(Node.right);
            
    }

    public static void main(String[] Asit) {

    }

}
