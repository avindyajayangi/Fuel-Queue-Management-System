import java.util.ArrayList;
public class FuelQueue {

    private ArrayList<Passenger> passengersList = new ArrayList<Passenger>();
    private int income = 0;

    public int getQueueLength() {

        return passengersList.size();
    }

    public void addPassenger(String firstName, String lastName, String vehicleNumber, int noOfLiters) {

        passengersList.add(new Passenger(firstName,lastName,vehicleNumber,noOfLiters));
    }

    public void removePassenger(int x){

        passengersList.remove(x);
    }

    public String getFirstName(int x){
        return passengersList.get(x).getFirstName();
    }

    public String getSecondName(int x){
        return passengersList.get(x).getSecondName();
    }

    public int getNoOfLiters(int x){
        return passengersList.get(x).getNoOfLitters();
    }

    public ArrayList<Passenger> getPassengersList(){
        return passengersList;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }
}
