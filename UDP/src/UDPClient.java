import java.net.*;
import java.io.*;
import java.lang.reflect.Array;

public class UDPClient {
	/**
	 * @param args
	 */
	public static void main(String[] data) {
		DatagramSocket aSocket = null;
		
		try {
			aSocket = new DatagramSocket();
			byte[] m = data[0].getBytes();
			InetAddress aHost = InetAddress.getByName(data[1]);
			
			int serverPort = 0;
			if (data[2].isEmpty()){
				serverPort = 8889;
			} else {
				serverPort = Integer.parseInt(data[2]);
			}
			
			DatagramPacket request = new DatagramPacket(m, m.length, aHost, serverPort);
			aSocket.send(request);

			byte[] buffer = new byte[1000];
			System.out.println(serverPort);
			DatagramPacket reply = new DatagramPacket(buffer, buffer.length);
			aSocket.receive(reply);
			System.out.println("Reply: " + new String(reply.getData()));
			
		} catch (SocketException e) {
			System.out.println("Socket: " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IO: " + e.getMessage());
		} finally {
			if (aSocket != null)
				aSocket.close();
		}
	}
}