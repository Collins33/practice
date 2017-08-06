import java.io.Console;
public class Hello{
    public static void main(String[] args) {
        Console myConsole =System.console();
        System.out.println("what is your name?");
        String myName=myConsole.readLine();
        System.out.println("Which year were you born?");
        String myYear=myConsole.readLine();
        Integer myAge= Integer.parseInt(myYear);
        Integer myActualAge= 2017-myAge;
        System.out.println("hello my name is: " + myName + " and i am " + myActualAge +" years old");
    }
}