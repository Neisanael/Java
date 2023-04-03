package pohon_ekspresi;

public class TreeNode {

    TreeNode leftNode;
    char data;
    TreeNode rightNode;

    public TreeNode(char nodeData) {
        data = nodeData;
        leftNode = rightNode = null;
    }

    public void insert(char insertValue) {
        if (insertValue < data) {
            if (leftNode == null) {
                leftNode = new TreeNode(insertValue);
            } else {
                leftNode.insert(insertValue);
            }
        } else if (insertValue > data) {
            if (rightNode == null) {
                rightNode = new TreeNode(insertValue);
            } else {
                rightNode.insert(insertValue);
            }
        }
    }
}
