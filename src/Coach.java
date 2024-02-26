public class Coach extends Person  {
    private String role;
    //Constructor
    Coach(String firstName, String lastName, String role){
        super(firstName, lastName);
        setRole(role);
    }

    //Mutators
    public void setRole(String role){
        this.role = role;
    }
    //Accessors
    public String getRole(){
        return role;
    }

    public String toString(){
        return super.toString() + "\n   Role: " + getRole();
    }
}
