package pohon_ekspresi;

public class Tree {

    private TreeNode root;

    public Tree() {
        root = null;
    }

    public void setRootTree(TreeNode treeNode) {
        root = treeNode;
    }

    public void insertNode(char insertValue) {
        if (root == null) {
            root = new TreeNode(insertValue);
        } else {
            root.insert(insertValue);
        }
    }

    public void preOrderTransversal() {
        preOrderHelper(root);
    }

    private void preOrderHelper(TreeNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.data + " ");
        preOrderHelper(node.leftNode);
        preOrderHelper(node.rightNode);
    }

    public void inOrderTransversal() {
        inOrderHelper(root);
    }

    private void inOrderHelper(TreeNode node) {
        if (node == null) {
            return;
        }

        inOrderHelper(node.leftNode);
        System.out.print(node.data + " ");
        inOrderHelper(node.rightNode);
    }

    public void postOrderTransversal() {
        postOrderHelper(root);
    }

    private void postOrderHelper(TreeNode node) {
        if (node == null) {
            return;
        }

        postOrderHelper(node.leftNode);
        postOrderHelper(node.rightNode);
        System.out.print(node.data + " ");
    }
}
