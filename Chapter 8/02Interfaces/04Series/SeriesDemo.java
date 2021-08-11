// Demonstrate interface references.
class ByTwos implements Series {
    int start = 0;
    int val = 0;

    ByTwos() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class ByThrees implements Series {
    int start = 0;
    int val = 0;

    ByThrees() {
        start = 0;
        val = 0;
    }

    public int getNext() {
        val += 3;
        return val;
    }

    public void reset() {
        val = start;
    }

    public void setStart(int x) {
        start = x;
        val = x;
    }
}

class SeriesDemo {
    public static void main(String args[]) {
       ByTwos twoOb = new ByTwos();
       ByThrees threeOb = new ByThrees();
       Series ob;

       for(int i = 0; i < 5; i++) {
           ob = twoOb;
           System.out.println("Next ByTwos values is " +
                ob.getNext());

                ob = threeOb;
            System.out.println("Next ByThrees valuse is " +
                ob.getNext());
       }
    }
}