package ds.binarysearchtree;

public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void insert(int value) {
        if (value == this.value) {
            System.out.println("Nothing! Duplicates are not supported");
        } else {
            if (value < this.value) {
                if (left == null) {
                    left = new TreeNode(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new TreeNode(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }
    public TreeNode get(int value){
        if (this.value == value){
            return this;
        }
        if (this.value > value){
            if (left != null)
                return left.get(value);
        }else{
            if (right != null)
                return right.get(value);
        }

        return null;
    }


    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getMin() {
        if (left == null) {
            return value;
        }
        return left.getMin();
    }

    public int getMax() {
        if (right == null){
            return value;
        }
        return right.getMax();
    }

    public void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        System.out.print(value + " ");

        if (right != null) {
            right.traverseInOrder();
        }
    }
    public void traversePreOrder(){
        System.out.print(value + " ");
        if(left != null)
            left.traversePreOrder();
        if(right != null)
            right.traversePreOrder();
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "value=" + value +
                '}';
    }
}
