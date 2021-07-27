package ds.binarysearchtree;

public class BSTree {
    private TreeNode root;

    public BSTree() {
        root = null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public TreeNode get(int value) {
        if (root != null)
            return root.get(value);
        return null;
    }

    public int getMin() {
        if (root != null)
            return root.getMin();
        else
            return Integer.MIN_VALUE;
    }

    public int getMax() {
        if (root != null)
            return root.getMax();
        else
            return Integer.MAX_VALUE;
    }

    public void remove(int value) {
        root = remove(root, value);
    }

    private TreeNode remove(TreeNode treeNode, int value) {
        if (treeNode.getValue() == value) {
            if (treeNode.getLeft() != null && treeNode.getRight() == null)
                return treeNode.getLeft();
            else if (treeNode.getLeft() == null && treeNode.getRight() != null)
                return treeNode.getRight();
            else if (treeNode.getLeft() != null && treeNode.getRight() != null) {
                // using biggest value in the left subtree
                int leftBiggest = treeNode.getLeft().getMax();
                // Just setting the new value, without rewiring
                treeNode.setValue(leftBiggest);
                // After that we are deleting the old node with the biggest value(in left subtree)
                treeNode.setLeft(remove(treeNode.getLeft(), leftBiggest));
                return treeNode;
            }
            //if left == null && right == null
            return null;
        } else {
            if (treeNode.getValue() > value) {
                if (treeNode.getLeft() != null)
                    treeNode.setLeft(remove(treeNode.getLeft(), value));
            } else {
                if (treeNode.getRight() != null)
                    treeNode.setRight(remove(treeNode.getRight(), value));
            }
        }
        return treeNode;
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
        System.out.println();
    }

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
        System.out.println();
    }

}
