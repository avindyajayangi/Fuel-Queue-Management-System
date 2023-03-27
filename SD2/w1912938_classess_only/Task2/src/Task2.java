import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 SD2 Course Work Task 02 (Classes Version).
 Fuel Center Program.
 G. W. Avindya Jayangi.
 */

public class Task2 {

    private static FuelQueue[] queues = new FuelQueue[5];
    private static int fuelQuantity = 6600;   // Basic number of fuel liters per day
    private static int fuelPrice = 430;         // Basic price of fuel per liter

    public static void main(String[] args) {

        initialise(queues);      //Calling the method 'initialise' to initialise array 'queues'

        while (true) {         //To loop until, user want to exit('999/EXT')

            //Option menu
            System.out.println(" ");
            System.out.println("--------------------------------------------------------");
            System.out.println(".............. Fuel Center .............");
            System.out.println("--------------------------------------------------------");
            System.out.println("******* Menu Option ********");
            System.out.println(" ");
            System.out.println("100 or VFQ: View all Fuel Queues.");
            System.out.println("101 or VEQ: View all Empty Queues.");
            System.out.println("102 or ACQ: Add Customer to a Queue.");
            System.out.println("103 or RPB: Remove Customer from a Queue.");
            System.out.println("104 or PCQ: Remove a served customer.");
            System.out.println("105 or VCS: View Customer Sorted in alphabetical order.");
            System.out.println("106 or SPD: Store Program Data into file.");
            System.out.println("107 or LPD: Load Program Data from file.");
            System.out.println("108 or LPD: View Remaining  Fuel Stock.");
            System.out.println("109 or AFS: Add Fuel Stock.");
            System.out.println("110 or IFQ: Income of Fuel Queue.");
            System.out.println("999 or EXT: Exit the Program.");
            System.out.println("--------------------------------------------------------");
            System.out.println(" ");

            //Getting the option code that user wants to run
            Scanner input = new Scanner(System.in);     //Creates an object to the Scanner class
            System.out.print("Enter the option you want: ");
            String function = input.nextLine().toUpperCase();     //Reads the user input and convert to uppercase letters
            System.out.println(" ");

            //Calling the relevant method according to the user input
            switch (function) {

                case "100":
                case "VFQ":
                    System.out.println("_ View all Fuel Queues option _");
                    viewFuelQueues();
                    System.out.println(" ");
                    break;
                case "101":
                case "VEQ":
                    System.out.println("_ View all Empty Queues _");
                    viewEmptyQueues();
                    System.out.println(" ");
                    break;
                case "102":
                case "ACQ":
                    System.out.println("_ Add customer to a Queue option _");
                    addCustomerToQueue();
                    System.out.println(" ");
                    break;
                case "103":
                case "RCQ":
                    System.out.println("_ Remove a customer from a Queue option _");
                    removeCustomerFromQueue();
                    System.out.println(" ");
                    break;
                case "104":
                case "PCQ":
                    System.out.println("_ Remove a served customer option _");
                    removeServedCustomer();
                    System.out.println(" ");
                    break;
                case "105":
                case "VCS":
                    System.out.println("_ View Customers Sorted in alphabetical order _");
                    viewCustomersStoredInAlphabetical();
                    System.out.println(" ");
                    break;
                case "106":
                case "SPD":
                    System.out.println("_ Store Program Data into file option _");
                    storeDataIntoFile();
                    System.out.println(" ");
                    break;
                case "107":
                case "LPD":
                    System.out.println("_ Load Program Data from File option _");
                    loadProgramData();
                    System.out.println(" ");
                    break;
                case "108":
                case "STK":
                    System.out.println("_ View Remaining Fuel Stock _");
                    viewRemainingFuel();
                    System.out.println(" ");
                    break;
                case "109":
                case "AFS":
                    System.out.println("_ Add Fuel Stock _");
                    addFuelToStock();
                    System.out.println(" ");
                    break;
                case "110":
                case "IFQ":
                    System.out.println("_ Income of Fuel Queue _");
                    getIncomeOfFuelQueue();
                    System.out.println(" ");
                    break;
                case "999":
                case "EXT":
                    exitProgram();
                    break;

                default:
                    System.out.println("Please check your input again! Refer the above option menu.");  //If user entered a wrong value this block will run
            }
        }
    }

