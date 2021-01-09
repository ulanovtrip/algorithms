package jetbrains_academy.java.basicsyntax;

class User {
    private String firstName;
    private String lastName;

    public User() {
        this.firstName = "";
        this.lastName = "";
    }

    public void setFirstName(String firstName) {
        if (firstName != null) {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName != null) {
            this.lastName = lastName;
        }
    }

    public String getFullName() {
        if (firstName.equals("") && lastName.equals("")) {
            return "Unknown";
        }
        if (firstName.equals("")) {
            return lastName;
        }
        if (lastName.equals("")) {
            return firstName;
        }
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName("Tim");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName());
    }
}