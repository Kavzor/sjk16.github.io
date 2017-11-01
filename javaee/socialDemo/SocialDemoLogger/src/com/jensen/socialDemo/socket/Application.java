package com.jensen.socialDemo.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import com.jensen.socialDemo.model.EntryStream;

public class Application extends ServerSocket {
	//Server konstanter
	private static final int PORT_NUMBER = 40000;
	private static final int CLIENT_TIMEOUT = 15000;
	
	//Server socket har ingen no-arg konstruktor, d�rav implmenterar vi ServerSocket(int port)
	public Application(int port) throws IOException {
		super(port);
	}
	
	
	public static void main(String[] args) throws IOException{
		//Skapar upp servern p� port PORT_NUMBER
		Application application = new Application(PORT_NUMBER);
	
		//K�r tills fel kastas eller programmet st�ngs av utifr�n
		while(true) {
			System.out.println("Waiting for connection..");
			//V�ntar p� en anslutning
			Socket client = application.accept();
			
			//St�nger ner resursen efter CLIENT_TIMEOUT tid
			//client.setSoTimeout(CLIENT_TIMEOUT);
			
			//Processera (data) anslutningen fr�n klienten
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
