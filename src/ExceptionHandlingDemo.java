public class ExceptionHandlingDemo {
    public static int throwException() throws Exception {
        try {
            return realMethodThrowingException();
        }
        catch(Exception e){
            throw e;
        }
    }

    private static int realMethodThrowingException() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {
        try {
            int n = throwException();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("ENDED");
        }
    }
}
