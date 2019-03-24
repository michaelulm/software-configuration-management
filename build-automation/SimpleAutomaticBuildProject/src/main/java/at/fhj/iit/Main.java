package at.fhj.iit;


public class Main {

    public static void main(String[] args)
    {
        Main hello = new Main();
        int number = hello.sayHello(args[0]);
        // System.out.println("Anzahl der ausgegebenen Zeichen: " + number);
    }

    public int sayHello(String name)
    {
        String msg = "Hello " + name + "!";
        System.out.println(msg);
        return msg.length();
	}

}
