import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException{
        int number, temp;
        System.out.println("Server start running");
        System.out.println("Waiting for Client connection");
        //Connection
        ServerSocket s1 = new ServerSocket(123);
        Socket ss = s1.accept();
        Scanner sc = new Scanner(ss.getInputStream());
        number = sc.nextInt();
        System.out.println("Hi Client, I received the number");
        //Update Number
        temp = number * 2;
        PrintStream p = new PrintStream(ss.getOutputStream());
        p.println(temp);
        System.out.println("Bye Client");
    }
}
