package Tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class odCheck {
	
	public static void main(String[] args){
		HashMap<String,String> input = setInputData();
		check(input);
	}
	
	public static void check(HashMap<String,String> input){
		HashMap<String,HashMap<String,List<String>>> testData = setTestData();
		Hashtable<String, String> condition = new Hashtable<String, String>();
		HashMap<String, List<String>> output = new HashMap<String,List<String>>();
		//HashTable do not allow null value
		
		//Scan all the input: condition<known, known>, output<known, unknown>
		for(String k:input.keySet()){
			if(!input.get(k).isEmpty()){
				condition.put(k, input.get(k));
			}
			else{
				output.put(k, null);
			}
		}
		
		//Scan all the conditions
		for(String conditionk:condition.keySet()){
			//Scan all the DB data
			for(HashMap<String,List<String>> cvlist :testData.values()){
				for(String c: cvlist.keySet()){
					if(conditionk.equals(c)&&cvlist.get(c).contains(c)){
						
					}
				}
			}
		}
		
		
	}
	
	public static HashMap<String,String> setInputData(){
		HashMap<String,String> testData1 = new HashMap<String,String>();
		HashMap<String,String> testData2 = new HashMap<String,String>();
		HashMap<String,String> testData3 = new HashMap<String,String>();
		
		testData1.put("C1", "V1");
		testData1.put("C2", null);
		testData1.put("C3", null);
		testData1.put("C4", null);
	
		testData2.put("C1", "V2");
		testData2.put("C2", "V4");
		testData2.put("C3", null);
		testData2.put("C4", null);
		
		testData3.put("C1", null);
		testData3.put("C2", null);
		testData3.put("C3", null);
		testData3.put("C4", "V6");

		
		return testData1;
	}
	
	public static HashMap<String,HashMap<String,List<String>>> setTestData(){
		HashMap<String,HashMap<String,List<String>>> testData = new HashMap<String,HashMap<String,List<String>>>();
		HashMap<String, List<String>> CVlist = new HashMap<String, List<String>>();
		List<String> listValue = new ArrayList<String>();
		
		listValue.add("V1");
		CVlist.put("C1", new ArrayList<String>(listValue));
		testData.put("T1-001", new HashMap<String, List<String>>(CVlist));
		listValue.clear();
		CVlist.clear();

		listValue.add("V3");
		CVlist.put("C2", new ArrayList<String>(listValue));
		testData.put("T1-001", new HashMap<String, List<String>>(CVlist));
		listValue.clear();
		CVlist.clear();
		
		listValue.add("V2");
		CVlist.put("C1", new ArrayList<String>(listValue));
		testData.put("T1-002", new HashMap<String, List<String>>(CVlist));
		listValue.clear();
		CVlist.clear();
		
		listValue.add("V4");
		CVlist.put("C2", new ArrayList<String>(listValue));
		testData.put("T1-002", new HashMap<String, List<String>>(CVlist));
		listValue.clear();
		CVlist.clear();
		
		listValue.add("V1");
		CVlist.put("C1", new ArrayList<String>(listValue));
		testData.put("T2-001", new HashMap<String, List<String>>(CVlist));
		listValue.clear();
		CVlist.clear();
		
		listValue.add("V5");
		CVlist.put("C3", new ArrayList<String>(listValue));
		testData.put("T2-001", new HashMap<String, List<String>>(CVlist));
		listValue.clear();
		CVlist.clear();
		
		listValue.add("V6");
		CVlist.put("C4", new ArrayList<String>(listValue));
		testData.put("T2-001", new HashMap<String, List<String>>(CVlist));
		listValue.clear();
		CVlist.clear();
		
		listValue.add("V2");
		CVlist.put("C1", new ArrayList<String>(listValue));
		testData.put("T2-002", new HashMap<String, List<String>>(CVlist));
		listValue.clear();
		CVlist.clear();
		
		listValue.add("V5");
		CVlist.put("C3", new ArrayList<String>(listValue));
		testData.put("T2-002", new HashMap<String, List<String>>(CVlist));
		listValue.clear();
		CVlist.clear();
		
		listValue.add("V5");
		listValue.add("V7");
		CVlist.put("C4", new ArrayList<String>(listValue));
		testData.put("T2-002", new HashMap<String, List<String>>(CVlist));
		listValue.clear();
		CVlist.clear();

		return testData;
	}
}
