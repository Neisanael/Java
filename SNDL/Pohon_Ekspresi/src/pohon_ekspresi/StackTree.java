package pohon_ekspresi;

public class StackTree {

    ListTree stackListTree;

    public StackTree() {
        stackListTree = new ListTree();
    }

    public void push(TreeNode node) {
        stackListTree.insertAtBack(node);
    }

    public TreeNode pop() {
        return stackListTree.removeFromBack();
    }

    public boolean isEmpty() {
        return stackListTree.isEmpty();
    }

    public void print() {
        stackListTree.print();
    }

}
