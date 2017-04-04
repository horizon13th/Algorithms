package Tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Geoencoding {
	public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//		Scanner sc = new Scanner(System.in);
//		String testURL = sc.nextLine();
//		System.out.println(sc.nextLine());
//		System.out.println(callURL(testURL));
		
	      
//		String temp, lon, lat;
//		for(int i=0; i<strList.size();i++){
//			 temp = callURL(strList.get(i));
//			 lon = (temp.substring(temp.lastIndexOf("lng\":")+5,temp.lastIndexOf("lng\":")+18)+", ");
//			 lat = (temp.substring(temp.lastIndexOf("lat\":")+5,temp.lastIndexOf("lat\":")+18)+"");
//			sb.append(lon+lat);
//			sb.append(System.getProperty("line.separator"));
//			System.out.println(i);
//		}
//		writeFile(sb.toString());


    }
	 public static void writeFile(String newLine)
     {
             String fileName="src/Tools/addressoutput.txt";
             try
             {
                     BufferedWriter out=new BufferedWriter(new FileWriter(fileName));
                     //out.newLine();  
                     out.write(newLine);            
                     //out.write("  My name is coolszy!\n");
                     out.close();
             } catch (IOException e)
             {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
             }
     }
	public static String callURL(String address) {
		String api = "http://api.map.baidu.com/geocoder/v2/?address=";
		String output = "output=json";
		String ak = "ak=tRaPVvQBfenKitpG0CbIhKcv";
		String callback = "callback=showLocation";
		String myURL = api+address+"&"+output+"&"+ak+"&"+callback;
		//System.out.println("Requeted URL:" + myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		try {
			URL url = new URL(myURL);
			urlConn = url.openConnection();
			if (urlConn != null)
				urlConn.setReadTimeout(60 * 1000);
			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(),
						Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
		in.close();
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:"+ myURL, e);
		} 
		return sb.toString();
	}
	public static List<String> readFileByLines(String fileName) {
		List<String> strList = new ArrayList<String>();
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                //System.out.println("line " + line + ": " + tempString);
                strList.add(tempString);
                line++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return strList;
    }
	
}
