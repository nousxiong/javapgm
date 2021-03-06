/* Example of a basic UDP receiver sans selector.
 */
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class udpsend
{
	String group = "239.192.0.1";
	int port = 7500;

	public udpsend (String args[]) throws IOException
	{
		InetAddress group = InetAddress.getByName (this.group);
		MulticastSocket socket = new MulticastSocket();

		String msg = "i am a banana!";
		DatagramPacket packet = new DatagramPacket (msg.getBytes(), msg.length(), group, port);
		socket.send (packet);
		socket.close();
	}

	public static void main (String args[]) throws IOException
	{
		new udpsend (args);
	}
}

/* eof */