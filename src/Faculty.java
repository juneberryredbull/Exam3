public class Faculty extends Employee {
    String office_hours;
    private int rank;

    public Faculty(String name, String address, String phone, String email, String department, double salary, String hire, String hours, int rank) {
        super(name, address, phone, email, department, salary, hire);
        this.office_hours = hours;
        this.rank = rank;
    }

    public String toString() {
        String[] ranks = new String[]{"Junior", "Senior"};
        String s = ranks[this.rank];
        return "\nThis person's name is " + this.name + "\nTheir address is " + this.address +
                "\nTheir phone number is " + this.phone_number + "\nTheir email is " + this.email +
                "\nThey are a " + s + "\nThey work in " + this.department + "\nTheir monthly salary is $" + this.monthly_salary +
                "\nTheir hire date was " + this.date_hired + "\nTheir office hours are " + this.office_hours;
    }
}
