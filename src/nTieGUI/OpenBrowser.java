package nTieGUI;

import javax.swing.*;

import java.awt.Desktop;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.concurrent.ThreadLocalRandom;

public class OpenBrowser {
	public static void openURL(String url)
			throws Exception
	{
		int min = 1;
		int max = 389605;
	    String openURL = "https://nhentai.net/g/"+url;
		if(url.isEmpty()) {
	    	   int numb = ThreadLocalRandom.current().nextInt(min, max + 1);
	    	   //System.out.println(numb);
	    	   openURL = "https://nhentai.net/g/"+numb;
	    	   }
		//System.out.println(openURL);
		Desktop desk = Desktop.getDesktop();
		desk.browse(new URI(openURL));
		}
	}