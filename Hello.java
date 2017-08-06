import java.io.Console;
public class Hello{
    public static void main(String[] args) {
        Console myConsole =System.console();
        System.out.println("What is your name?");
        String name=myConsole.readLine();
        System.out.println("Hello "+ name);
    }
}