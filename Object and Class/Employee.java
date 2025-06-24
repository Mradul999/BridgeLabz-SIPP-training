public class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name   : " + name);
        System.out.println("ID     : " + id);
        System.out.println("Salary : Rs" + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Mradul", 101, 90000.00);
        emp1.displayDetails();
    }
}
