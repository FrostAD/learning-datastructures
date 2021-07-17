package ds.binarytree;

public class Main {
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree(new Node(55));
        bt.addNodeRecursive(bt.getRoot(),2);
        bt.addNodeRecursive(bt.getRoot(),5);
        bt.addNodeRecursive(bt.getRoot(),1);
        bt.addNodeRecursive(bt.getRoot(),4);
        bt.addNodeRecursive(bt.getRoot(),3);

        Node nn = bt.searchNodeRecursive(bt.getRoot(),4);

//        bt.addNode(12);
//        bt.addNode(122);
//        bt.addNode(33);
//        bt.addNode(13);
//        bt.addNode(77);

    }
}
