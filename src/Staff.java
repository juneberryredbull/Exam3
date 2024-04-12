public class Staff extends Employee {
    String title;

    public Staff(String name, String address, String phone, String email, String department, double salary, String hire, String title) {
        super(name, address, phone, email, department, salary, hire);
        this.title = title;
    }

    public String toString() {
        return "\nThis person's name is " + this.name + "\nTheir address is " + this.address +
                "\nTheir phone number is " + this.phone_number + "\nTheir email is " + this.email +
                "\nThey are a " + this.title + "\nThey work in " + this.department + "\nTheir monthly salary is $" + this.monthly_salary +
                "\nTheir hire date was " + this.date_hired;
    }
}
