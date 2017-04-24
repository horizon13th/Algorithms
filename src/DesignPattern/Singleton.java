package DesignPattern;

public class Singleton {

	private static Singleton s;
	private String name;
	
	private Singleton(String SinName){
		this.name = SinName;
	}
	public String getName(Singleton s){
		return s.name;
	}
	public static Singleton getInstance(String SinName){
		if(s==null){
			s= new Singleton(SinName);
		}
		return s;
	}
}
