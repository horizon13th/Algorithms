package Tools;

import java.io.IOException;
import java.util.List;
import java.util.Map;
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Dataprocess {
	public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
//		Scanner sc = new Scanner(System.in);
//		String testURL = sc.nextLine();
//		System.out.println(sc.nextLine());
//		System.out.println(callURL(testURL));
		List<String> strList = readFileByLines("src/Tools/1000i.csv");
		StringBuffer sb = new StringBuffer();
		HashMap<String,Integer> hm = new HashMap();
		String temp, k, v;
		
		for(int i=0; i<strList.size();i++){
			temp = strList.get(i);
			String[] nkv = temp.split(",");
			k=nkv[2];
			v=nkv[1];
			if(hm.containsKey(k)){
				hm.put(k, hm.get(k)+Integer.parseInt(v));
			}
			else{
				hm.put(k, Integer.parseInt(v));
			}
			System.out.println(k+" "+hm.get(k));
		}
		
		//print hm
		Set set = hm.entrySet();
	      
	      // Get an iterator
	      Iterator i = set.iterator();
	      
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ",");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
		


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
