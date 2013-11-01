import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.net.*;



public class Airdron1 {
	public Airdron1()
	{
		try{
			 byte [] bytes = new byte[128];
			DatagramSocket ds = new DatagramSocket();
			String answer = "Hello world";
			
			bytes=answer.getBytes();
			DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
			
			InetAddress addr = InetAddress.getByName("147.9.57.123");
			ds.connect(addr, 135);
			ds.send(dp);
		
             
             
		}catch(Exception e){ e.printStackTrace(); }
	}
	public static void main(String[] args) 
	{
		Airdron1 one = new Airdron1();
	}

}
