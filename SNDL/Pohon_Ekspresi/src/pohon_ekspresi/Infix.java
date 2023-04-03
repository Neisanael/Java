package pohon_ekspresi;

class KonstantaInfix {

    char operator[] = {'+', '-', '*', '/', '^'};
    char operand[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
        'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private char data;

    public KonstantaInfix() {
        data = ' ';
    }

    public void setData(char data_in) {
        data = data_in;
    }

    public boolean isOperator() {
        for (int i = 0; i < operator.length; i++) {
            if (data == operator[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean isOperand() {
        for (int i = 0; i < operand.length; i++) {
            if (data == operand[i]) {
                return true;
            }
        }
        return false;
    }

}

public class Infix {

    char ung[];
    KonstantaInfix karInfix = new KonstantaInfix();
    StackTree opr;
    StackTree opd;

    public Infix(char[] ung_in) {
        ung = ung_in;
    }

    public int valensi(char data_in) {
        if (data_in == '^') {
            return 3;
        } else if ((data_in == '*') || (data_in == '/')) {
            return 2;
        } else if ((data_in == '+') || (data_in == '-')) {
            return 1;
        } else if (data_in == '(') {
            return 0;
        } else {
            return -1;
        }
    }

    public TreeNode gabung() {
        TreeNode phn = opr.pop();
        phn.rightNode = opd.pop();
        phn.leftNode = opd.pop();
        return phn;
    }

    public TreeNode buatPohon() {
        char kar;
        TreeNode treeKar;
        TreeNode cek;
        opr = new StackTree();
        opd = new StackTree();

        for (int i = 0; i < ung.length; i++) {
            kar = ung[i];
            karInfix.setData(kar);
            if (kar != ' ') {
                treeKar = new TreeNode(kar);
                if (kar == '(') {
                    opr.push(treeKar);
                } else if (kar == ')') {
                    cek = opr.pop();
                    opr.push(cek);
                    while (cek.data != '(') {
                        opd.push(gabung());
                        cek = opr.pop();
                        opr.push(cek);
                    }
                    opr.pop();
                } else if (karInfix.isOperator()) {
                    cek = opr.pop();
                    opr.push(cek);
                    while ((cek != null) && (valensi(kar) <= valensi(cek.data))) {
                        opd.push(gabung());
                        cek = opr.pop();
                        opr.push(cek);
                    }
                    opr.push(treeKar);
                } else if (karInfix.isOperand()) {
                    opd.push(treeKar);
                } else {
                    return null;
                }
            }
        }

        cek = opr.pop();
        opr.push(cek);
        while (cek != null) {
            opd.push(gabung());

            cek = opr.pop();
            opr.push(cek);
        }
        cek = opd.pop();
        opr = null;
        opd = null;
        return cek;
    }
}
