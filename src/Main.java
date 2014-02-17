import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import client.ClientSocket;


public class Main {
	private static final int STRINGS = 1;
	private static final int OBJECTS = 2;
	private static int mode;
	private static ClientSocket CS;
	private static int port = 10000;
	
	public static void main(String[] args)throws IOException {
		mode = STRINGS;
        /*Socket socket = null;
        try {
        	socket = new Socket("localhost", 10000);
        } catch (UnknownHostException e) {
            System.err.println("Don't know about host: localhost");
            System.exit(1);
        }
        */
        CS = new ClientSocket(port);
        CS.sendData("LOL");
        
        //socket.close();
	}

}
