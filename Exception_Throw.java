public class Exception_Throw {
    public static void main(String[] args) {
        int age = 15;
        
        if(age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        
        else {
            System.out.println("Access granted - You are old enough!");
        }
    }
}
