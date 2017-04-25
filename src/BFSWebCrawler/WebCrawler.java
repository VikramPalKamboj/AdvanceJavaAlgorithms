package BFSWebCrawler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCrawler {

	public Queue<String> queue;
	public List<String> discoveredWebSiteList;
	
	public WebCrawler(){
		this.queue=new LinkedList<>();
		this.discoveredWebSiteList=new ArrayList<>();
	}
	
	
	
	public void discoverWeb(String root){
		this.queue.add(root);
		this.discoveredWebSiteList.add(root);
		
		while(!queue.isEmpty()){
		
			String v=this.queue.remove();
			String rawHTML=readURL(v);
			
			String regex="http://(\\w+\\.)*(\\w+)";
			Pattern pattern=Pattern.compile(regex);
			Matcher matcher=pattern.matcher(rawHTML);
			
			while(matcher.find()){
				String actualUrl=matcher.group();
				
				if (!discoveredWebSiteList.contains(actualUrl)) {
					discoveredWebSiteList.add(actualUrl);
					System.out.println("Website has been found with URL"+actualUrl);
					queue.add(actualUrl);
				}
				
			}
		}
	}

	
	
	private String readURL(String v) {
		String rawHTML="";
		try {
			URL url=new URL(v);
			BufferedReader in=new BufferedReader(new InputStreamReader(url.openStream()));
			
			String inputLine="";
			
			while ((inputLine=in.readLine())!=null) {
				rawHTML+=inputLine;
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rawHTML;
	}
	
	
}
