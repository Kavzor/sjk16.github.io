package com.jensen.socialDemo.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.jensen.socialDemo.model.EntryStream;

public class Application extends ServerSocket {
	//Server konstanter
	private static final int PORT_NUMBER = 40000;
	private static final int CLIENT_TIMEOUT = 15000;
	
	//Server socket har ingen no-arg konstruktor, därav implmenterar vi ServerSocket(int port)
	public Application(int port) throws IOException {
		super(port);
	}
	
	
	public static void main(String[] args) throws IOException{
		//Skapar upp servern på port PORT_NUMBER
		Application application = new Application(PORT_NUMBER);
	
		//Kör tills fel kastas eller programmet stängs av utifrån
		while(true) {
			System.out.println("Waiting for connection..");
			//Väntar på en anslutning
			Socket client = application.accept();
			
			//Stänger ner resursen efter CLIENT_TIMEOUT tid
			//client.setSoTimeout(CLIENT_TIMEOUT);
			
			//Processera (data) anslutningen från klienten
			application.processRequest(client);
		}
	}
	
	public void processRequest(Socket socket) throws IOException {
		System.out.println("Processing request");
		
		EntryStream stream = new EntryStream(socket.getInputStream());
		Thread loggerThread = new Thread(stream);
		loggerThread.start();
	}
}
