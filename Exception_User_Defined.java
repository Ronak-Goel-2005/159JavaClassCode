class InvalidEmployeeID extends Exception {
    InvalidEmployeeID(String message) {
        super(message);
    }
}

class Employee {
    int id;
    String name;

    Employee(int id, String name) throws InvalidEmployeeID {
        if(id <= 0) {
            throw new InvalidEmployeeID("Employee ID must be positive.");
        }

        this.id = id;
        this.name = name;
        System.out.println("Employee ID set to: " + id);
    }
}

public class Exception_User_Defined {
    public static void main(String[] args) {
        try {
            Employee emp = new Employee(-1, "John Doe");
        }

        catch(InvalidEmployeeID e) {
            System.out.println(e);
        }
    }
}
