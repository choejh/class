//1028 -1
package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLconnectionTest {

	public static void main(String[] args) {
		
		
		
		try {
			String urlPath = "http://www.ctware.net";
			URL url = new URL(urlPath);
		// URLConnection �ν��Ͻ� 	
			URLConnection conn = url.openConnection();
		// ����� ���� (�ڿ�)�� ���� ��Ʈ�� ����
			BufferedReader in = null;
			
		// URLConnection �ν��Ͻ����� InputStream�� ���� �� �ִ�.
			InputStream is = conn.getInputStream(); 
			
			Reader reader = new InputStreamReader(is);
			
			in = new BufferedReader(reader);
			
			// �� �پ� �о�� �ӽ� ����
			String str = null;
			
			while(true) {
				str = in.readLine();
				if(str==null) {
				break; 
			}
				System.out.println(str);
			}

				
				
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
