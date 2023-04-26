package binary_search_tree_copy3;

public class TreeNode {

    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    private TreeNode parent;

    public TreeNode(int data) {
        this.data = data;
        leftNode = rightNode = parent = null;
    }

    public TreeNode(int data, TreeNode parent) {
        this.data = data;
        leftNode = rightNode = null;
        this.parent = parent;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
        if (leftNode != null) {
            leftNode.setParent(this);
        }
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
        if (rightNode != null) {
            rightNode.setParent(this);
        }
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void insert(int in) {
        if (in <= data) {
            if (leftNode == null) {
                System.out.println(in + " Left "+this.getData());
                setLeftNode(new TreeNode(in, this));
            } else {
                leftNode.insert(in);
            }
        } else {
            if (rightNode == null) {
                System.out.println(in + " Right "+this.getData());
                setRightNode(new TreeNode(in, this));
            } else {
                rightNode.insert(in);
            }
        }
    }
}
