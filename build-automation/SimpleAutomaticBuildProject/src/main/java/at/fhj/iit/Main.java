package at.fhj.iit;


public class Main {

    public static void main(String[] args)
    {
        Main hello = new Main();
        int number = hello.sayHello(args[0]);
        // System.out.println("Anzahl der ausgegebenen Zeichen: " + number);

        // "Konsolenprogramm"
        // Eingabe
        // Ausgabe


        // input wie oft die schleife durchlaufen wird
        // Schleife


    }

    // Methode erstellen -> Schleifen

    public int sayHello(String name)
    {
        String msg = "Hello " + name + "!";
        System.out.println(msg);
        return msg.length();
	}

    /**
     * print out a personlized goodbye
     * @param name
     * @return
     */
	public int sayGoodBye(String name){
        String msg = "Goodbye";
        System.out.println(msg);
        return msg.length();
    }

}
