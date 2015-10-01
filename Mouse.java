
public class Mouse {
	static int id;
	private String name;
	private double ves;
	Mouse(String name, double ves){
		id++;
		this.name=name;
		this.ves=ves;				
	};
	
	public String toString(){
		return "Мышь [ id "+this.getId()+", зовут "+this.name+", весит "+this.ves+" кг ]";
	}
	int getId(){return id;}
	
	void setVes(int ves){this.ves=ves;}
	double getVes(){return this.ves;}
	
	void setName(String name){this.name=name;}
	String getName(){return this.name;}
	
	void eat(double food){
		this.ves=this.ves+food;
		System.out.println(this.name + " eating "+food+" кг");
	}
	
	void sleep(){
		System.out.println(name+" Zzzz... pipipi...");
	}
	void speak(String word){
		System.out.println(name+" says "+word+" squeek...");
	}
}
