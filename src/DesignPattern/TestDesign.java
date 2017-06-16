package DesignPattern;

public class TestDesign {
	public static void main(String[] args){
		System.out.println("===Singleton Test===");
		Singleton s;
		
		s = Singleton.getInstance("1");
		System.out.println(" 1: "+s.getName(s));
		
		s = Singleton.getInstance("2");
		System.out.println(" 2: "+s.getName(s));
		
		System.out.println("===Singleton Test===");
	}
	
}
