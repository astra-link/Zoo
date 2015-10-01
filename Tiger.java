public class Tiger {
	static int id;
	private String name;
	private double ves;
	Tiger(String name, float ves){
		id++;
		this.name=name;
		this.ves=ves;				
	};
	public String toString(){
		return "Тигр [ id "+this.getId()+", зовут "+this.name+", весит "+this.ves+" кг ]";
	}
	
	int getId(){return id;}
	
	
	void eatDog(Dog foodDog){
		//System.out.println(this.name+this.getVes());
		this.ves=this.ves+foodDog.getVes();
		System.out.println(this.name+" eating... "+foodDog.getName()+" ves = "+foodDog.getVes());
		
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
		System.out.println(name+" Zzz... Roar...");
	}
	void speak(String word){
		System.out.println(name+" says "+word+" Rrrooarrr!!!");
	}
}
