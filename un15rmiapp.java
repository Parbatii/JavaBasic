import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//declare remote interface
public interface Hello extends Remote
{
    String sayHello() throws RemoteException;
}

//implement remote interface
public class un15rmiapp extends UnicastRemoteObject implements Hello
{
    public un15rmiapp() throws RemoteException
    {
        super();
    }
    public String sayHello()
    {
        return "Hello world!";
    }
}

//create server

public class server
{
    public static void main(String[]args)
    {
       try
       {
           un15rmiapp ob = new un15rmiapp();
           Naming.rebind("/Hello",ob);
           System.out.println("server created!");
       }
       catch(Exception e) {
           System.out.println("server fain" + e);
       }
    }
}

//create client
public class client
{
    public static void main(String[]args)
    {
        try
        {
            Hello ob = (Hello) Naming.lookup("/Hello",ob);
            String message = ob.un15rmiapp(); //request method or invoke
            System.out.println(message);
        }
        catch(Exception e)
        {
            System.out.println("client exception "+e);
        }
    }
}
