package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPIPMultiChatClient {

	public static void main(String[] args) {
		

		// Socket ����
		try {
			String serverIp = "192.168.0.24"; //localhost -> ȣ��Ʈ �ڽ��� �ּ�
			// Socket ����
			Socket socket = new Socket(serverIp, 7777); //���������� ������ 7777�� ��Ʈ�� ����
			
			//�޽����� �޴� ������
			Thread receiver = new ClientReciever(socket);
			//�޽����� ������ ������
			Thread sender = new ClientSenderThread(socket, "�����");

			sender.start();
			receiver.start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}

class ClientSenderThread extends Thread{
	
	//������ ������� Socket, OutPutStream, name
	Socket socket;
	DataOutputStream out;
	String name;
	
	public ClientSenderThread(Socket s, String name) {
		this.socket =s;
	try {	
		out = new DataOutputStream(s.getOutputStream());
		this.name = name;
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
		//�����ϸ� �ٷ� �̸��� ������ ����
		if(out != null) {
			out.writeUTF(name);
		}
	
		while(out!=null) {
			out.writeUTF("["+name+"]"+ sc.nextLine());
		}
		
	} catch(IOException e) {
		
	}

	}
}


class ClientReciever extends Thread {
	// �޽����� �޾Ƽ� �ֿܼ� ���
	// Socket, InputStream
	Socket socket;
	DataInputStream in;
	
	public ClientReciever(Socket socket) {
		this.socket =socket;
		
		try {
			in = new DataInputStream(socket.getInputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void run() {
		while(in != null) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
