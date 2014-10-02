/**
 * Created by Joe Gutierrez on 9/30/2014.
 * Project 1 redo
 * Prof Smith
 * Thurs 6:30-10:00
 */


public class olympic_lawn_games {

    public static String[] events;  //this is public and can be loaded externally by using load_events
    public static String[][] olympians; //this is public and can be loaded externally by using load_olympians

    //-------------------------------------------------------------------------------------
    public static void main(String[] args) {
        int count = args.length;
        String[] temp_events = new String[]{"Washoos", "Can Jam", "Horseshoes", "Cornhole", "Ladderball", "Stickgame"};
        String[][] temp_olympians = new String[][]{{"Joe", "Dylan", "Matthew", "Michael", "Joshua", "James", "Edward", "Milo", "Beth", "Ann", "Alyssa", "Corrin", "Nicole", "Natalie", "Cynthia", "Sylvia"}, {"Male", "Male", "Male", "Male", "Male", "Male", "Male", "Male", "Female", "Female", "Female", "Female", "Female", "Female", "Female", "Female"}, {"22", "21", "20", "21", "21", "27", "21", "21", "21", "19", "21", "21", "21", "21", "21", "21"}};
        if (count < 1) {   //if none or more than one argument is given, obviously the user made a mistake or doesn't know how to use the system
            System.out.println("\nINVALID ARGUMENTS:\n");
            help();  //print help to user
        } else     //***************************** NOTE: If any arguments are different in upper case in future, toLowerCase must be removed!

        {
            for (int i = 0; i < args.length; i++) {


                if (args[i].toLowerCase().equals("e") || args[i].toLowerCase().equals("events")) {
                    load_events(temp_events);  //this method isn't needed but using to show how this can be used externally
                    list_items(events);  //display single dimensional array to display
                } else if (args[i].toLowerCase().equals("o") || args[i].toLowerCase().equals("olympians")) {
                    load_olympians(temp_olympians); //this method isn't needed but using to show how this can be used externally
                    list_matrix_items(olympians); //displays matrix to display
                } else if (args[i].toLowerCase().equals("h") || args[i].toLowerCase().equals("help")) {
                    help();  //display help when user wants help
                } else {
                    System.out.println("INVALID ARGUMENTS:\n");  //this is called when arguments are not valid
                    help();

                }
            }
        }
    }
    //--------------------------------------------------------------------------------------
    //list_olympians
    //The global variable olympians must be loaded first!
    public static void list_olympians() {
        list_matrix_items(olympians);
    }
    //--------------------------------------------------------------------------------------
    //list_events
    //The global variable events must be loaded first!
    public static void list_events() {
        list_items(events);
    }
    //--------------------------------------------------------------------------------------
    //list_items will take any one dimensional array and display them
    //This method was created to display the events, but can also be used for any
    //arrays.
    //************NOTE: This method should be put into am array class for other projects
    public static void list_items(String InArray[]) {
        for (int i = 0; i < InArray.length; i++) {
            System.out.println(InArray[i]);  //will print newline after data
        }
    }
    //--------------------------------------------------------------------------------------
    //list_matrix_items will take a matrix and display the data
    //This method was created to display the olympians, but can also be used for any
    //matrices.
    //************NOTE: This method should be put into am array class for other projects
    public static void list_matrix_items(String InArray[][]) {
        for (int i = 0; i < InArray[0].length; i++) {  //traverse through 1 side of array
            for (int j = 0; j < InArray.length; j++) {   //traverse through other side
                System.out.print(InArray[j][i] + " ");   //for easily viewing concatenate space between
            }
            System.out.println("");  //give a new line between each row
        }
    }
    //--------------------------------------------------------------------------------------
    //load_olympians can be loaded externally (Should be a matrix)
    //This loads input olymps[][] matrix into the public variable.
    // You could set the public variable without this method but easier to understand
    public static void load_olympians(String olymps[][]) {
        olympians = olymps;
    }
    //--------------------------------------------------------------------------------------
    //load_events can be loaded externally (Should be a 1 dimensional array (list of events for day)
    //This loads input events[] array into the public event variable array
    // You could set the public variable without this method but easier to understand
    public static void load_events(String evnts[]) {
        events = evnts;
    }
    //--------------------------------------------------------------------------------------
    //help to the user when passing in help argument or when bad input on command line is used
    public static void help() {
        String Help_out = "\nolympic_lawn_games:\nArguments:\no - List the day's Olympians\nolympians - List the day's Olympians\ne - List the day's events\nevents - List the day's events\nh - Help\nhelp - Help";
        System.out.println(Help_out);
    }
}

