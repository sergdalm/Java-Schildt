// Implement Series.
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

class SeriesDemo {
    public static void main(String args[]) {
        ByTwos ob = new ByTwos();

        for(int i = 0; i < 5; i++)
            System.out.println("Next value is " +
                ob.getNext());

        System.out.println("\nResetting");
        ob.reset();
        for(int i = 0; i < 5; i++)
            System.out.println("Next value is " +
                ob.getNext());
        
        System.out.println("\nStartin at 100");
        ob.setStart(100);
        for(int i = 0; i < 5; i++)
            System.out.println("Next value is " +
                ob.getNext());
    }
}