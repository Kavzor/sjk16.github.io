package com.jensen.socialDemo.clientTest;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSocket {

	//Port nummret till servern
	private static final int PORT_NUMBER = 40000;
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		//Öppnar upp en ny socket till servern
		Socket socket = new Socket("localhost", PORT_NUMBER);

		DataOutputStream out = new DataOutputStream(socket.getOutputStream());
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Data: ");
		String data = scan.nextLine();
		
		out.writeUTF(data);
		
	}

}
