package at.fhj.iit;

public class Main {

    public static void main(String[] args){

        // Shortcut "sout + enter"
        System.out.println("Hello World");

        // init logger object from child project
        LoggerService ls = new LoggerService(true);

        ls.log("init welcome message");
        // init object from child project
        String welcomeMsg = StringService.firstToUpper("hello");
        ls.log("print welcome message");
        System.out.printf(welcomeMsg);

        ls.log("finished");
    }

}
