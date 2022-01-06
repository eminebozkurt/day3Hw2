public class Instructor extends User{

    private String instructorId;
    private String firstName;
    private String lastName;

    public Instructor(){

    }

    public Instructor(int id, String email, String instructorId, String firstName, String lastName) {
        super(id, email);
        this.instructorId = instructorId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(String instructorId) {
        this.instructorId = instructorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
