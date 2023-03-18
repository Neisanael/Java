package binary_search_tree;

public class Tree {

    private TreeNode root;

    public Tree() {
        root = null;
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void preOrderTransversal() {
        preOrderHelper(root);
    }

    public void inOrderTransversal() {
        inOrderHelper(root);
    }

    public void postOrderTransversal() {
        postOrderHelper(root);
    }

    public void preOrderHelper(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + " ");
            preOrderHelper(node.getLeftNode());
            preOrderHelper(node.getRightNode());
        }

    }

    public void inOrderHelper(TreeNode node) {
        if (node != null) {
            inOrderHelper(node.getLeftNode());
            System.out.print(node.getData() + " ");
            inOrderHelper(node.getRightNode());
        }

    }

    public void postOrderHelper(TreeNode node) {
        if (node != null) {
            postOrderHelper(node.getLeftNode());
            postOrderHelper(node.getRightNode());
            System.out.print(node.getData() + " ");
        }

    }

    public void Insert(int in) {
        if (root == null) {
            root = new TreeNode(in);
            System.out.println("Root " + root.getData());
        } else {
            root.insert(in);
        }
    }

    public TreeNode getCurrent(int x) {
        TreeNode data = root;
        while (data != null) {
            if (x == data.getData()) {
                return data;
            } else if (x < data.getData()) {
                data = data.getLeftNode();
            } else {
                data = data.getRightNode();
            }
        }
        return null;
    }
}
