package binary_search_tree_copy3;

public class Binary_Search_tree {

    public static void main(String[] args) {
        Tree Ob = new Tree();
        Ob.Insert(42);
        Ob.Insert(21);
        Ob.Insert(38);
        Ob.Insert(27);
        Ob.Insert(71);
        Ob.Insert(82);
        Ob.Insert(55);
        Ob.Insert(63);
        Ob.Insert(6);
        Ob.Insert(2);
        Ob.Insert(40);
        Ob.Insert(12);
        System.out.println("Pre Order Transversal : ");
        Ob.preOrderTransversal();
        System.out.println("");
        if(Ob.delete(0)){
            System.out.println("Bisa");
        }
        System.out.println("Setelah Delete");
        Ob.preOrderTransversal();
        Ob.depth(40);
        Ob.descendant(40);
        Ob.height(40);
        Ob.leaf();
    }

}
