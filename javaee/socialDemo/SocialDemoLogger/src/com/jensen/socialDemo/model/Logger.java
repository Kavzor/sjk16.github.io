package com.jensen.socialDemo.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
	
	//Singleton objektet beh�ver en instans av sig sj�lv
	private static Logger instance;
	
	//V�r log fil
	private File file;
	
	//En nyckel s� att vi inte skapar flera instanser av Logger
	private static Object instanceLock = new Object();
	
	//Ser till s� att vi inte skriver �ver inneh�llet i txt filen
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
	
	//Sync:ar blocket f�r att undvika s� att flera tr�dar skriver till filen samtidigt
	public synchronized void addEntry(String entry) {
		System.out.println("Adding entry: " + entry);
		
		//Skapar upp en fileWriter till filen och s�tter den till att f�rl�nga, inte skriva �ver
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, APPEND_FILE))){
			writer.write(entry + "\n");
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
