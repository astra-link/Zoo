
public class ZooPark {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to BloodyZoo");

		Mouse micky = new Mouse("Micky",0.15);
		System.out.println(micky);
		micky.eat(0.05);
		micky.sleep();
		micky.speak("Nice day!");
		System.out.println(micky);
		System.out.println("----------------------");
		Mouse minni= new Mouse("Minni",0.1);
		System.out.println(minni);
		minni.eat(0.03);
		minni.sleep();
		minni.speak("I'm a mouse!");
		System.out.println(minni);
		System.out.println("-----------Cats-----------");
		Cat vaska = new Cat("Vasiliy",7);
		System.out.println(vaska);
		vaska.eatMouse(micky);
		vaska.sleep();
		vaska.speak("Hello World! :/)");
		System.out.println(vaska);
		System.out.println("----------------------");
		Cat barsik = new Cat("Barsishvili",10);// object Cat ekzemplar vaska = noviy objekt (noviy kot) vaska.
		System.out.println(barsik);
		barsik.eatMouse(minni);
		barsik.sleep();
		barsik.speak("Welcome");
		System.out.println(barsik);
		
		System.out.println("------Dogs--------");
		
		Dog tuzik = new Dog("Tuzenbobel",30);
		System.out.println(tuzik);
		tuzik.eatCat(vaska);
		
		tuzik.sleep();
		tuzik.speak("I'm hungry");
		System.out.println(tuzik);
		System.out.println("--------------");
		
		Dog sharik = new Dog("Sharikus",25);
		System.out.println(sharik);
		sharik.eatCat(barsik);
		sharik.sleep();
		sharik.speak("Where is the ball?");
		System.out.println(sharik);
		System.out.println("------Tiger--------");
		Tiger sherkhan = new Tiger("Sherkhan",160);
		System.out.println(sherkhan);
		sherkhan.eatDog(tuzik);
		sherkhan.eatDog(sharik);
		sherkhan.sleep();
		sherkhan.speak("Where is Maugli?");
		System.out.println(sherkhan);
	}

}
