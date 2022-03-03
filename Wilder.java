public class Wilder {
    
    // Instance variables
    private String firstName;
    private boolean present;

    // Constructor
    public Wilder(String firstName, boolean present) {
        this.firstName = firstName;
        this.present = present;
    }

    // Getter & Setter
    public String getFirstName() {
        return this.firstName;
    }

    public boolean isPresent() {
        return this.present;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    // Instance method
    public String whoAmI() {
        String result = "My name is " + this.firstName + " and I am ";
        if (this.present)
            result += "present";
        else
            result += "not present";
        return result;
    }
}