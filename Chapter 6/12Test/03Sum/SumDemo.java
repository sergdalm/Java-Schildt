class SumDemo {
        static int Sum(int ... v) {
            int result = 0;
            for(int i = 0; i < v.length; i++)
                result += v[i];
            return result;
        }

        public static void main(String args[]) {
        int x;
        x =  Sum(1, 2, 3, 4, 5);
        System.out.println(x);
    }
}
