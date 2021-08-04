// Display a string backwards using recursion (my version).
class StrBack {
    int index;
    String str;

    void backwards(String OrgStr) {
        index = OrgStr.length() - 1;
        str = OrgStr;
        Out(str, index);
    }

    void Out(String s, int ind) {
        if(ind >= 0) {
            System.out.println(s.charAt(ind));
            ind--;
            Out(s, ind);
        }
    }
}
class BWDemo {
    public static void main(String args[]) {
        String s = ("This is a test");
        StrBack bk = new StrBack();
        bk.backwards(s);
    }
    
}
