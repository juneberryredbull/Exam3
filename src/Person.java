public class Person {
    String name;
    String address;
    String phone_number;
    String email;

    public Person(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone_number = phone;
        this.email = email;
    }

    String getName() {
        return this.name;
    }

    String getAddress() {
        return this.address;
    }

    String getPhone_number() {
        return this.phone_number;
    }

    String getEmail() {
        return email;
    }
}
