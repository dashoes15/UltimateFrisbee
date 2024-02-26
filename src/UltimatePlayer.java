public class UltimatePlayer extends Person{
    //Variables
    private int jerseyNumber; //Jersey number for the instance
    private static int jerseyNumberCounter; //Keeps track of how many jerseys have been assigned
    private String position; //“handler” or “cutter”

    //Constructor
    UltimatePlayer(String firstName, String lastName, String position){
        super(firstName, lastName);
        setPosition(position);
    }

    //Methods:

    //Returns player’s position
    public String getPosition(){
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    //Works the same as the one in the Person class.
    // The only difference is that the power is multiplied by 4.
    private int throwDisc(int pow){
        if (pow < 1) {
            return 1;
        }else if (pow > 10){
            return 10;
        }else{
            return pow*4;
        }
    }

    String toString(){

    }

}
