public class Staff extends Person {
    private String officeLocation;
    public Staff(String name, String email, int age, String officeLocation) {
        super(name, email, age);
        this.officeLocation = officeLocation;
    }

    public String getOfficeLocation() { return officeLocation;}
    public void setOfficeLocation(String officeLocation) {
        this.officeLocation = officeLocation;
    }

    public String toString() {
        return getName() +" "+ getEmail() +" "+ getAge()+ " "+ getOfficeLocation();
    }
}
