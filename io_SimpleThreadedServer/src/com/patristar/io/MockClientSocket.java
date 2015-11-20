package com.patristar.io;

import java.io.IOException;
import java.net.Socket;
/**
 * pressure the socket
 * @author hsiaopojen
 *
 */
public class MockClientSocket {
	public static void main(String[] args) {
		for (int i = 0; i < 5000; i++) {
			try {
				new Socket("localhost",8080);
				System.out.println("socket-"+i);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
