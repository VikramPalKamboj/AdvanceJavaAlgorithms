package BFSWebCrawler;

public class App {

	public static void main(String[] args) {

		WebCrawler webCrawler=new WebCrawler();
		String rootUrl="http://www.bbc.com/";
		webCrawler.discoverWeb(rootUrl);
	}

}
