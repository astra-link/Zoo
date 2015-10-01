
public class Cat {
	static int id;
	private String name;
	private double ves;
	Cat(String name, float ves){
		id++;
		this.name=name;
		this.ves=ves;				
	};
	
	public String toString(){
		return "Кот [ id "+this.getId()+", зовут "+this.name+", весит "+this.ves+" кг ]";
	}
	
	int getId(){return id;}
	
	void eatMouse(Mouse foodMouse) {
		this.ves=this.ves+foodMouse.getVes();
		System.out.println(name+" съел "+foodMouse.getName()+" весом "+foodMouse.getVes()+" кг");
	}
	void setVes(int ves){this.ves=ves;}
	double getVes(){return this.ves;}
	
	void setName(String name){this.name=name;}
	String getName(){return this.name;}
	
	void sleep(){
		System.out.println(name+" Zzzz...");
	}
	void speak(String word){
		System.out.println(name+" says "+word+" meow...");
	}
}
