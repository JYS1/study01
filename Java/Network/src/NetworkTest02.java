import java.net.*;

public class NetworkTest02 {

	public static void main(String[] args) throws Exception, MalformedURLException{
		// TODO Auto-generated method stub
		URL u = new URL(args[ 0 ]);	//인수 
		System.out.println("URL Class-----");
		System.out.println("protocol : " + u.getProtocol());
		System.out.println("port : " + u.getPort());	//-1 : 정의 안되어있음.
		System.out.println("host : " + u.getHost());
		System.out.println("file(path포함) : " + u.getFile());
		System.out.println("URL : " + u.toExternalForm());
		
		System.out.println("URLConnection Class-----");
		URLConnection uc = u.openConnection();
		int len = uc.getContentLength();
		System.out.println("document length : " + len + " btye");
		URL uu = uc.getURL();
		System.out.println("URL : " + uu);
		
	}

}
