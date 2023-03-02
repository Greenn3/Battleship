
class User {
    private String firstName;
    private String lastName;



    public void setFirstName(String firstName) {
        // write your code here
        if (firstName != null && !firstName.isEmpty()) {
            this.firstName = firstName;
        }
        
    }

    public void setLastName(String lastName) {
        // write your code here
        if (lastName != null && !lastName.isEmpty()) {
            this.lastName = lastName;
        }
       
    }

    public String getFullName() {
        if (firstName == null) {
            if (lastName == null) {
                return "Unknown";
            } else {
                return lastName;
            }
        } else {
            if (lastName == null) {
                return firstName;
            } else {
                return firstName + " " + lastName;
            }
        }

    }
}
/*public class Main{
    public static void main(String[] args){
        User tim = new User();
        tim.setFirstName("");
        tim.setLastName("Towler");
        System.out.println(tim.getFullName()); // Tim Towler

        User katie = new User();
        katie.setFirstName("Katie");
        katie.setLastName(null);
        System.out.println(katie.getFullName()); // Katie (without additional spaces)
    }
}

 */
