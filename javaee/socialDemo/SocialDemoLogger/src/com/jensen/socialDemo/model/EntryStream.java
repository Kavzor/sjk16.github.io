package com.jensen.socialDemo.model;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class EntryStream extends DataInputStream implements Runnable {

	//Skapar upp en DataInputStream från socket streamen
	public EntryStream(InputStream stream) {
		super(stream);
	}
	
	@Override
	public void run() {
		try {
			Logger.getInstance().addEntry(readEntry());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Läser av en fixd längd av streamen
	public String readEntry() throws IOException{
		//this refererar till DataInputStream objektet där vår inputstream finns
		return this.readUTF();
	}

}
