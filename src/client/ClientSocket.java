package client;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientSocket {
	private Socket socket;
	private BufferedReader in = null;
	private DataOutputStream out = null;
	
	//private ObjectOutputStream outStream;
	//private ObjectInputStream inStream;
	
	public ClientSocket(int port)
	{
		try {
			socket = new Socket("localhost", port);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out = new DataOutputStream(socket.getOutputStream());
		} catch (IOException e) {
			System.err.println("Fuckup");
		}
	}
	
	public void sendData(String text)
	{
		try {
			out.writeChars(text);
		} catch (IOException e) {
			System.err.println("Fuckup");
		}
	}
	
	/* TODO public void sendData(Object object)
	{
		
	} */
}