    private static void initialise(FuelQueue[] queues) {
        //Method to initialise the queues as empty

        for (int x = 0; x < 5; x++ ) {
            queues[x] = new FuelQueue();
        }
    }


    public static void viewFuelQueues() {
        //Method to view all the queues

        System.out.println("Pump 1 Queue: ");
        if (!(queues[0].getQueueLength() == 0)) {
            for (int x = 0; x < queues[0].getQueueLength(); x++) {
                if (queues[0].getFirstName(x).equals("empty")) {           //Check whether the position is empty or not
                    System.out.println("Position " + (x) + " is empty.");
                } else {
                    System.out.println("Position " + (x) + " is occupied by " + queues[0].getFirstName(x) + " " + queues[0].getSecondName(x));
                }
            }
        } else {
            System.out.println("Queue 1 is empty.");
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Pump 2 Queue: ");
        if (!(queues[1].getQueueLength() == 0)) {
            for (int x = 0; x < queues[1].getQueueLength(); x++) {
                if (queues[1].getFirstName(x).equals("empty")) {           //Check whether the position is empty or not
                    System.out.println("Position " + (x) + " is empty.");
                } else {
                    System.out.println("Position " + (x) + " is occupied by " + queues[1].getFirstName(x) + " " + queues[1].getSecondName(x));
                }
            }
        } else {
            System.out.println("Queue 2 is empty.");
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Pump 3 Queue: ");
        if (!(queues[2].getQueueLength() == 0)) {
        for (int x = 0; x < queues[2].getQueueLength(); x++) {
            if (queues[2].getFirstName(x).equals("empty")) {           //Check whether the position is empty or not
                System.out.println("Position " + (x) + " is empty.");
            } else {
                System.out.println("Position " + (x) + " is occupied by " + queues[2].getFirstName(x) + " " + queues[2].getSecondName(x));
            }
        }
        } else {
            System.out.println("Queue 3 is empty.");
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Pump 4 Queue: ");
        if (!(queues[0].getQueueLength() == 0)) {
            for (int x = 0; x < queues[3].getQueueLength(); x++) {
                if (queues[3].getFirstName(x).equals("empty")) {           //Check whether the position is empty or not
                    System.out.println("Position " + (x) + " is empty.");
                } else {
                    System.out.println("Position " + (x) + " is occupied by " + queues[3].getFirstName(x) + " " + queues[3].getSecondName(x));
                }
            }
        } else {
            System.out.println("Queue 4 is empty.");
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Pump 5 Queue: ");
        if (!(queues[0].getQueueLength() == 0)) {
            for (int x = 0; x < queues[4].getQueueLength(); x++) {
                if (queues[4].getFirstName(x).equals("empty")) {           //Check whether the position is empty or not
                    System.out.println("Position " + (x) + " is empty.");
                } else {
                    System.out.println("Position " + (x) + " is occupied by " + queues[4].getFirstName(x) + " " + queues[4].getSecondName(x));
                }
            }
        } else {
            System.out.println("Queue 5 is empty.");
        }
        System.out.println("----------------------------------------------------------------");

    }

    public static void viewEmptyQueues() {
        //Method to view all the empty queue

        System.out.println("Pump 1 Queue: ");
        for (int x = 5; x > queues[0].getQueueLength()-1; x--) {
            System.out.println("Position " + x + " is empty.");
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Pump 2 Queue: ");
        for (int x = 5; x > queues[1].getQueueLength()-1; x--) {
            System.out.println("Position " + x + " is empty.");
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Pump 3 Queue: ");
        for (int x = 5; x > queues[2].getQueueLength()-1; x--) {
            System.out.println("Position " + x + " is empty.");
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Pump 4 Queue: ");
        for (int x = 5; x > queues[3].getQueueLength()-1; x--) {
            System.out.println("Position " + x + " is empty.");
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Pump 5 Queue: ");
        for (int x = 5; x > queues[4].getQueueLength()-1; x--) {
            System.out.println("Position " + x + " is empty.");
        }
        System.out.println("----------------------------------------------------------------");

    }

    public static int findShortestQueue() {
        //Method to find the shortest queue

        int shortestQueue = 0;
        int shortestQueueLength = queues[shortestQueue].getQueueLength();

        for (int i = 1; i < 5; i++) {
            if (queues[i].getQueueLength() < shortestQueueLength) {
                shortestQueueLength = queues[i].getQueueLength();
                shortestQueue = i;
            }
        }

        return shortestQueue;
    }

    public static void addCustomerToQueue() {
        //Method to add customers to a booth

            if (queues[0].getQueueLength() < 6 || queues[1].getQueueLength() < 6 || queues[2].getQueueLength() < 6 && queues[3].getQueueLength() < 6 || queues[4].getQueueLength() < 6) {
                Scanner in = new Scanner(System.in);
                System.out.print("Enter customer's first name: ");
                String firstName = in.next();
                System.out.print("Enter customer's second name: ");
                String secondName = in.next();
                System.out.print("Enter customer's vehicle number: ");
                String vehicleNumber = in.next();
                System.out.print("Enter the required no of liters: ");
                int noOfLiters = in.nextInt();
                if (fuelQuantity >= noOfLiters) {
                    int shortestQueueIndex = findShortestQueue();
                    FuelQueue selectedQueue = queues[findShortestQueue()];
                    selectedQueue.addPassenger(firstName, secondName, vehicleNumber, noOfLiters);
                    fuelQuantity -= noOfLiters;
                    if (fuelQuantity <= 500) {
                        System.out.println("Warning! Low fuel level.");
                    }
                    selectedQueue.setIncome(selectedQueue.getIncome() + (noOfLiters * fuelPrice));

                    System.out.println("Customer " + firstName + " " + secondName + " successfully added to the queue " + (++shortestQueueIndex));
                } else {
                    System.out.println("Insufficient fuel in the stock. Only " + fuelQuantity + " liters available.");
                }
            } else {
                System.out.println("Sorry! All the queues are full. Please try again later.");
            }
    }

    public static int findCustomerPosition(String name) {
        //Method to find the position of a customer in the queue

        int position = 0;
        boolean found = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < queues[i].getQueueLength(); j++) {
                if (queues[i].getFirstName(j).equals(name)) {
                    position = j;
                    found = true;
                }
            }
        }
        if (found) {
            return position;
        } else {
            return -1;
        }
    }

    public static int findCustomerQueue(String name) {
        //Method to find the position of a customer in the queue

        int queueNo = 0;
        boolean found = false;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < queues[i].getQueueLength(); j++) {
                if (queues[i].getFirstName(j).equals(name)) {
                    queueNo = i;
                    found = true;
                }
            }
        }
        if (found) {
            return queueNo;
        } else {
            return -1;
        }
    }

    public static void removeCustomerFromQueue() {
        //Method to remove a customer

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the removed customer's first name: ");
        String name = in.next();
        int position = findCustomerPosition(name);
        int queueNo = findCustomerQueue(name);

        if (position == -1) {
            System.out.println("Customer not found! Please check the name and try again.");
        } else {
            fuelQuantity += queues[queueNo].getNoOfLiters(position);
            queues[queueNo].removePassenger(position);
            System.out.println("Customer " + name + " successfully removed from the queue " + (queueNo));
        }

    }
    public static void removeServedCustomer() {
        //Method to remove a served customer

        Scanner input = new Scanner(System.in);     //Creates an object to the Scanner class
        System.out.print("Enter the queue number of the served customer (1-5): ");
        int queueNo = input.nextInt();
        if (queueNo > 5 || queueNo < 1) {
            System.out.println("Invalid queue number! Please check the queue number and try again.");
        } else {
            if (!(queues[queueNo-1].getQueueLength() == 0)) {
                System.out.println("Customer " + queues[queueNo - 1].getFirstName(0) + " successfully removed from the queue " + (queueNo));
                queues[queueNo - 1].removePassenger(0);
            } else {
                System.out.println("No passenger to remove, queue is empty!");
            }
        }
    }


    public static void viewCustomersStoredInAlphabetical() {
        //Method to view the customer's name in alphabetical order
        //Referenced from: https://www.studytonight.com/java-programs/java-program-to-sort-an-array-in-alphabetical-order

        String[] alphabeticalOrder1 = new String[queues[0].getQueueLength()];
        String[] alphabeticalOrder2 = new String[queues[1].getQueueLength()];
        String[] alphabeticalOrder3 = new String[queues[2].getQueueLength()];
        String[] alphabeticalOrder4 = new String[queues[3].getQueueLength()];
        String[] alphabeticalOrder5 = new String[queues[4].getQueueLength()];

        for (int y = 0; y< queues[0].getQueueLength(); y++) {
            alphabeticalOrder1[y] = queues[0].getFirstName(y);
        }
        for (int y = 0; y< queues[1].getQueueLength(); y++) {
            alphabeticalOrder2[y] = queues[1].getFirstName(y);
        }
        for (int y = 0; y< queues[2].getQueueLength(); y++) {
            alphabeticalOrder3[y] = queues[2].getFirstName(y);
        }
        for (int y = 0; y< queues[3].getQueueLength(); y++) {
            alphabeticalOrder4[y] = queues[3].getFirstName(y);
        }
        for (int y = 0; y< queues[4].getQueueLength(); y++) {
            alphabeticalOrder5[y] = queues[4].getFirstName(y);
        }

        for(int a=0; a<(alphabeticalOrder1.length-1); a++) {
            for(int b=a+1; b<alphabeticalOrder1.length; b++) {
                if((alphabeticalOrder1[a].toLowerCase(Locale.ROOT)).compareTo(alphabeticalOrder1[b].toLowerCase(Locale.ROOT))> 0) {
                    String temp = alphabeticalOrder1[a];
                    alphabeticalOrder1[a] = alphabeticalOrder1[b];
                    alphabeticalOrder1[b] = temp;
                    //Sorted elements of the array to alphabetical order
                }
            }
        }

        for(int a=0; a<(alphabeticalOrder2.length-1); a++) {
            for(int b=a+1; b<alphabeticalOrder2.length; b++) {
                if((alphabeticalOrder2[a].toLowerCase(Locale.ROOT)).compareTo(alphabeticalOrder2[b].toLowerCase(Locale.ROOT))> 0) {
                    String temp = alphabeticalOrder2[a];
                    alphabeticalOrder2[a] = alphabeticalOrder2[b];
                    alphabeticalOrder2[b] = temp;
                    //Sorted elements of the array to alphabetical order
                }
            }
        }

        for(int a=0; a<(alphabeticalOrder3.length-1); a++) {
            for(int b=a+1; b<alphabeticalOrder3.length; b++) {
                if((alphabeticalOrder3[a].toLowerCase(Locale.ROOT)).compareTo(alphabeticalOrder3[b].toLowerCase(Locale.ROOT))> 0) {
                    String temp = alphabeticalOrder3[a];
                    alphabeticalOrder3[a] = alphabeticalOrder3[b];
                    alphabeticalOrder3[b] = temp;
                    //Sorted elements of the array to alphabetical order
                }
            }
        }

        for(int a=0; a<(alphabeticalOrder4.length-1); a++) {
            for(int b=a+1; b<alphabeticalOrder4.length; b++) {
                if((alphabeticalOrder4[a].toLowerCase(Locale.ROOT)).compareTo(alphabeticalOrder4[b].toLowerCase(Locale.ROOT))> 0) {
                    String temp = alphabeticalOrder4[a];
                    alphabeticalOrder4[a] = alphabeticalOrder4[b];
                    alphabeticalOrder4[b] = temp;
                    //Sorted elements of the array to alphabetical order
                }
            }
        }

        //Displaying the sorted array
        System.out.println("Pump 1 customers: " + Arrays.toString(alphabeticalOrder1));
        System.out.println("Pump 2 customers: " + Arrays.toString(alphabeticalOrder2));
        System.out.println("Pump 3 customers: " + Arrays.toString(alphabeticalOrder3));
        System.out.println("Pump 4 customers: " + Arrays.toString(alphabeticalOrder4));
        System.out.println("Pump 5 customers: " + Arrays.toString(alphabeticalOrder5));
    }


    public static void storeDataIntoFile() {
        //Method to store program data into the file
        //Referenced from: https://www.w3schools.com/java/java_files_create.asp

        try {
            FileWriter writer = new FileWriter("DetailsOfFuelStation");     //Creating the file "DetailsOfFuel"
            writer.write("Fuel queue1 info - " + Arrays.toString(queues[0].getPassengersList().toArray()));  //Write the customers information
            writer.write("\nFuel queue2 info - " + Arrays.toString(queues[1].getPassengersList().toArray()));
            writer.write("\nFuel queue3 info - " + Arrays.toString(queues[2].getPassengersList().toArray()));
            writer.write("\nFuel queue4 info - " + Arrays.toString(queues[3].getPassengersList().toArray()));
            writer.write("\nFuel queue5 info - " + Arrays.toString(queues[4].getPassengersList().toArray()));
            writer.write("\nNumber of remaining fuel = " + fuelQuantity);    //Write the number of remaining fuel in the stock
            writer.close();
            System.out.println("Successfully stored data into the file.");
        }
        catch (IOException e) {     //Runs if there was an error in file creating or writing
            System.out.println("An error occurred while storing data into the file. Please try again later.");
            e.printStackTrace();    //Tool used to handle exceptions and errors (gives the line number and class name where exception happened)
        }
    }


    public static void loadProgramData() {
        //Method to read the data stored in the file
        //Referenced from: https://www.w3schools.com/java/java_files_create.asp

        try {
            File f = new File("DetailsOfFuelStation");  //Accessing the file
            Scanner read = new Scanner(f);
            while (read.hasNextLine()) {    //Print data in the file line by line
                String data = read.nextLine();  //Assigning the data in the file line by line to the variable "data"
                System.out.println(data);
            }
            read.close();   //Closing the opened file
        }
        catch (FileNotFoundException e) {    //Runs if there was an error while reading the file
            System.out.println("An error occurred while reading data from the file.");
            e.printStackTrace();    //Tool used to handle exceptions and errors (gives the line number and class name where exception happened)
        }
    }


    public static void viewRemainingFuel() {
        //Method to view remaining fuel in the stock

        System.out.println("Quantity of remaining fuel - " + fuelQuantity);
    }


    public static void addFuelToStock() {
        //Method to add fuel to the stock

        if (fuelQuantity <=6600) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the fuel quantity which will be added to the stock: ");
            if (input.hasNextInt()) {               //Check the data type of user input
                int newFuel = input.nextInt();
                fuelQuantity = fuelQuantity + newFuel;  //Adding the number of newly added fuel to the stock
                System.out.println(newFuel + "L has been added to the stock.");
            } else {
                System.out.println("Please check your input again! Input should be an integer.");
            }
        }
        else {
            System.out.println("You can't add more fuel to the stock as it is full.");
        }
    }

    public static void getIncomeOfFuelQueue() {
        //Method to get the income of fuel queues

        System.out.println("Total income of fuel queue no.1 - Rs." + queues[0].getIncome());
        System.out.println("Total income of fuel queue no.2 - Rs." + queues[1].getIncome());
        System.out.println("Total income of fuel queue no.3 - Rs." + queues[2].getIncome());
        System.out.println("Total income of fuel queue no.4 - Rs." + queues[3].getIncome());
        System.out.println("Total income of fuel queue no.5 - Rs." + queues[4].getIncome());
    }


    public static void exitProgram() {
        //Method to exit from the program

        System.out.println("Thank you for using 'Fuel Center Programme'. \n \t\t\t\t\t\t Stay safe!");
        System.exit(0);
    }

}
