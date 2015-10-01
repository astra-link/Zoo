public class Dog {
	static int id;
	private String name;
	private double ves;
	Dog(String name, float ves){
		id++;
		this.name=name;
		this.ves=ves;				
	};
	public String toString(){
		return "Пёс [ id "+this.getId()+", зовут "+this.name+", весит "+this.ves+" кг ]";
	}
	
	int getId(){return id;}
	
	void eat(int food) {
		this.ves=this.ves+food;
		System.out.println(name+" eating "+food);
	}
	void eatCat(Cat foodCat){
		//System.out.println(this.name+this.getVes());
		this.ves=this.ves+foodCat.getVes();
		System.out.println(this.name+" eating... "+foodCat.getName()+" ves = "+foodCat.getVes());
		
	}
	void setVes(int ves){
		this.ves=ves;
	}
	double getVes(){
		return this.ves;
	}
	void setName(String name){
		this.name=name;
	}
	String getName(){
		return this.name;
	}
	void sleep(){
		System.out.println(name+" Rrrr...");
	}
	void speak(String word){
		System.out.println(name+" says "+word+" Wof!!!");
	}
}
