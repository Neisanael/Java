
package binary_search_tree_copy3;

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

    public void depth(int data) {
        TreeNode node = getCurrent(data);
        if (node == null) {
            System.out.println("Node " + data + " tidak ada");
        } else {
            int depth = getDepth(root, node);
            System.out.println("Depth untuk node " + data + " adalah " + depth);
        }
    }

    public void height(int data) {
        TreeNode node = getCurrent(data);
        if (node == null) {
            System.out.println("Node " + data + " tidak ada");
        } else {
            int height = getHeight(node);
            System.out.println("Bode " + data + " mempunyai Height " + height);
        }
    }

    public void leaf() {
        int leafCount = getLeafCount(root);
        System.out.println("Jumlah leaf " + leafCount);
    }

    public void descendant(int data) {
        TreeNode node = getCurrent(data);
        if (node == null) {
            System.out.println("Node " + data + " tidak ada");
        } else {
            int descendantCount = getDescendantCount(node);
            System.out.println("Node dari  " + data + " mempunyai " + descendantCount + " descandant");
        }
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

    public TreeNode getCurrent(int current) {
        TreeNode data = root;
        while (data != null) {
            if (current == data.getData()) {
                return data;
            } else if (current < data.getData()) {
                data = data.getLeftNode();
            } else {
                data = data.getRightNode();
            }
        }
        return null;
    }

    public TreeNode search(int search) {
        return getCurrent(search);
    }

    public boolean delete(int data) {
        if (root != null) {
            root = deleteHelper(root, data);
            return true;
        }
        return false;
    }

    private TreeNode deleteHelper(TreeNode node, int data) {
        if (node == null) {
            return null;
        }

        if (data < node.getData()) {
            node.setLeftNode(deleteHelper(node.getLeftNode(), data));
        } else if (data > node.getData()) {
            node.setRightNode(deleteHelper(node.getRightNode(), data));
        } else {
            // node dengan 2 child nodes
            if (node.getLeftNode() != null && node.getRightNode() != null) {
                TreeNode predecessor = getPredecessor(node.getLeftNode());
                node.setData(predecessor.getData());
                node.setLeftNode(deleteHelper(node.getLeftNode(), predecessor.getData()));
            } else if (node.getLeftNode() != null) {
                node = node.getLeftNode();
            } else if (node.getRightNode() != null) {
                node = node.getRightNode();
            } else {
                node = null;
            }
        }
        return node;
    }

    private TreeNode getPredecessor(TreeNode node) {
        while (node.getRightNode() != null) {
            node = node.getRightNode();
        }
        return node;
    }

    private int getDepth(TreeNode root, TreeNode node) {
        if (root == null) {
            return 0;
        }

        if (root == node) {
            return 1;
        }

        int leftDepth = getDepth(root.getLeftNode(), node);
        int rightDepth = getDepth(root.getRightNode(), node);

        if (leftDepth > 0) {
            return leftDepth + 1;
        } else if (rightDepth > 0) {
            return rightDepth + 1;
        } else {
            return 0;
        }
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = getHeight(node.getLeftNode());
        int rightHeight = getHeight(node.getRightNode());

        return Math.max(leftHeight, rightHeight) + 1;
    }

    private int getLeafCount(TreeNode node) {
        if (node == null) {
            return 0;
        }

        if (node.getLeftNode() == null && node.getRightNode() == null) {
            return 1;
        }

        return getLeafCount(node.getLeftNode()) + getLeafCount(node.getRightNode());
    }

    private int getDescendantCount(TreeNode node) {
        if (node == null) {
            return 0;
        }

        return getDescendantCount(node.getLeftNode()) + getDescendantCount(node.getRightNode()) + 1;
    }
}
