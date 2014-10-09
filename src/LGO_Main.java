/**
 * Created by Joe Gutierrez
 * Project 2
 * Professor Smith
 * 10/9/14
 */

enum Sex{MALE, FEMALE}
//Enumeration to represent Sex: Male/Female
//****************************************************************

class Olympian {
    String name;
    Sex sex;
    int age;


    Olympian(String name, Sex sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

}
//Olympian Class
//*****************************************************************


class OlympianManager {


    private Olympian olympian[] = new Olympian[]{
            new Olympian("Joe",Sex.MALE,35),
            new Olympian("Elizabeth",Sex.FEMALE,33),
            new Olympian("Dylan",Sex.MALE,9),
            new Olympian("Sophie",Sex.FEMALE,9),
            new Olympian("Milo",Sex.MALE,34),
            new Olympian("Nhi",Sex.FEMALE,32),
            new Olympian("Joe Sr.",Sex.MALE,56),
            new Olympian("Cynthia",Sex.FEMALE,55),
            new Olympian("Jaime",Sex.MALE,30),
            new Olympian("Nicole",Sex.FEMALE,30),
            new Olympian("John",Sex.MALE,30),
            new Olympian("Natalie",Sex.FEMALE,30),
            new Olympian("Walter",Sex.MALE,60),
            new Olympian("Sylvia",Sex.FEMALE,60),
            new Olympian("Brian",Sex.MALE,65),
            new Olympian("Theresa",Sex.FEMALE,65),
    };

    public Olympian[] getOlympians(){
        return  olympian;
    }

}//OlympianManager class
//****************************************************************


abstract class Event{

    String name;
    int playTo;
    boolean isPlayToExact;
    int playDistance;

    //abstract Event class

    public abstract String getExtraInfo();

}//getExtraInfo String
//****************************************************************

class CanJamEvent extends Event{

    int frisbeeSize;

    CanJamEvent(){
        name = "CanJam";
    };

    public String getExtraInfo(){
        return "";
    };

}// end CanJamEvent **********************************************

class CornHoleEvent extends Event{

    int numBeanBags;

    CornHoleEvent(){
        name = "CornHole";
    };

    public String getExtraInfo(){
        return "";
    };

}// end CornHoleEvent ********************************************

class HorseShoesEvent extends Event{

    int numHorseShoes;

    HorseShoesEvent(){ name = "HorseShoes"; };

    public String getExtraInfo(){
        return "";
    };

}// end HorseShoesEvent ********************************************

class LadderBallEvent extends Event{

    int numRungs;

    LadderBallEvent(){ name = "LadderBall"; };

    public String getExtraInfo(){
        return "";
    };

}// end LadderBallEvent ********************************************

class StickGameEvent extends Event{

    int frisbeeSize;

    StickGameEvent(){ name = "StickGame"; };

    public String getExtraInfo(){
        return "";
    };

}// end StickGameEvent ********************************************

class WashoosEvent extends Event{

    boolean hasAutoWinStick;
    int numWashoos;

    WashoosEvent(){
        name = "Washoos";
    };

    public String getExtraInfo(){
        return "";
    };

}// end WashoosEvent **********************************************


class EventManager{

    private Event event[] = new Event[]{
            new CanJamEvent(),
            new CornHoleEvent(),
            new HorseShoesEvent(),
            new LadderBallEvent(),
            new StickGameEvent(),
            new WashoosEvent(),
    };

    public Event[] getEvent() {
        return event;
    }
}
//EventManager class
//*****************************************************************

public class LGO_Main {
    public static OlympianManager om;
    public static EventManager em;

    public static void showOlympians()
    {
        Olympian olympian[] = om.getOlympians();
        System.out.println("******* Olympians ********\n");
        for(int i = 0; i < olympian.length; i++){
            System.out.println(olympian[i].name+" "+olympian[i].sex+" "+olympian[i].age);
        }

    }
    //Main class ***************************************************

    public static void showEvents() {
        Event event[] = em.getEvent();

        System.out.println("******** Events ********");
        for(int i =0; i < event.length; i++){
            System.out.println(event[i].name+"\n");
        }
    }
    //get Events ****************************************************

    public static void showHelp(){

        System.out.println("***** LAWN GAME OLYMPICS HELP ******\n*");
        System.out.println("* Arguments - argument details");
        System.out.println("* events e - list day\'s events");
        System.out.println("* olympians o - list day\'s olympians");
        System.out.println("* help h - display this help message");
        System.out.println("*\n*************************************");

    }
    //help screen for the user

    public static void init(){

        em = new EventManager();
        om = new OlympianManager();
    }
    //em and om initializer *****************************************

    public static void main(String[] args) {

        System.out.println("******* LAWN GAME OLYMPICS *********\n");

        init();

        for(int i=0; i<args.length; i++) {
            String arg = args[i].toLowerCase();
            if (arg.equals("e") || arg.equals("events")) {
                showEvents();
            } else if (arg.equals("o") || arg.equals("olympians")) {
                showOlympians();
            } else  if (arg.equals("h") || arg.equals("help")){
                showHelp();
            }

        }
     /*   if (args.length > 0)
        {

        } 
        else
        {
            showHelp();
        }*/
    }
}
//arguments that can be passed
//toLowerCase handles all types of case sensitive inputs from the user
//displays events, olympians, or help screen based on arguments that are passed
//*********************************************************************
