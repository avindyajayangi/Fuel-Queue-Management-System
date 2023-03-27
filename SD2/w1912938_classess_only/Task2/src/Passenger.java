public class Passenger {
    private String firstName;
    private String secondName;
    private String vehicleNumber;
    private int noOfLitters;

    public Passenger(String firstName, String secondName, String vehicleNumber, int noOfLitters){

        this.setFirstName(firstName);
        this.setSecondName(secondName);
        this.setVehicleNumber(vehicleNumber);
        this.setNoOfLitters(noOfLitters);

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getNoOfLitters() {
        return noOfLitters;
    }

    public void setNoOfLitters(int noOfLitters) {
        this.noOfLitters = noOfLitters;
    }
}
