// Use a custom exception.

// Create an exception.
class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    public String toString() {
        return "Result of " + n + " / " + d +
            " is non-integer.";
    }
}

class CustomExceptDemo {
    public static void main(String args[]) {
        // Here, number is longer than denom.
        int numer[] = {  4, 8, 16, 32, 64, 128, 256, 512 };
        int denom[] = {  2, 0, 4, 4, 0, 8 };

        for(int i = 0; i < numer.length; i++) {
            try {
                if((numer[i] % 2) != 0)
                    throw new 
                        NonIntResultException(numer[i], denom[i]);

                System.out.println(numer[i] + " / " +
                denom[i] + " is " +
                numer[i]/denom[i]);
            }
            catch (ArithmeticException exc) {
                // catch the exception
                System.out.println("Can't divide by Zero!");
                return; // return from catch
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                // catch the exception
                System.out.println("No matching element found.");
            }
            catch(NonIntResultException exc) {
                System.out.println(exc);
            }
        }
    }
}
