package pohon_ekspresi;

public class TreeTest {
    public static void main(String[] args) {
        //String s1 = "(A+B)";
        //String s1 = "(A+B)*((B-C)+D)";
        String s1 = "(A+B*C)((P+Q)*R)";
        char notasi[] =  new char[s1.length()];
        s1.getChars(0, s1.length(), notasi, 0);
        
        Tree tree = new Tree();
        Infix infix = new Infix(notasi);
        
        tree.setRootTree(infix.buatPohon());
        
        System.out.println("\n\nInfix");
        tree.inOrderTransversal();
        System.out.println("");
    }
}
