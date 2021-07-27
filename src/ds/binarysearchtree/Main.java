package ds.binarysearchtree;

public class Main {
    public static void main(String[] args){
        BSTree tree = new BSTree();

        tree.insert(25);
        tree.insert(20);
        tree.insert(27);
        tree.insert(15);
        tree.insert(22);
        tree.insert(26);
        tree.insert(30);
        tree.insert(17);
        tree.insert(29);
        tree.insert(32);

        tree.traverseInOrder();
        tree.remove(2577);
        tree.traverseInOrder();
        tree.traversePreOrder();

    }
}
