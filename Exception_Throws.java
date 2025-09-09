class example {
    int salary;

    example(int salary) throws IllegalArgumentException {
        if(salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.salary = salary;
        System.out.println("Salary set to: " + salary);
    }
}

public class Exception_Throws {
    public static void main(String[] args) {
        try {
            example ex = new example(-5000);
        }

        catch(IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
