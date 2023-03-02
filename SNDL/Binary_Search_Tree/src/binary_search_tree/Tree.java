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

    public void Insert(int in) {
        TreeNode tr = new TreeNode(in);
        if (root == null) {
            root = tr;
            System.out.println("Root " + root.getData());
        } else {
            TreeNode trB = root;
            while (true) {
                if (in <= trB.getData()) {
                    if (trB.getLeftNode() == null) {
                        trB.setLeftNode(tr);
                        System.out.println(tr.getData() + " LEFT " + trB.getData());
                        break;
                    } else {
                        trB = trB.getLeftNode();
                    }
                } else {
                    if (trB.getRightNode() == null) {
                        trB.setRightNode(tr);
                        System.out.println(tr.getData() + " RIGHT " + trB.getData());
                        break;
                    } else {
                        trB = trB.getRightNode();
                    }
                }
            }
        }
    }

    public TreeNode Search(int cari) {
        TreeNode data = root;
        while (data != null) {
            if (cari == data.getData()) {
                return data;
            } else if (cari < data.getData()) {
                data = data.getLeftNode();
            } else {
                data = data.getRightNode();
            }
        }
        return null;
    }
}
