package pohon_ekspresi;

public class ListTreeNode {

    TreeNode data;
    ListTreeNode nextNode;

    ListTreeNode(TreeNode treeNode) {
        this(treeNode, null);
    }

    ListTreeNode(TreeNode treeNode, ListTreeNode node) {
        data = treeNode;
        nextNode = node;
    }

    TreeNode getTreeNode() {
        return data;
    }

    ListTreeNode getNext() {
        return nextNode;
    }
}
