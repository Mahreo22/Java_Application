
public class RethrowException {

    public static void anyMethod2() throws Exception {
        throw new Exception("An error occurred in anyMethod2.");
    }

    public static void anyMethod() throws Exception {
        try {
            anyMethod2();
        } catch (Exception e) {
            System.out.println("Caught exception in anyMethod, rethrowing it.");
            throw e; 
        }
    }

    public static void main(String[] args) {
        try {
            anyMethod();
        } catch (Exception e) {
            System.out.println("Caught rethrown exception in main:");
            e.printStackTrace();
        }
    }
}

