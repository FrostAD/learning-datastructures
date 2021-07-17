package ds.binarytree;

public class BinaryTree {
    private Node root;

    public BinaryTree(Node root) {
        this.root = root;
    }

    public Node getRoot() {
        return root;
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        Node current = root;
        boolean flag = true;
        while (flag) {
            if (newNode.getValue() < current.getValue()) {
                if (current.getLeft() != null)
                    current = current.getLeft();
                else {
                    current.setLeft(newNode);
                    flag = false;
                }
            } else {
                if (current.getRight() != null)
                    current = current.getRight();
                else {
                    current.setRight(newNode);
                    flag = false;
                }
            }
        }

    }

    public Node addNodeRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.getValue()) {
            node.setLeft(addNodeRecursive(node.getLeft(), value));
        } else if (value >= node.getValue()) {
            node.setRight(addNodeRecursive(node.getRight(), value));
        }

        return node;
    }

    //search
    public Node searchNodeRecursive(Node node, int searched) {
        if (node == null) {
            return null;
        }

        if (node.getValue() > searched) {
            node = searchNodeRecursive(node.getLeft(),searched);
        } else if (node.getValue() < searched) {
            node = searchNodeRecursive(node.getRight(),searched);
        }

        return node;

    }
    //delete
    public Node deleteNodeRecursive(Node node,int value){
        if (node == null){
            return null;
        }

        if (node.getValue() > value){
            node.setLeft(deleteNodeRecursive(node.getLeft(),value));
        }else if(node.getValue() < value){
            node.setRight(deleteNodeRecursive(node.getRight(),value));
        }

        //found
        if (node.getValue() == value){
            //no children
            if (node.getLeft() == null && node.getRight() == null){
                return null;
            } else if(node.getLeft() == null || node.getRight() == null){//one children
                if (node.getLeft() == null)
                    return node.getRight();
                else
                    return node.getLeft();
            }

            //TODO
            //two children
            return null;

        }
        //TODO
        return null;
    }
}
