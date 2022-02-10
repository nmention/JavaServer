import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EnvoiRond {
    Socket socket;
    ServerSocket serverSocket;
    ObjectOutputStream oos;
    ObjectInputStream ois;

    public EnvoiRond(int port){
        try {
            serverSocket = new ServerSocket(port);
            socket = serverSocket.accept();
            ois = new ObjectInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Rond waitObject(){
        Rond rond = null;
        Rond clone;

        try {
            rond = (Rond) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(rond);
        clone = rond.clone();
        System.out.println(clone);
        return clone;
    }
}
