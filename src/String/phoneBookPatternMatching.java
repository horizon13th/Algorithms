package String;

public class phoneBookPatternMatching {
	public static void main(String[] args){
		String[] arr = {
				"/front-end/controller/logout.java",
				"/front-end/controller/verify.java",
				"/front-end/template/login.html",
				"/front-end/template/logout.html",
				"/front-end/template/verify.html",
				"/back-end/controller/login.java ", 
				"/back-end/controller/logout.java",
				"/back-end/controller/verify.java"};
		String pattern = "login";
		for(int i=0; i<arr.length; i++){
			System.out.println(matching(arr[i], pattern));
		}
	}
	public static boolean matching(String path, String pattern){
		//corner case
		if(path.length()==0 && pattern.length()!=0)
			return false;
		
		//recursive until pattern is a null string
		if(pattern.length()==0)
			return true;
		
		//forloop to check path string
		//if matching is found, build substring
		//if matching not found, return false
		for(int i=0; i<path.length(); i++){
			if(path.charAt(i)==pattern.charAt(0)){
				String newPath = path.substring(i+1);
				String newPattern = pattern.substring(1);
				return matching(newPath, newPattern);
			}
		}
		return false;
	}
}
