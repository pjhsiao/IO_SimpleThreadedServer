package com.patristar.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * multithread practical 
 * @author hsiaopojen
 *
 */
public class RunSocketThread extends Thread {
	Socket s;
	public RunSocketThread(Socket _s) {
		this.s = _s;
	}
	@Override
	public void run() {
		super.run();
		
//		System.out.println("connection from "+ s );
		try(InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream()
			){
				int data;
				while( (data = in.read())!=-1){
					data = Util.transmogrify(data);
					out.write(data);
				}
			}catch (IOException ioe){
				System.err.println("connection a problem -"+ ioe);
			}
	}
}
