package lesson15_Networking_16_Client_Server;

import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server implements Runnable {
    public void run() {
        try {
            ServerSocket server = new ServerSocket(5678, 10);
            //noinspection InfiniteLoopStatement
            while(true){
                Socket connection = server.accept();
                ObjectOutputStream output = new ObjectOutputStream(connection.getOutputStream());
                ObjectInputStream input = new ObjectInputStream(connection.getInputStream());
                output.writeObject("Вы прислали: " + /*(String)*/ input.readObject());
            }
//        } catch (UnknownHostException e) {
//        } catch (IOException e) {
//        } catch (HeadlessException e) {
//        } catch (ClassNotFoundException e) {}
        } catch (IOException | HeadlessException | ClassNotFoundException ignored) {
        }
    }
}
