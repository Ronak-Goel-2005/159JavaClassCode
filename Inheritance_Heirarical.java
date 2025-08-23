class Employee {
    String name;
    int id;
    String org;

    void EmployeeDetails() {
        System.out.println("Details are: " + name + " " + id + " " + org);
    }
}

class Faculty extends Employee {
    String department;
    String subject;

    void FacultyDetails() {
        System.out.println("Details are: " + department + " " + subject);
    }
}

class Staff extends Faculty {
    String shift;

    void StaffDetails() {
        System.out.println("Details are: " + shift);
    }
}

public class Inheritance_Heirarical {
    public static void main(String[] args) {
        Staff x = new Staff();
        x.id = 101;
        x.name = "Ronak";
        x.org = "KIET";
        x.department = "CSEAIML";
        x.subject = "JAVA";
        x.shift = "A";

        x.EmployeeDetails();
        x.FacultyDetails();
        x.StaffDetails();
    }
}