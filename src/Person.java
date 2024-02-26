public class Person {
    //Variables
    private String firstName;
    private String lastName;
    //Constructor
    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //Mutators (Setters) - Methods that change things (void)
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //Accessors (Getters) - public (datatype)
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    private int throwDisc(int pow){
        if (pow < 1) {
            return 1;
        }else if (pow > 10){
            return 10;
        }else{
            return pow*2;
        }
    }



    public String toString(){
        return getLastName() + " , " + getFirstName() + "." ;
    }

}
