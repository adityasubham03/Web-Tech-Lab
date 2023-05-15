public class cmdargs {
    public static void main(String[] args) {
        int sum = 0;
        try {
            if (args.length < 5)
                throw new CheckArgumentException("Command Line Arguments Length Smaller than 5");
            else {
                for (int i = 0; i < args.length; i++)
                    sum += Integer.parseInt(args[i]);
            }ine Arguments Length 

        } catch (CheckArgumentException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("The sum is "+sum);

    }
    
    static class CheckArgumentException extends Exception {
        public CheckArgumentException(String message) {
            super(message);
        }
    }
}
