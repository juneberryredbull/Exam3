public class Student extends Person {
    private int status;

    public Student(String name, String address, String phone, String email, int status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String toString() {
        String[] statuses = {"Freshman", "Sophomore", "Junior", "Senior"};
        String s = statuses[this.status];
        return "\nThis person's name is " + this.name + "\nTheir address is " + this.address +
                "\nTheir phone number is " + this.phone_number + "\nTheir email is " + this.email +
                "\nThey are a " + s;
    }
}
