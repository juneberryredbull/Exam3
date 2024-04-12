public abstract class Employee extends Person {
    String department;
    double monthly_salary;
    String date_hired;

    public Employee(String name, String address, String phone, String email, String department, double salary, String hire) {
        super(name, address, phone, email);
        this.department = department;
        this.monthly_salary = salary;
        this.date_hired = hire;
    }
}
