import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class EchoRond {
    Rond rond;
    Socket socket;
    ObjectInputStream ois;
    ObjectOutputStream oos;


    public EchoRond(double rayon, int port) {
        rond = new Rond(rayon);
        try {
            socket = new Socket("localhost",port);
            o
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
