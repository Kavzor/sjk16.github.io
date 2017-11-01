package com.jensen.socialDemo.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
	
	//Singleton objektet behöver en instans av sig själv
	private static Logger instance;
	
	//Vår log fil
	private File file;
	
	//En nyckel så att vi inte skapar flera instanser av Logger
	private static Object instanceLock = new Object();
	
	//Ser till så att vi inte skriver över innehållet i txt filen
	private static final boolean APPEND_FILE = true;
	
	private Logger() {
		file = new File("log.txt");
	}
	
	public static Logger getInstance() {
		synchronized (instanceLock) {
			if(instance == null) {
				instance = new Logger();
			}
		}
		return instance;
	}
	
	//Sync:ar blocket för att undvika så att flera trådar skriver till filen samtidigt
	public synchronized void addEntry(String entry) {
		System.out.println("Adding entry: " + entry);
		
		//Skapar upp en fileWriter till filen och sätter den till att förlänga, inte skriva över
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, APPEND_FILE))){
			writer.write(entry + "\n");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
