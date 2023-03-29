package binary_search_tree_copy2;

public class Binary_Search_tree {

    public static void main(String[] args) {
        Tree Ob = new Tree();
        Ob.Insert(10);
        Ob.Insert(5);
        Ob.Insert(15);
        Ob.Insert(13);
        Ob.Insert(7);
        Ob.Insert(20);
        System.out.println();
        System.out.println("PreOrder : ");
        Ob.preOrderTransversal();
        System.out.println();
        if (Ob.delete(13)) {
            System.out.println("Berhasil Delete");
        } else {
            System.out.println("Tidak Berhasil Delete");
        }
        Ob.delete(27);
        System.out.println();
        System.out.println("PreOrder : ");
        Ob.preOrderTransversal();
        System.out.println();
        Ob.delete(6);
        System.out.println();
        System.out.println("PreOrder : ");
        Ob.preOrderTransversal();
        System.out.println();
        Ob.delete(55);
        System.out.println();
        System.out.println("PreOrder : ");
        Ob.preOrderTransversal();
        System.out.println();
    }

}
