package com.patristar.io;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * server side of socket with thread pool
 * @author hsiaopojen
 *
 */
public class SimpleThreadedServer {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 * run and terminate >>> telnet loaclhost 8080
	 */
	public static void main(String... args) throws IOException {
		ServerSocket ss = new ServerSocket(8080);
		ExecutorService pool = Executors.newFixedThreadPool(1000);
		
		while(true){
			Socket _s = ss.accept();
			pool.submit(new RunSocketThread(_s));
		}
	}
}
