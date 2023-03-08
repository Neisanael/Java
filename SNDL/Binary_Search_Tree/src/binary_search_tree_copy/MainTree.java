package binary_search_tree_copy;

import java.util.Scanner;

public class MainTree {

    public static void main(String[] args) {
        Scanner dtSc = new Scanner(System.in);
        Tree Ob = new Tree();
        Ob.Insert(17);
        Ob.Insert(28);
        Ob.Insert(29);
        Ob.Insert(88);
        Ob.Insert(97);
        Ob.Insert(76);
        Ob.Insert(54);
        Ob.Insert(80);
        System.out.println();
        System.out.println("PreOrder : ");
        Ob.preOrderTransversal();
        System.out.println();
        System.out.println("InOrder : ");
        Ob.inOrderTransversal();
        System.out.println();
        System.out.println("PostOrder : ");
        Ob.postOrderTransversal();
        System.out.println();
        System.out.print("Search Data : ");
        int search = dtSc.nextInt();
        TreeNode dataSearch = Ob.Search(search);
        if (dataSearch == null) {
            System.out.println("Data not Found");
        } else {
            System.out.println("Data " + dataSearch.getData() + " Found");
        }
    }
}
