package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class TCPIPMultiChatServer {
	//���� ����� ������ ���� : �޽����� ��ü���� ���������ؼ�
	//�������� : name, OutputStream
	//Map<String,Object>
	HashMap<String, Object> clients;
	
	public TCPIPMultiChatServer() {
		clients = new HashMap<String, Object>();
		Collections.synchronizedMap(clients);	//������ ����ȭ�� �����ϰ� ����ϵ��� ���ִ� �޼���
	}
		
	
	public void start() throws IOException {
		// ServerSocket ����
		// ������� ��û�� ������ Socket �����ؼ� 
		// ���� -> clients ����� ������ ���� ������� ó��
		
		//�������� ����
		ServerSocket serverSocket = new ServerSocket(7777);
		System.out.println("Chatting Server Start...!!!!!!!");
		
		Socket socket = null;
		
		while(true) {
			
		//��û�� ���� ������ ���... ��û�� ������ ���ο� Socket �����ؼ� ��ȯ 
		socket = serverSocket.accept();
		//map�� ��������, ������ ����ڵ鿡�� �޽����� ����
		
		System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]");	
		
		ServerReceiver receiver = new ServerReceiver(socket);
		receiver.start();
		}
		
		
	}

	
	void sendToAll(String msg) {
		//�ϰ�ó��, Map�� ������ ����. -> map key -> Set
		Set<String> keys = clients.keySet();
		
		Iterator<String> itr = keys.iterator();
		
		while(itr.hasNext()) {
			DataOutputStream out = (DataOutputStream) clients.get(itr.next());
			try {
				out.writeUTF(msg);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
	//���� Ŭ���� : ������ �޾ ����, �޽��� ��ü �߼�
	private class ServerReceiver extends Thread {
		//Socket, InputStream, OutputStream
		Socket socket;
		DataOutputStream out;
		DataInputStream in;
		
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			
			String name =null; //������ ������� �̸�
			try {
				name = in .readUTF(); 	//�̸��� ��Ʈ���� ���� �޴´�.
				clients.put(name, out); //map�� ����� ���� ����
				sendToAll(">>>>>>>>>>" + name + "���� ��������"); //���� Ŭ���������� �ƿ��� Ŭ������ ����� ������ �� �ִ�.
				
				while(in != null) {
					sendToAll(in.readUTF());
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				clients.remove(name);
				System.out.println(name+"���� �����̽��ϴ�.");
			}
			
		}
		
		
	}
	
	public static void main(String[] args) {
		try {
			new TCPIPMultiChatServer().start();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
}
