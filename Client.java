import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws UnknownHostException, IOException{
        int number, temp;
        Scanner sc = new Scanner(System.in);
        //Socket
        Socket s = new Socket("127.0.0.1", 123);
        Scanner sc1 = new Scanner(s.getInputStream());
        System.out.println("This is Client");
        System.out.println("Hello Server this is the number");
        System.out.println("Enter a number: ");
        number = sc.nextInt();
        //Send to server
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(number);
        //Client accept the updated value
        temp = sc1.nextInt();
        System.out.println("The updated number is: " + temp);
        System.out.println("Thank you Server");
    }
}
