import java.io.FileNotFoundException;
import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 SD2 Course Work Task 01 (Array Version).
 Fuel Center Program.
 G . W. Avindya Jayangi - w1912938 (20210241).
 */

public class Task1 {

    private static String[] pump1 = new String[6];
    private static String[] pump2 = new String[6];
    private static String[] pump3 = new String[6];
    private static int fuelQuantity = 6600;   // Basic number of fuel liters per day

    public static void main(String[] args) {

        initialise(pump1, pump2, pump3);      //Calling the method 'initialise' to initialise array 'fuelCenter'

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
                case "999":
                case "EXT":
                    exitProgram();
                    break;

                default:
                    System.out.println("Please check your input again! Refer the above option menu.");  //If user entered a wrong value this block will run
            }
        }
    }

    private static void initialise( String pump1[], String pump2[], String pump3[]) {
        //Method to initialise the queues as empty

        for (int x = 0; x < 6; x++ ) {      //Assigning  all the 6 places as "empty" for the 3 queses
            pump1[x] = "empty";
            pump2[x] = "empty";
            pump3[x] = "empty";
        }
    }


    public static void viewFuelQueues() {
        //Method to view all the queues

        System.out.println("Pump 1 Queue: ");
        for (int x = 0; x < 6; x++)
        {
            if (pump1[x].equals("empty")) {           //Check whether the position is empty or not
                System.out.println("Position " + x + " is empty.");
            }
            else {
                System.out.println("Position " + x + " is occupied by " + pump1[x]);
            }
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Pump 2 Queue: ");
        for (int x = 0; x < 6; x++)
        {
            if (pump2[x].equals("empty")) {           //Check whether the position is empty or not
                System.out.println("Position " + x + " is empty.");
            }
            else {
                System.out.println("Position " + x + " is occupied by " + pump2[x]);
            }
        }
        System.out.println("----------------------------------------------------------------");

        System.out.println("Pump 3 Queue: ");
        for (int x = 0; x < 6; x++)
        {
            if (pump3[x].equals("empty")) {           //Check whether the position is empty or not
                System.out.println("Position " + x + " is empty.");
            }
            else {
                System.out.println("Position " + x + " is occupied by " + pump3[x]);
            }
        }
        System.out.println("----------------------------------------------------------------");
    }


    public static void viewEmptyQueues() {
        //Method to view all the empty queue

        System.out.println("Pump 1 Queue: ");
        for (int i = 1; i <= pump1.length; i++) {
            if (pump1[i-1].equals("empty")) {
                System.out.println("Position number " + i + " is empty.");      //Check whether the queue is empty or not
            }
        }

        System.out.println("Pump 2 Queue: ");
        for (int i = 1; i <= pump2.length; i++) {
            if (pump2[i-1].equals("empty")) {
                System.out.println("Position number " + i + " is empty.");      //Check whether the queue is empty or not
            }
        }

        System.out.println("Pump 3 Queue: ");
        for (int i = 1; i <= pump3.length; i++) {
            if (pump3[i-1].equals("empty")) {
                System.out.println("Position number " + i + " is empty.");      //Check whether the queue is empty or not
            }
        }
        System.out.println(" ");
        System.out.println("Note: If all the positions are occupied nothing will display in each pump.");
    }

    public static void addCustomerToQueue() {
        //Method to add customers to a booth

        boolean assigned = false;
        String question = "YES";
        while (question.equals("YES")) {
            Scanner in = new Scanner(System.in);      //Creates an object to the Scanner class
            System.out.print("Enter the queue number (1-3): ");
            if (in.hasNextInt()) {       //Check the data type of user input
                int pumpNumber = (in.nextInt()) - 1;
                if ((pumpNumber >= 0) && (pumpNumber < 3)) {      //Check the range of user input
                    System.out.print("Enter the customer's name: ");
                    String customerName = in.next();
                    if (pumpNumber == 0) {
                        for (int i = 0; i < pump1.length; i++) {
                            if (pump1[i].equals("empty")) {
                                pump1[i] = customerName;
                                assigned = true;
                                System.out.println("Customer " + customerName + " is added to the " + ++i + " position of the queue number 01.");
                                fuelQuantity = fuelQuantity - 10;
                                question = "No";
                                break;
                            }
                        }
                        if (!assigned) {
                            System.out.println("The queue is full. Please try again with another queue.");
                            break;
                        }
                    }
                    else if (pumpNumber == 1) {
                        for (int i = 0; i < pump2.length; i++) {
                            if (pump2[i].equals("empty")) {
                                pump2[i] = customerName;
                                assigned = true;
                                System.out.println("Customer " + customerName + " is added to the " + ++i + " position of the queue number 02.");
                                fuelQuantity = fuelQuantity - 10;
                                question = "No";
                                break;
                            }
                        }
                        if (!assigned) {
                            System.out.println("The queue is full. Please try again with another queue.");
                            break;
                        }
                    }
                    else {
                        for (int i = 0; i < pump3.length; i++) {
                            if (pump3[i].equals("empty")) {
                                pump3[i] = customerName;
                                assigned = true;
                                System.out.println("Customer " + customerName + " is added to the " + i + " position of the queue number 03.");
                                fuelQuantity = fuelQuantity - 10;
                                question = "No";
                                break;
                            }
                        }
                        if (!assigned) {
                            System.out.println("The queue is full. Please try again with another queue.");
                            break;
                        }
                    }
                }
                else {
                    System.out.println("Please check your input again! Queue number should be between 1 and 3.");
                }
            }
            else {
                System.out.println("Please check the queue number! (Input should be an integer).");
                question = "YES";
                continue;
            }
        }
    }

    public static void removeCustomerFromQueue() {
        //Method to remove a customer

        boolean removed = false;
        String question = "YES";
        while (question.equals("YES")) {
            Scanner input = new Scanner(System.in);     //Creates an object to the Scanner class
            System.out.print("Enter the queue number of the removed customer (1-3): ");
            if (input.hasNextInt()) {                   //Check the data type of user input
                int pumpNumber = (input.nextInt()) - 1;
                if ((pumpNumber>=0) && (pumpNumber<3)) {    //Check the range of user input
                    System.out.println("Enter the customer's name: ");
                    String customerName = input.next();
                    if (pumpNumber == 0) {
                        for (int i = 0; i < pump1.length; i++) {
                            if (pump1[i].equals(customerName)) {
                                pump1[i] = "empty";
                                removed = true;
                                question = "No";
                                System.out.println("Customer " + customerName + " removed from the queue number 01.");
                                break;
                            }
                        }
                        if (!removed) {
                            System.out.println("Customer " + customerName + " not found in the queue number 01.");
                            break;
                        }
                    }
                    if (pumpNumber == 1) {
                        for (int i = 0; i < pump2.length; i++) {
                            if (pump2[i].equals(customerName)) {
                                pump2[i] = "empty";
                                removed = true;
                                question = "No";
                                System.out.println("Customer " + customerName + " removed from the queue number 02.");
                                break;
                            }
                        }
                        if (!removed) {
                            System.out.println("Customer " + customerName + " not found in the queue number 02.");
                            break;
                        }
                    }
                    else {
                        for (int i = 0; i < pump3.length; i++) {
                            if (pump3[i].equals(customerName)) {
                                pump3[i] = "empty";
                                removed = true;
                                question = "No";
                                System.out.println("Customer " + customerName + " removed from the queue number 03.");
                                break;
                            }
                        }
                        if (!removed) {
                            System.out.println("Customer " + customerName + " not found in the queue number 03.");
                            break;
                        }
                    }

                }
                else {
                    System.out.println("Please check the input! (Input should be between 1-3)");
                }
            }
            else {
                System.out.println("Please check the input and try again! (Input should be an integer).");
                question = "YES";
                continue;
            }
        }
    }
    public static void removeServedCustomer() {
        //Method to remove a served customer

        Scanner input = new Scanner(System.in);     //Creates an object to the Scanner class
        System.out.print("Enter the queue number of the removed customer (1-3): ");
        if (input.hasNextInt()) {                   //Check the data type of user input
            int pumpNumber = (input.nextInt()) - 1;
            if ((pumpNumber>=0) && (pumpNumber<3)) {    //Check the range of user inpu
                if (pumpNumber == 0) {
                    for (int i = 1; i < pump1.length-1; i++) {
                        String name = pump1[i];
                        pump1[i-1] = name;
                        pump1[5] = "empty";
                    }
                    System.out.println("served customer successfully removed");
                }
                if (pumpNumber == 1) {
                    for (int i = 1; i < pump2.length-1; i++) {
                        String name = pump2[i];
                        pump2[i-1] = name;
                        pump2[5] = "empty";
                    }
                    System.out.println("served customer successfully removed");
                }
                else {

                    for (int i = 1; i < pump3.length-1; i++) {
                            String name = pump3[i];
                            pump3[i-1] = name;
                            pump3[5] = "empty";
                    }
                    System.out.println("served customer successfully removed");

                }

            }
            else {
                System.out.println("Please check the input! (Input should be between 1-3)");
            }
        }
        else {
            System.out.println("Please check the input and try again! (Input should be an integer).");
        }

    }


    public static void viewCustomersStoredInAlphabetical() {
        //Method to view the customer's name in alphabetical order
        //Referenced from: https://www.studytonight.com/java-programs/java-program-to-sort-an-array-in-alphabetical-order

        String[] alphabeticalOrder1 = new String[6];//Creates an array called 'alphabeticalOrder'
        String[] alphabeticalOrder2 = new String[6];
        String[] alphabeticalOrder3 = new String[6];

        for (int y = 0; y< 6; y++) {
            alphabeticalOrder1[y] = pump1[y];//Getting values from the 'fuelCenter' array and passing them to the 'alphabeticalOrder' array
            alphabeticalOrder2[y] = pump2[y];
            alphabeticalOrder3[y] = pump3[y];
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

        System.out.println(Arrays.toString(alphabeticalOrder1));//Displaying the sorted array
        System.out.println(Arrays.toString(alphabeticalOrder2));
        System.out.println(Arrays.toString(alphabeticalOrder3));
    }


    public static void storeDataIntoFile() {
        //Method to store program data into the file
        //Referenced from: https://www.w3schools.com/java/java_files_create.asp

        try {
            FileWriter writer = new FileWriter("DetailsOfFuel");     //Creating the file "DetailsOfFuel"
            writer.write("Fuel queue1 info - " + Arrays.toString(pump1));  //Write the customers information
            writer.write("\nFuel queue2 info - " + Arrays.toString(pump2));
            writer.write("\nFuel queue3 info - " + Arrays.toString(pump3));
            writer.write("\nNumber of remaining fuel = " + fuelQuantity);    //Write the number of remaining fuel in the stock
            writer.close();
            System.out.println("Successfully stored data into the file.");
        }
        catch (IOException e) {     //Runs if there was an error in file creating or writing
            System.out.println("An error occurred while storing data into the file. Please try again.");
            e.printStackTrace();    //Tool used to handle exceptions and errors (gives the line number and class name where exception happened)
        }
    }


    public static void loadProgramData() {
        //Method to read the data stored in the file
        //Referenced from: https://www.w3schools.com/java/java_files_create.asp

        try {
            File f = new File("DetailsOfFuel");  //Accessing the file
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
                System.out.println(newFuel + ", new fuel has been added to the stock.");
            } else {
                System.out.println("Please check your input again! Input should be an integer.");
            }
        }
        else {
            System.out.println("You can't add more fuel to the stock as it is full.");
        }
    }


    public static void exitProgram() {
        //Method to exit from the program

        System.out.println("Thank you for using 'Fuel Center Programme'. \n                  Stay safe!");
        System.exit(0);
    }

}
